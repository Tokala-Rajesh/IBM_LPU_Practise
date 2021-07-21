package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo 
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;
	    @Column(name = "todoName")
	    private String todoName;
	    @Column(name = "todoDesc")
	    private String todoDesc;
		public Todo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Todo(String todoName, String todoDesc) {
			super();
			this.todoName = todoName;
			this.todoDesc = todoDesc;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTodoName() {
			return todoName;
		}
		public void setTodoName(String todoName) {
			this.todoName = todoName;
		}
		public String getTodoDesc() {
			return todoDesc;
		}
		public void setTodoDesc(String todoDesc) {
			this.todoDesc = todoDesc;
		}
		@Override
		public String toString() {
			return "Todo [id=" + id + ", todoName=" + todoName + ", todoDesc=" + todoDesc + "]";
		}
		
	    

}
