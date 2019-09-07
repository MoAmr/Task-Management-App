package com.tasks.application.service;

import com.tasks.application.domain.Task;
import com.tasks.application.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Mohammed Amr on 9/6/2019
 * Related to the Project tasks
 */

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}
