package io.tutorials.springbootstarter.team;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {

	@Id
	private String idTeam;
	private String teamName;
	private String teamCaptain;
	private String League_idLeague;
	private String teamNumber;
	private String League_idLeague1;
	private String League_GolfCourse_idGolfCourse;

	public Team() {
		
	}

	public Team(String idTeam, String teamName, String teamCaptain, String League_idLeague, String teamNumber, String League_idLeague1, String League_GolfCourse_idGolfCourse) {
		super();
		this.idTeam = idTeam;
		this.teamName = teamName;
		this.teamCaptain = teamCaptain;
		this.teamNumber = teamNumber;
		this.League_idLeague = League_idLeague;
		this.League_idLeague1 = League_idLeague1;
		this.League_GolfCourse_idGolfCourse = League_GolfCourse_idGolfCourse;
	}

	public String getIdTeam() {
		return idTeam;
	}
	
	public void setIdTeam(String idTeam) {
		this.idTeam = idTeam;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getTeamCaptain() {
		return teamCaptain;
	}
	
	public void setTeamCaptain(String teamCaptain) {
		this.teamCaptain = teamCaptain;
	}
	
	public String getLeague_idLeague() {
		return League_idLeague;
	}
	
	public void setLeague_idLeague(String league_idLeague) {
		League_idLeague = league_idLeague;
	}
	
	public String getTeamNumber() {
		return teamNumber;
	}
	
	public void setTeamNumber(String teamNumber) {
		this.teamNumber = teamNumber;
	}
	
	public String getLeague_idLeague1() {
		return League_idLeague1;
	}
	
	public void setLeague_idLeague1(String league_idLeague1) {
		League_idLeague1 = league_idLeague1;
	}
	
	public String getLeague_GolfCourse_idGolfCourse() {
		return League_GolfCourse_idGolfCourse;
	}
	
	public void setLeague_GolfCourse_idGolfCourse(String league_GolfCourse_idGolfCourse) {
		League_GolfCourse_idGolfCourse = league_GolfCourse_idGolfCourse;
	}

/*	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}*/
	
}
