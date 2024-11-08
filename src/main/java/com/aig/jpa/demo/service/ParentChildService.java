package com.aig.jpa.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aig.jpa.demo.entity.Child;
import com.aig.jpa.demo.entity.Parent;
import com.aig.jpa.demo.repository.ChildRepository;
import com.aig.jpa.demo.repository.ParentRepository;

@Service
public class ParentChildService {
	@Autowired
	private ParentRepository parentRepository;

	@Autowired
	private ChildRepository childRepository;

	// Without @Transactional to only fetch Parent
	public Parent getParent(long id) {
		Parent parent = parentRepository.getById(new Long(id));
		// After getting Parent Object connection between parentRepository and database
		// is Closed
		return parent;
	}

	// with @Transactional
	@Transactional
	public Parent getParentWithChild(long id) {
		Parent parent = parentRepository.getById(new Long(id));
		Object object = parent.getChildren().size();
		return parent;
	}

	// Saving Parent with Child
	public void saveParentWithChildren() {
		Parent parent = new Parent("ParentName");
		Child child1 = new Child("Child1Name", parent);
		Child child2 = new Child("Child2Name", parent);
		parent.getChildren().add(child1);
		parent.getChildren().add(child2);

		parentRepository.save(parent);
	}
}