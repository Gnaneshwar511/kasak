package io.tutorials.springbootstarter.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@RequestMapping("/teams/{teamId}/players/{id}")
	public Player getPlayer(@PathVariable String id) {
		return playerService.getPlayer(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/teams/{idTeam}/players")
	public List<Player> addPlayer(@RequestBody Player player, @PathVariable String idTeam) {
		//player.setTeam(new Team(teamId, "", ""));
		//player.setTeam(new Team(idTeam, teamName, teamCaptain, League_idLeague, teamNumber, League_idLeague1, League_GolfCourse_idGolfCourse));
		player.setIdPlayer("");
		player.setfName("");
		player.setlName("");
		player.setGamesPlayer("");
		player.setYearsPlayed("");
		player.setFacebook("");
		player.setTwitter("");
		player.setAddress1("");
		player.setAddress2("");
		player.setCity("");
		player.setState("");
		player.setZip("");
		
		playerService.addPlayer(player);
		return null;
		//return playerService.getAllPlayers("uno");
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/teams/{teamId}/players/{id}")
	public void updatePlayer(@RequestBody Player player, @PathVariable String teamId) {
		//player.setTeam(new Team(teamId, "", ""));
		playerService.updatePlayer(player);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/teams/{teamId}/players/{id}")
	public void deletePlayer(@PathVariable String id) {
		playerService.deletePlayer(id);
	}
}
