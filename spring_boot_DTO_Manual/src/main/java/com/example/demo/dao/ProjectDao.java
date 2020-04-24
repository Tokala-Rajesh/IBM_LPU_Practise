package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Project;
@Repository
public interface ProjectDao extends CrudRepository<Project, Integer> {

}
