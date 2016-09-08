package com.asuscomm.jkh120.code01.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asuscomm.jkh120.code01.api.domain.Game;
import com.asuscomm.jkh120.code01.api.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public Game findOne(Long id) {
		return gameRepository.findOne(id);
	}
	
	public List<Game> findByGameDate(String date) {
		return gameRepository.findByGameDate(date);
	}
}
