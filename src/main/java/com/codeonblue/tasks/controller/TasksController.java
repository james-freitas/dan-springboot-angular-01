package com.codeonblue.tasks.controller;

import com.codeonblue.tasks.domain.Task;
import com.codeonblue.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TasksController {

    private TaskService taskService;

    public TasksController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping(value = {"", "/"})
    public Iterable<Task> listTasks(){
        return this.taskService.list();
    }


    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return this.taskService.save(task);
    }



}
