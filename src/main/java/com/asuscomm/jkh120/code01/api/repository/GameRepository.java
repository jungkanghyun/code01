package com.asuscomm.jkh120.code01.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asuscomm.jkh120.code01.api.domain.Game;


@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

	public List<Game> findByGameDate(String date);
}
