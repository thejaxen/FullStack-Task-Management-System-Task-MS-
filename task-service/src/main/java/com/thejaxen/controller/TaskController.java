package com.thejaxen.controller;

import com.thejaxen.modal.Task;
import com.thejaxen.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    public ResponseEntity<Task> createTask(@RequestBody Task task, @RequestHeader("Authorization") String jwt) {

        Task createdTask=taskService.createTask()
    }
}
