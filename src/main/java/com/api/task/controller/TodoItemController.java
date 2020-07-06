package com.api.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.task.entity.TodoItem;
import com.api.task.services.ITodoItemService;

@RestController
@RequestMapping("/api")
public class TodoItemController {
	
	@Autowired
	private ITodoItemService itemService;
	
	@GetMapping("/items")
	public List<TodoItem>lista(){
		return itemService.findAll();
	}
	
	@GetMapping("/items/{id}")
	public TodoItem mostrar(@PathVariable Long id) {
		return itemService.findById(id);
		
	}
	@PostMapping("/items")
	@ResponseStatus(HttpStatus.CREATED)
	public TodoItem crear(@RequestBody TodoItem todoItem) {
		return itemService.save(todoItem);
		
	}
	@PutMapping("/items/{id}")
	public TodoItem update(@RequestBody TodoItem todoItem,@PathVariable Long id) {
		TodoItem ite=itemService.findById(id);
		ite.setName(todoItem.getName());
		ite.setNotes(todoItem.getNotes());
		ite.setDone(todoItem.isDone());
		return itemService.save(ite);
		
	}
	@DeleteMapping("/items/{id}")
	public void eliminar(@PathVariable Long id) {
		itemService.delete(id);
	}

}
