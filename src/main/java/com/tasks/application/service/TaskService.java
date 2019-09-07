package com.tasks.application.service;

import com.tasks.application.domain.Task;

/**
 * Created by Mohammed Amr on 9/6/2019
 * Related to the Project tasks
 */
public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
