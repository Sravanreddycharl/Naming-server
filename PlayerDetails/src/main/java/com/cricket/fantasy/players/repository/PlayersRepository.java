package com.cricket.fantasy.players.repository;

import org.springframework.data.repository.CrudRepository;

import com.cricket.fantasy.players.Players;

public interface PlayersRepository extends CrudRepository<Players, Long>{
	
	Players findByPlayerTeamAndPlayerName(String player_Team, String player_Name);

}
