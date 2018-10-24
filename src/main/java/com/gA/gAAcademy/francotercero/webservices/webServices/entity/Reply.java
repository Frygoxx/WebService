package com.gA.gAAcademy.francotercero.webservices.webServices.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reply {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "datePost")
	private Date datePost;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "author")
	private int author;
	
	//@ManytoOne???
	public Reply() {}

	public Reply(Date datePost, String description, int author) {
		super();
		this.datePost = datePost;
		this.description = description;
		this.author = author;
	}

	public int getId() {
		return id;
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
		
}

