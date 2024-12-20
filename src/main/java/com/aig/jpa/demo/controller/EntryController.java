/**
 * RestController having methods for CRUD operation for Parent & Child entities
 * author Dhiraj Jaju
 */
package com.aig.jpa.demo.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aig.jpa.demo.entity.Parent;
import com.aig.jpa.demo.service.ParentChildService;

@RestController
public class EntryController {

	@Autowired
	ParentChildService parentChildService;

	/**
	 * Endpoint to get Parent and child details based on fetchPolicy 
	 * parameters passed
	 * @param id
	 * @param fetchPolicy
	 * @return
	 */
	@PostMapping("/aig/parent/")
	public Parent getParentById(@RequestParam(required = true) long id,
			@RequestParam(required = true) Set<String> fetchPolicy) {
		return parentChildService.getParentById(id, fetchPolicy);
	}
}
