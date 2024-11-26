package com.example.taskmanagmentApplication.TaskController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskmanagmentApplication.Service.TaskService;
import com.example.taskmanagmentApplication.model.Task;

@RestController
@RequestMapping("/task")
public class TaskController {
	@Autowired
	private TaskService taskservice;

	@GetMapping
	public List<Task> getAllTask() {
		return taskservice.getAllTask();
	}

	@PostMapping
	public Task createTask(@RequestBody Task task) {
		return taskservice.createTask(task);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
		return taskservice.getTaskById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

}
