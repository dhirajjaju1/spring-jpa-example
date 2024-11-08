package com.aig.jpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aig.jpa.demo.entity.Parent;
import com.aig.jpa.demo.service.ParentChildService;

@RestController
public class EntryController {

	@Autowired
	ParentChildService parentChildService;

	@GetMapping("/aig")
	public Parent getById(@RequestParam(required = true) long id,
	    @RequestParam(required = true) boolean loadChild) {
		
		Parent parent = null;
		
		if(loadChild) {
			parent = parentChildService.getParentWithChild(id);
		} else {
			parent = parentChildService.getParent(id);	
		}
		return parent;
	}
}
