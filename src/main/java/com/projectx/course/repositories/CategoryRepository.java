package com.projectx.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
