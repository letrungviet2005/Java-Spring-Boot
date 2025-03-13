package com.example.MySQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MySQL.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
