package com.aig.jpa.demo.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Parent {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<Child> children = new ArrayList<>();
    
    @Transient
    public List<Child> getChildren() {
		return children;
	}
    
    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER)
    private List<Child2> children2 = new ArrayList<>();
    
	public Parent(String name) {
		super();
		this.name = name;
	}
}