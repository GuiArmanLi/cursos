package com.example.ToDoList.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskService service;

    @GetMapping
    public ResponseEntity<List<TaskModel>> findAll(HttpServletRequest request) {
        return service.findAll(request);
    }

    @GetMapping("/{title}")
    public ResponseEntity<TaskModel> findByTitle(@PathVariable String title) {
        return service.findByTitle(title);
    }

    // Restringir o post com comeco e final nulo ou vazio
    @PostMapping
    public ResponseEntity<TaskModel> save(@RequestBody TaskModel newTask, HttpServletRequest request) {
        return service.save(newTask, request);
    }

    // Nao ta mudando o describe
    @PutMapping("/{title}")
    public ResponseEntity<TaskModel> upDate(@PathVariable String title, @RequestBody TaskModel task) {
        return service.upDate(task, title);
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<TaskModel> delete(@PathVariable String title) {
        return service.delete(title);
    }

}
