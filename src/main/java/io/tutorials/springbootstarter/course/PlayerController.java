package io.tutorials.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.tutorials.springbootstarter.topic.Team;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	@RequestMapping("/teams/{id}/players")
	public List<Player> getAllPlayers(@PathVariable  String id) {
		
		return playerService.getAllPlayers(id);
	}
	
	@RequestMapping("/teams/{teamId}/players/{id}")
	public Player getPlayer(@PathVariable  String id){
		return playerService.getPlayer(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/teams/{teamId}/players")
	public List<Player> addPlayer(@RequestBody Player player,@PathVariable  String teamId){
		player.setTeam(new Team(teamId,"",""));
		playerService.addPlayer(player);
		return playerService.getAllPlayers("uno");
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/teams/{teamId}/players/{id}")
	public void updatePlayer(@RequestBody Player player, @PathVariable  String teamId){
		player.setTeam(new Team(teamId,"",""));
		playerService.updatePlayer(player);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/teams/{teamId}/players/{id}")
	public void deletePlayer(@PathVariable  String id){
		playerService.deletePlayer(id);
	}
}
