package com.aig.jpa.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aig.jpa.demo.entity.Child2;

@Repository
public interface Child2Repository extends CrudRepository<Child2, Long> {
}