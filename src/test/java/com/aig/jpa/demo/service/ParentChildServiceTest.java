package com.aig.jpa.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.aig.jpa.demo.entity.Child;
import com.aig.jpa.demo.entity.Parent;
import com.aig.jpa.demo.repository.ParentRepository;

public class ParentChildServiceTest {
	
	@Autowired
	ParentRepository parentRepository;
	
	@Autowired
    TestEntityManager entityManager;
	
	@Test
	void givenParentCreated_whenFindById_thenSuccess() {
		Parent parent = new Parent("ParentName");
		Child child1 = new Child("Child1Name", parent);
		Child child2 = new Child("Child2Name", parent);
		parent.getChildren().add(child1);
		parent.getChildren().add(child2);
	    entityManager.persist(parent);
	    Optional<Parent> retrievedParent = parentRepository.findById(parent.getId());
	    assertThat(retrievedParent).contains(parent);
	}
}
