package io.tutorials.springbootstarter.leagueseason;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeagueSeasonController {

	@Autowired
	private LeagueSeasonService leagueSeasonService;
	
	@RequestMapping("/leagueseason")
	public List<League> getAllLeagueSeasons() {
		return leagueSeasonService.getAllLeagueSeasons();
	}
	
	@RequestMapping("/leagueseason/{id}")
	public League getLeagueSeason(@PathVariable  String id){
		return leagueSeasonService.getLeague(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/leagueseason")
	public void addLeagueSeason(@RequestBody League leagueSeason){
		System.out.println("xxxxxXXXxxxxx--------============>>>><<<<<<" +leagueSeason.getGolfCourse_idGolfCourse());
		leagueSeasonService.addLeague(leagueSeason);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/leagueseason/{id}")
	public void updateLeagueSeason(@RequestBody League leagueSeason, @PathVariable  String id){
		leagueSeasonService.updateLeague(id, leagueSeason);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/leagueseason/{id}")
	public void deleteLeagueSeason(@PathVariable  String id){
		leagueSeasonService.deleteLeague(id);
	}	
}
