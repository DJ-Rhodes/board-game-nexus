package com.djrhodes.boardgamenexus.controller;

import com.djrhodes.boardgamenexus.model.BoardGame;
import com.djrhodes.boardgamenexus.service.BoardGameService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Controller for Board Game
 */
@RestController
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
}
