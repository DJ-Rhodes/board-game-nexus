package com.djrhodes.boardgamenexus.controller;

import com.djrhodes.boardgamenexus.model.BoardGame;
import com.djrhodes.boardgamenexus.service.BoardGameService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rest Controller for Board Game
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/boardgame")
public class BoardGameController {

    /**
     * The Board Game Service
     */
    private BoardGameService boardGameService;

    /**
     * Constructor for Spring injection
     * @param boardGameService
     */
    public BoardGameController(BoardGameService boardGameService) {
        this.boardGameService = boardGameService;
    }

    /**
     * Get Mapping for retrieving a Board Game by its name
     * @param name
     * @return Board Game
     * @throws JsonProcessingException
     */
    @GetMapping("/{boardGameName}")
    public BoardGame getBoardGameByName(@PathVariable("boardGameName") String name) throws JsonProcessingException {
        return boardGameService.getBoardGameByName(name);
    }

    /**
     * Get Mapping for retrieving the current most popular board games
     * @return Board Games List
     * @throws JsonProcessingException
     */
    @GetMapping("/popular")
    public List<BoardGame> getPopular() throws JsonProcessingException {
        return boardGameService.getPopular();
    }
}
