package com.example.ToDoList.repository;

import com.example.ToDoList.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IUsers extends JpaRepository<UsersModel, UUID> {
    UsersModel findByUserName(String userName);
}
