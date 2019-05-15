package com.cricket.fantasy.players.repository;

import com.cricket.fantasy.players.Players;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayersRepository extends MongoRepository<Players, Long>{
	
	Players findByPlayerTeamAndPlayerName(String player_Team, String player_Name);

}
