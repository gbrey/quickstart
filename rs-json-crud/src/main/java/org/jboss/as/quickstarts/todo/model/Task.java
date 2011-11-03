package org.jboss.as.quickstarts.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement
public class Task {
	@Id
	@GeneratedValue
	private String id;
	private String title;
	private String description;
	
	@ManyToOne(targetEntity = Project.class)
	private Project project;

	public String getId() {
		return id;
	}

	public void setId(String Id) {
		this.id = Id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String firstName) {
		this.title = firstName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
