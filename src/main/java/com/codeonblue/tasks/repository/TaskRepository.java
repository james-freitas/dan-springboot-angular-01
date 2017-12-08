package com.codeonblue.tasks.repository;


import com.codeonblue.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long>{

}
