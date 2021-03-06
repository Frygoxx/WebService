package com.gA.gAAcademy.francotercero.webservices.webServices.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic {
	//id
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "datePost")
	private Date datePost = new Date();
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "author")
	private int author;
	
	@Column(name = "deleted")
	private Boolean deleted = false;
	
	
	public Topic() {}

	public Topic(String title, String description, int author) {
		super();
		this.title = title;
		Date d = new Date();
		this.datePost = d;
		this.description = description;
		this.author = author;
		this.deleted = false;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDatePost() {
		return datePost;
	}

	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}

	public Boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public void deleted() {
		this.deleted = true;
	}

}


