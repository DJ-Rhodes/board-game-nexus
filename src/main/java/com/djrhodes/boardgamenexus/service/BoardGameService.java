package com.djrhodes.boardgamenexus.service;

import com.djrhodes.boardgamenexus.model.BoardGame;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Service for Board Games
 */
@Service
public class BoardGameService {

    /** The Rest Template */
    @Autowired
    private RestTemplate restTemplate;
    /** The Mechanic Service */
    @Autowired
    private MechanicService mechanicService;

    /**
     * Default Constructor
     */
    public BoardGameService() {
    }

    /**
     * Retrieves a Board Game by its name
     * @param name
     * @return Board Game
     * @throws JsonProcessingException
     */
    public BoardGame getBoardGameByName(String name) throws JsonProcessingException {
        String apiUrl = "https://api.boardgameatlas.com/api/search?name=" + name + "&limit=1&client_id=cVvqX5AnsC";
        String json = restTemplate.getForObject(apiUrl, String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);
        JsonNode gamesNode = root.get("games");

        /**
         * Retrieves only the first entity is the JSON
         */
        if (gamesNode != null && gamesNode.isArray() && gamesNode.size() > 0) {
            JsonNode gameNode = gamesNode.get(0);
            BoardGame boardGame = mapper.readValue(gameNode.toString(), BoardGame.class);
            //TODO: Add List of Categories to the Board Game

            /** Adds Names to each of the Mechanics in the list */
            boardGame.setMechanics(mechanicService.setMechanicsNames(boardGame.getMechanics()));

            return boardGame;
        }

        return null;
    }
}
