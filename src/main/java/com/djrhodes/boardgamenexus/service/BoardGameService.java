package com.djrhodes.boardgamenexus.service;

import com.djrhodes.boardgamenexus.model.BoardGame;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

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
    /** The Category Service */
    @Autowired
    private CategoryService categoryService;

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
            /** Adds Names to each of the Categories in the list */
            boardGame.setCategories(categoryService.setCategoryNames(boardGame.getCategories()));
            /** Adds Names to each of the Mechanics in the list */
            boardGame.setMechanics(mechanicService.setMechanicsNames(boardGame.getMechanics()));

            return boardGame;
        }

        return null;
    }

    /**
     * Gets the current 5 most popular board games
     * @return List of Board Games
     * @throws JsonProcessingException
     */
    public List<BoardGame> getPopular() throws JsonProcessingException {
        String apiUrl = "https://api.boardgameatlas.com/api/search?limit=5&order_by=rank&client_id=cVvqX5AnsC";
        String json = restTemplate.getForObject(apiUrl, String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);
        JsonNode gamesNode = root.get("games");

        List<BoardGame> popularGames = new ArrayList<>();

        if (gamesNode != null && gamesNode.isArray() && gamesNode.size() > 0) {
            for(int i = 0; i < gamesNode.size(); i ++) {
                JsonNode gameNode = gamesNode.get(i);
                BoardGame boardGame = mapper.readValue(gameNode.toString(), BoardGame.class);

                popularGames.add(boardGame);
            }
            return  popularGames;
        }
        return null;
    }
}
