package com.marcoaq7.api.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String item;

	private Boolean status;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Boolean isStatus() {
		return this.status;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Todo)) {
			return false;
		}
		Todo todo = (Todo) o;
		return Objects.equals(id, todo.id) && Objects.equals(item, todo.item) && Objects.equals(status, todo.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, item, status);
	}

	@Override
	public String toString() {
		return "{" + " id='" + getId() + "'" + ", item='" + getItem() + "'" + ", status='" + isStatus() + "'" + "}";
	}

}
