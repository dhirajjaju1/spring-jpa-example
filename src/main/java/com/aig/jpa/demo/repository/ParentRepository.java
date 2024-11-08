package com.aig.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aig.jpa.demo.entity.Parent;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}