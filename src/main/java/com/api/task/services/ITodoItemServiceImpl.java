package com.api.task.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.api.task.dao.ITodoItemDao;
import com.api.task.entity.TodoItem;

@Service
public class ITodoItemServiceImpl implements ITodoItemService{
	
	@Autowired
	private ITodoItemDao itemDao;
	
	@Override
	public List<TodoItem>findAll(){
		return(List<TodoItem>)itemDao.findAll();
	}
	@Override
	public TodoItem findById(Long id) {
		return itemDao.findById(id).orElse(null);
	}

	@Override
	public TodoItem save(TodoItem todoItem) {
		return itemDao.save(todoItem);
	}

	@Override
	public void delete(Long id) {
		itemDao.deleteById(id);
		
	}
	

}
