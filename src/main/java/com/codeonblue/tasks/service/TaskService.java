package com.codeonblue.tasks.service;

import com.codeonblue.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);

}
