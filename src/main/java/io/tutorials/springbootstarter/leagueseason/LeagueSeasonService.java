package io.tutorials.springbootstarter.leagueseason;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeagueSeasonService {
	
	@Autowired
	private LeagueRepository leagueRepo;

	public List<League> getAllLeagueSeasons() {
		List<League> league = new ArrayList<League>();
		System.out.println("XXXXXXXXXXXXXXXX---------XXXXXXXXXXXX-----------XXXXXXXXXXXXXXXX-------------XXXXXXXXXXx");
		leagueRepo.findAll().forEach(league::add);
		return league;
	}

	public League getLeague(String id) {
		return leagueRepo.findOne(id);
	}

	public void addLeague(League leagueSeason) {
		leagueRepo.save(leagueSeason);
	}

	public void updateLeague(String id, League leagueSeason) {
		leagueRepo.save(leagueSeason);
	}

	public void deleteLeague(String id) {
		leagueRepo.delete(id);
	}
}
