package com.demo.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tutorials")
public class Tutorial {
	@Id
	private String id;
	private String title;
	private String description;
	private boolean published;
	
	public Tutorial(String title, String description, boolean published) {
		super();
	    this.title = title;
	    this.description = description;
	    this.published = published;
	  }

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the published
	 */
	public boolean isPublished() {
		return published;
	}

	/**
	 * @param published the published to set
	 */
	public void setPublished(boolean published) {
		this.published = published;
	}
	
	@Override
	  public String toString() {
	    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	  }
}
