package com.example.taskmanagmentApplication.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.taskmanagmentApplication.model.Task;
import com.example.taskmanagmentApplication.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	private TaskRepository taskrepository;

	public List<Task> getAllTask() {
		return taskrepository.findAll();
	}

	public Task createTask(Task task) {
		return taskrepository.save(task);
	}

	public Optional<Task> getTaskById(Long id) {
		return taskrepository.findById(id);
	}

	public void deleteTask(Long id) {
		taskrepository.deleteById(id);
	}

}
