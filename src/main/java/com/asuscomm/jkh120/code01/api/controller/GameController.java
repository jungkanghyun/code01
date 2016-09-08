package com.asuscomm.jkh120.code01.api.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asuscomm.jkh120.code01.api.domain.Game;
import com.asuscomm.jkh120.code01.api.service.GameService;

@RestController
public class GameController {

	@Autowired
	private GameService gameService;
	
	@RequestMapping(value = "game/{id}", method = GET)
	public Game findOne(@PathVariable("id") Long id) {
		return gameService.findOne(id);
	}
	
	@RequestMapping(value = "game/date/{date}", method = GET)
	public List<Game> findByGameDate(@PathVariable("date") String date) {
		return gameService.findByGameDate(date);
	}
}
