package io.tutorials.springbootstarter.leagueseason;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class League {

	@Id
	private String idleague;
	private String leaguename;
	private String leagueadministrator;
	private String golfcourse_idgolfcourse;
	private String seasonyear;
	private String leagueschedule_idleagueschedule;
	/*public String toString() {
		return golfcourse_idgolfcourse;
	}*/
	public League() {
		
	}
	
	public League(String idLeague, String leagueName, String leagueAdministrator, String GolfCourse_idGolfCourse, String seasonYear, String LeagueSchedule_idLeagueSchedule) {
		super();
	}
	public String getIdLeague() {
		return idleague;
	}

	public void setIdLeague(String idLeague) {
		this.idleague = idLeague;
	}

	public String getLeagueName() {
		return leaguename;
	}

	public void setLeagueName(String leagueName) {
		this.leaguename = leagueName;
	}

	public String getLeagueAdministrator() {
		return leagueadministrator;
	}

	public void setLeagueAdministrator(String leagueAdministrator) {
		this.leagueadministrator = leagueAdministrator;
	}

	public String getGolfCourse_idGolfCourse() {
		return golfcourse_idgolfcourse;
	}

	public void setGolfCourse_idGolfCourse(String golfCourse_idGolfCourse) {
		golfcourse_idgolfcourse = golfCourse_idGolfCourse;
	}

	public String getSeasonYea() {
		return seasonyear;
	}

	public void setSeasonYea(String seasonYear) {
		this.seasonyear = seasonYear;
	}

	public String getLeagueSchedule_idLeagueSchedule() {
		return leagueschedule_idleagueschedule;
	}

	public void setLeagueSchedule_idLeagueSchedule(String leagueSchedule_idLeagueSchedule) {
		leagueschedule_idleagueschedule = leagueSchedule_idLeagueSchedule;
	}

	
	
	

}
