package com.aig.jpa.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aig.jpa.demo.entity.Child;

@Repository
public interface ChildRepository extends CrudRepository<Child, Long> {
}