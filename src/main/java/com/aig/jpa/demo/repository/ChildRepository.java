package com.aig.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aig.jpa.demo.entity.Child;

public interface ChildRepository extends JpaRepository<Child, Long> {
}