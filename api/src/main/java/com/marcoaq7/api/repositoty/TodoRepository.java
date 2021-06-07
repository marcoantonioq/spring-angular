package com.marcoaq7.api.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcoaq7.api.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
	

}
