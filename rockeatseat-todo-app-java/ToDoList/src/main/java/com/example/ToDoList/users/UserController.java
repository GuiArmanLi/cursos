package com.example.ToDoList.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Page;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService service;

    // Adicionar a Query para filtrar dados junto com a paginacao
    @GetMapping
    public ResponseEntity<Page<UserModel>> findAll() {
        return service.findAll();
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserModel> findByUsername(@PathVariable String username) {
        return service.findByUsername(username);
    }

    @PostMapping
    public ResponseEntity<UserModel> save(@RequestBody UserModel user) {
        return service.save(user);
    }

    @PutMapping("/{username}")
    public ResponseEntity<UserModel> upDate(@PathVariable String username, @RequestBody UserModel user) {
        return service.upDate(username, user);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<UserModel> delete(@PathVariable String username) {
        return service.delete(username);
    }
}
