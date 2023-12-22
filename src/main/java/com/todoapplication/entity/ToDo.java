package com.todoapplication.entity;

public class ToDo {
	private Long id;

	private String title;

	private String description;
	private boolean completed = false;
	private int priority;

	public ToDo() {
		super();
	}

	public ToDo(Long id, String title, String description, boolean completed, int priority) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.completed = completed;
		this.priority = priority;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", title=" + title + ", description=" + description + ", completed=" + completed
				+ ", priority=" + priority + "]";
	}
}
