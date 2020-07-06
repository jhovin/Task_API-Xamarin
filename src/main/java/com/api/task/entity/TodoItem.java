package com.api.task.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todoitems")
public class TodoItem {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String Name;
	private String Notes;
	private boolean Done;

	
	public TodoItem(Long id, String name, String notes, boolean done) {
		this.id = id;
		Name = name;
		Notes = notes;
		Done = done;
	}
	
	public TodoItem() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public boolean isDone() {
		return Done;
	}
	public void setDone(boolean done) {
		Done = done;
	}

}
