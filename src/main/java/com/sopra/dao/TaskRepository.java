package com.sopra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
