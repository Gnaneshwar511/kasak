package io.tutorials.springbootstarter.player;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public List<Player> getAllPlayers(String teamId) {
		List<Player> players = new ArrayList<>();
		playerRepository.findByidPlayer(teamId).forEach(players::add);
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
