package com.example.Fashion.Repositories;

import com.example.Fashion.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
