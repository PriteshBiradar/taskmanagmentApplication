package com.example.taskmanagmentApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskmanagmentApplication.model.Task;

public interface TaskRepository extends JpaRepository<Task , Long > {
	

}
