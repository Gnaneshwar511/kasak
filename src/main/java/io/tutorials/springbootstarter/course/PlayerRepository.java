package io.tutorials.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, String> {
	
	public List<Player> findByTeamId(String teamId);

}
