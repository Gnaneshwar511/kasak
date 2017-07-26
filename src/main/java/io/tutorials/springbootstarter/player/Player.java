package io.tutorials.springbootstarter.player;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.tutorials.springbootstarter.team.Team;

@Entity
public class Player {

	@Id
	private String idPlayer;
	private String fName;
	private String lName;
	private String gamesPlayer;
	private String yearsPlayed;
	private String facebook;
	private String twitter;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;

	//@ManyToOne
	//private Team team;

	public Player() {

	}

	public Player(String idPlayer, String fName, String lName, String gamesPlayer, String yearsPlayed, String facebook, String twitter, String address1, String address2, String city, String state, String zip) {
		super();
		this.idPlayer = idPlayer;
		this.fName = fName;
		this.lName = lName;
		this.gamesPlayer = gamesPlayer;
		this.yearsPlayed = yearsPlayed;
		this.facebook = facebook;
		this.twitter = twitter;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		//this.team = new Team(teamId, "", "");
	}

	public String getIdPlayer() {
		return idPlayer;
	}

	public void setIdPlayer(String idPlayer) {
		this.idPlayer = idPlayer;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGamesPlayer() {
		return gamesPlayer;
	}

	public void setGamesPlayer(String gamesPlayer) {
		this.gamesPlayer = gamesPlayer;
	}

	public String getYearsPlayed() {
		return yearsPlayed;
	}

	public void setYearsPlayed(String yearsPlayed) {
		this.yearsPlayed = yearsPlayed;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

/*	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}*/
}
