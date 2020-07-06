package com.api.task.services;

import java.util.List;

import com.api.task.entity.TodoItem;

public interface ITodoItemService {
	
	public List<TodoItem>findAll();
	
	public TodoItem findById(Long id);
	
	public TodoItem save(TodoItem todoItem);
	
	public void delete(Long id);
}
