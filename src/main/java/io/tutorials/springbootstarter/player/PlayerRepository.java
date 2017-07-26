package io.tutorials.springbootstarter.player;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, String> {
	
	public List<Player> findByidPlayer(String teamId);

}
