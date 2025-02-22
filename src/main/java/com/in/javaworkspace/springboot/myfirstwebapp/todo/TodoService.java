package com.in.javaworkspace.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();

	private static int todosCount = 0;

	static {
		todos.add(new Todo(++todosCount, "Rachit_129", "Get Hibernate Certified", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "Rachit_129", "Learn SprinBoot", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "Rachit_129", "Learn AWS", LocalDate.now().plusYears(3), false));
		todos.add(new Todo(++todosCount, "Rachit_129", "Learn FullStackDevelopment", LocalDate.now().plusYears(4),
				false));

	}

	public List<Todo> findByUsername(String Username) {
		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}

	public void deleteById(int id) {
		// todo.getId() == id
		// todo -> todo.getId() == id
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);

	}
}
