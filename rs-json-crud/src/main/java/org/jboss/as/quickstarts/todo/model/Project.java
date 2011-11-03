package org.jboss.as.quickstarts.todo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
public class Project {
	@Id
	@GeneratedValue
	private int id;
	
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Task.class)
	@XmlTransient
	private List<Task> tasks = new ArrayList<Task>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<Task> getTasks() {
		return tasks;
	}
}
