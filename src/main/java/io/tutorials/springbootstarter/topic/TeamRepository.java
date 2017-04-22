package io.tutorials.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, String> {
	

}
