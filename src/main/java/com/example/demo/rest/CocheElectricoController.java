package com.example.demo.rest;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.example.demo.service.CocheElectricoService;
import com.example.demo.domain.CocheElectrico;

@Path("/cocheEle")
@Component
@Produces(MediaType.APPLICATION_JSON) // indica que devuelve o produce JSON
public class CocheElectricoController {
	
	private CocheElectricoService cocheElectricoService;

	public CocheElectricoController(CocheElectricoService cocheElectricoService) {
		this.cocheElectricoService = cocheElectricoService;
	}

	@GET
	public List<CocheElectrico> findAll(){
		return cocheElectricoService.findAll();
	}
	
    /**
     * GET
     * http://localhost:8080/api/cocheEle/1
     * http://localhost:8080/api/cocheEle/2
     * http://localhost:8080/api/cocheEle/3
     */
    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Long id){
    	CocheElectrico coche = cocheElectricoService.findOne(id);
        if (coche == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(coche).build();
    }
    
    /**
     * GET
     * http://localhost:8080/api/cocheEle/nombre/{modelo}
     * http://localhost:8080/api/cocheEle/nombre/{modelo}
     * http://localhost:8080/api/cocheEle/nombre/{modelo}
     */
    @GET
    @Path("/nombre/{modelo}")
	public Response findByName(@PathParam("modelo") String name) {
       	List<CocheElectrico> coche = cocheElectricoService.findByName(name);
        if (coche == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(coche).build();
    }
    
    /**
    * GET
    * http://localhost:8080/api/cocheEle/color/{color}
    * http://localhost:8080/api/cocheEle/color/{color}
    * http://localhost:8080/api/cocheEle/color/{color}
    */
    @GET
    @Path("/color/{color}")
	public Response findCarColor(@PathParam("color") String color) {
    	List<CocheElectrico> coche = cocheElectricoService.findCarColor(color);
        if (coche == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(coche).build();
    }
    
    /**
    * GET
    * http://localhost:8080/api/cocheEle/puerta/{door}
    * http://localhost:8080/api/cocheEle/puerta/{door}
    * http://localhost:8080/api/cocheEle/puerta/{door}
    */
    @GET
    @Path("/puerta/{door}")
	public List<CocheElectrico> findCarDoor(@PathParam("door") int door) {
    	return cocheElectricoService.findCarDoor(door);
    }


    @POST 
    public Response create(CocheElectrico cocheEle){
        if (cocheEle.getId() != 0) 
            return Response.status(Response.Status.BAD_REQUEST).build();
        
        CocheElectrico result = cocheElectricoService.save(cocheEle);
        return Response.ok(result).build();
    }
    
    @PUT
    public Response update(CocheElectrico cocheEle){
        if (cocheEle.getId() == null || cocheEle.getId() == 0) 
            return Response.status(Response.Status.BAD_REQUEST).build();
        return Response.ok(cocheElectricoService.save(cocheEle)).build();
    }


    @DELETE
    @Path("{id}")
    public Response deleteOne(@PathParam("id") Long id){
        if(!cocheElectricoService.delete(id))
            return Response.ok(Response.Status.NOT_FOUND).build();
        return Response.ok(Response.Status.OK).build();
    }

    @DELETE
    public Response deleteAll(){
    	cocheElectricoService.deleteAll();
        return Response.ok(Response.Status.OK).build();
    }
}
