package io.tutorials.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.tutorials.springbootstarter.topic.Team;

@Entity
public class Player {

	@Id
	private String id;
	private String name;
	private String description;

	@ManyToOne
	private Team team;

	public Player() {

	}

	public Player(String id, String name, String description, String teamId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.team = new Team(teamId, "", "");
	}

	public String getId() {
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
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
