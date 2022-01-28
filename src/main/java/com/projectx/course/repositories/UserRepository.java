package com.projectx.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
