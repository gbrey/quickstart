package org.jboss.as.quickstarts.todo.service;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.jboss.as.quickstarts.todo.model.Project;
import org.jboss.as.quickstarts.todo.model.Task;

public class DBAccess {
	@Inject
	private EntityManager userDatabase;
	
	public List<Project> getProjects(){
		Query q = userDatabase.createQuery("select m from Project m");
		return q.getResultList();		
	}

	public List<Task> getTask() {
		Query q = userDatabase.createQuery("select m from Task m");
		return q.getResultList();		
	}

	public List<Task> getTaskByProject(int project_id) {
		List<Project> projects = userDatabase
				.createQuery("select p from Project p where p.id=:id")
				.setParameter("id", project_id).getResultList();
		
		
		List<Task> results = userDatabase
				.createQuery("select t from Task t where t.project=:id")
				.setParameter("id", projects.get(0)).getResultList();
		return results;
	}
}
