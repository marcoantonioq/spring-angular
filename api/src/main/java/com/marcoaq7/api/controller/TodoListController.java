package com.marcoaq7.api.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.marcoaq7.api.model.Todo;
import com.marcoaq7.api.repositoty.TodoRepository;

@RestController
@RequestMapping("/todos")
public class TodoListController {

	@Autowired
	private TodoRepository todosRepo;

	@GetMapping
	public List<Todo> index() {
		return todosRepo.findAll();
	}

	@PostMapping(path = "save")
	@ResponseStatus(HttpStatus.CREATED)
	public Todo save(@RequestBody Todo todo) {
		System.out.println(todo);
		return todosRepo.save(todo);
	}

	@PostMapping(path = "saveAll")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Todo> saveAll(@RequestBody List<Todo> todos) {
		return todosRepo.saveAll(todos);
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Long> delete(@PathVariable Long id) {
		try {
			todosRepo.deleteById(id);
			System.out.println("Todo existe: " + id);
		} catch (Exception e) {
			System.out.println("Todo com id não existe:" + id + e);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(id, HttpStatus.ACCEPTED);
	}

}
