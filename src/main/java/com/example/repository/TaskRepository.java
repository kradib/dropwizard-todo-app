package com.example.repository;

import com.example.dao.TaskDao;
import com.example.dao.mapper.TaskRowMapper;
import com.example.model.Task;
import lombok.NonNull;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class TaskRepository {

    @NonNull private final TaskDao taskDao;

    public TaskRepository(@NonNull final Jdbi jdbi) {
        jdbi.registerRowMapper(TaskRowMapper.class, new TaskRowMapper());
        this.taskDao = jdbi.onDemand(TaskDao.class);
    }

    public List<Task> getTasks() {
        return taskDao.getTasks();
    }

    public Task getTask(int task_id) {
        return taskDao.getTask(task_id);
    }

}
