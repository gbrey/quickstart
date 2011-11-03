package org.jboss.as.quickstarts.todo.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.jboss.as.quickstarts.todo.model.Project;
import org.jboss.as.quickstarts.todo.model.Task;
import org.jboss.as.quickstarts.todo.service.DBAccess;

/**
 * A simple REST service which is able to say hello to someone using
 * HelloService
 * Please take a look at the web.xml where JAX-RS is enabled
 * 
 * @author gbrey@redhat.com
 * 
 */

@Path("/services/")
public class Todo {
	@Inject
	private DBAccess db;

	@GET
	@Path("/project/count")
	@Produces({ "application/xml" })
	public String getProjectsCount() {
		return "<xml><result>" + db.getProjects().size() + "</result></xml>";
	}

	@GET
	@Path("/projects")
	@Produces({ "application/json" })
	public List<Project> getProjects() {
		return db.getProjects();
	}
	
	@GET
	@Path("/project/{project_id}/tasks")
	@Produces({ "application/json" })
	public List<Task> getTasks(@PathParam("project_id") int project_id) {
		System.out.println("Searchin tasks for project id: [" + project_id + "]");
		return db.getTaskByProject(project_id);
	}
	
}
