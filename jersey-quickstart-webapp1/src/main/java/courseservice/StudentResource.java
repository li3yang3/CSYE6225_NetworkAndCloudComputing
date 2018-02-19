package courseservice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import courseservice.studentDAO.Board;
import courseservice.studentDAO.Course;
import courseservice.studentDAO.Lecture;
import courseservice.studentDAO.Roster;

import creator.StudentCreator;
import data.Data;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("students")
public class StudentResource {

 
	private Data newData = new Data(); 

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllStudents() {
		return Response.ok(newData.getSTUDENT_DATA()).build();
	}
	
    @GET
    @Path("{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getStudent(@PathParam("studentId") String id) {
        return Response.ok(newData.getSTUDENT_DATA().get(id)).build();
    }

    
    @POST
    @Path("{studentId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String addStudent(@PathParam("studentId") String id,
    			StudentCreator newstudent) {
  		newData.getSTUDENT_DATA().put(id, newstudent);
  		return "Student: " + id +  " Added Successfully";
    }
    
    @PUT
    @Path("{studentId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String updateStudent(@PathParam("studentId") String id,
    				StudentCreator newstudent) {
    		newData.getSTUDENT_DATA().put(id, newstudent);
  		return "Student: " + id +  " Updated Successfully";
    }
  
    @DELETE
    @Path("{studentId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteStudent(@PathParam("studentId") String id) {
  			newData.getSTUDENT_DATA().remove(id);
  			return "Student: " + id +  " Deleted Successfully";
    }
}
