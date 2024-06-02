package com.example.service;

import com.example.dao.TaskDao;
import com.example.model.CreateTaskRequest;
import com.example.model.Task;
import com.example.repository.TaskRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TaskService {

    private TaskRepository taskRepository;

    public List<Task> getTasks() {
        return taskRepository.getTasks();
    }

}
