package io.tutorials.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@RequestMapping("/teams")
	public List<Team> getAllTeams() {
		return teamService.getAllTeams();
	}
	@RequestMapping("/teams/{id}")
	public Team getTeam(@PathVariable  String id){
		return teamService.getTeam(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/teams")
	public void addTeam(@RequestBody Team team){
		teamService.addTeam(team);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/teams/{id}")
	public void updateTeam(@RequestBody Team team, @PathVariable  String id){
		teamService.updateTeam(id, team);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/teams/{id}")
	public void deleteTeam(@PathVariable  String id){
		teamService.deleteTeam(id);
	}
}
