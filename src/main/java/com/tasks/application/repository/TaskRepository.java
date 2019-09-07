package com.tasks.application.repository;

import com.tasks.application.domain.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Mohammed Amr on 9/6/2019
 * Related to the Project tasks
 */
public interface TaskRepository extends CrudRepository<Task, Long> {


}
