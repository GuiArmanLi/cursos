package com.example.ToDoList.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface IUsers extends JpaRepository<UserModel, UUID> {
    //@Query(value = "SELECT * FROM users WHERE name IS NOT NULL", nativeQuery = true)
    List<UserModel> findAll();

    Optional<UserModel> findByUsername(String username);
}
