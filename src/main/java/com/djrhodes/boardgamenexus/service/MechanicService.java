package com.djrhodes.boardgamenexus.service;

import com.djrhodes.boardgamenexus.model.Mechanic;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Mechanic Service class
 */
@Service
public class MechanicService {

    /** The Rest Template */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * Default Constructor for Spring injection
     */
    public MechanicService() {
    }

    /**
     * Sets the names for each of the Mechanics in the list
     * @param mechanics
     * @return New List of Mechanics
     */
    public List<Mechanic> setMechanicsNames(List<Mechanic> mechanics) {
        List<Mechanic> updatedMechanics = new ArrayList<>();

        for (Mechanic mechanic : mechanics) {
            try {
                Mechanic updatedMechanic = findByID(mechanic.getId());
                if (updatedMechanic != null) {
                    updatedMechanics.add(updatedMechanic);
                }
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }

        return updatedMechanics;
    }

    /**
     * Finds a specific Mechanics based on its ID
     * @param id
     * @return The Mechanic
     * @throws JsonProcessingException
     */
    public Mechanic findByID(String id) throws JsonProcessingException {
        String apiUrl = "https://api.boardgameatlas.com/api/game/mechanics?client_id=cVvqX5AnsC";
        String json = restTemplate.getForObject(apiUrl, String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);
        JsonNode mechanicsNode = root.get("mechanics");

        for (JsonNode mech : mechanicsNode) {
            if (mech != null && mech.get("id").asText().equals(id)) {
                return mapper.convertValue(mech, Mechanic.class);
            }
        }

        return null;
    }
}
