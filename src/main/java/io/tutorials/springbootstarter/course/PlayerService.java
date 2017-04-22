package io.tutorials.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.tutorials.springbootstarter.topic.Team;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public List<Player> getAllPlayers(String teamId) {
		List<Player> players = new ArrayList<>();
		playerRepository.findByTeamId(teamId).forEach(players::add);
		//players.add(new Player("1", "Harish", "Bowler", "uno"));
		return players;
	}

	public Player getPlayer(String id) {
		return playerRepository.findOne(id);
	}

	public void addPlayer(Player player) {
		playerRepository.save(player);
	}

	public void updatePlayer(Player player) {
		playerRepository.save(player);
	}

	public void deletePlayer(String id) {
		playerRepository.delete(id);
	}
}
