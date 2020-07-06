package com.api.task.dao;



import org.springframework.data.repository.CrudRepository;

import com.api.task.entity.TodoItem;

public interface ITodoItemDao extends CrudRepository<TodoItem,Long> {
	


}
