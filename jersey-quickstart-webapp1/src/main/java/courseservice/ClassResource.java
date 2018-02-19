package courseservice;

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

import creator.CourseCreator;
import data.Data;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("classes")
public class ClassResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	private Data newData = new Data(); 

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllCourses() {
		return Response.ok(newData.getCOURSE_DATA()).build();
	}
	
    @GET
    @Path("{courseId}")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getCourse(@PathParam("courseId") String id) {
        return Response.ok(newData.getCOURSE_DATA().get(id)).build();
    }

    
    @POST
    @Path("{courseId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String addCourse(@PathParam("courseId") String id,
    			CourseCreator newcourse) {
  		newData.getCOURSE_DATA().put(id, newcourse);
  		return "Course: " + id +  " Added Successfully";
    }
    
    @PUT
    @Path("{courseId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String updateCourse(@PathParam("courseId") String id,
    			CourseCreator newcourse) {
  			newData.getCOURSE_DATA().put(id, newcourse);
  		return "Course: " + id +  " Updated Successfully";
    }
  
    @DELETE
    @Path("{courseId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response deleteCourse(@PathParam("courseId") String id) {
  			newData.getCOURSE_DATA().remove(id);
  		return Response.ok( "Course: " + id +  " Deleted Successfully").build();
    }
}
