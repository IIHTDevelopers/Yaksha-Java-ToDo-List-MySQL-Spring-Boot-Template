package com.todoapplication.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.todoapplication.dto.ToDoDTO;
import com.todoapplication.service.ToDoService;

@Service
public class ToDoServiceImpl implements ToDoService {

	@Override
	public ToDoDTO createToDo(ToDoDTO ToDoDTO) {
		// write your logic here
		return null;
	}

	@Override
	public ToDoDTO getToDoById(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public ToDoDTO updateToDoById(Long id, ToDoDTO ToDoDTO) {
		// write your logic here
		return null;
	}

	@Override
	public void deleteToDoById(Long id) {
		// write your logic here
	}

	@Override
	public Page<ToDoDTO> getAllToDos(Pageable pageable) {
		// write your logic here
		return null;
	}

	@Override
	public List<ToDoDTO> searchToDosByName(String name) {
		// write your logic here
		return null;
	}

	@Override
	public List<ToDoDTO> getCompletedToDos() {
		// write your logic here
		return null;
	}

	@Override
	public List<ToDoDTO> getToDosWithPriorityGreaterThan(int priority) {
		// write your logic here
		return null;
	}
}
