package com.aig.jpa.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aig.jpa.demo.entity.Parent;
import com.aig.jpa.demo.repository.ChildRepository;
import com.aig.jpa.demo.repository.ParentRepository;

@Service
public class ParentChildService {
	
	@Autowired
	private ParentRepository parentRepository;

	@Autowired
	private ChildRepository childRepository;

	public Parent getParentById(long id, Set<String> fetchPolicy) {
		Optional<Parent> parent = parentRepository.findById(new Long(id));
		if(fetchPolicy.contains("children")) {
			parent.get().setChildren(List.of(childRepository.findById(parent.get().getId()).get()));
		}
		return parent.get();
	}
}