package com.todoapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoapplication.entity.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
	// write your logic here
}
