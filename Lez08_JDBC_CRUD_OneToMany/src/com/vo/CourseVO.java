package com.vo;

import java.io.Serializable;

public class CourseVO implements Serializable {

	private static final long serialVersionUID = 2412043002146059355L;
	
	private int id;
	private String title;
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	protected CourseVO() {
		
	}
	
	public CourseVO(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "CourseVO [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
}
