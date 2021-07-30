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

import com.example.demo.service.CocheHibridoService;
import com.example.demo.domain.CocheHibrido;

@Path("/cocheHib")
@Component
@Produces(MediaType.APPLICATION_JSON) // indica que devuelve o produce JSON
public class CocheHibridoController {
	
	private CocheHibridoService cocheHidrogenoService;

	public CocheHibridoController(CocheHibridoService cocheHidrogenoService) {
		this.cocheHidrogenoService = cocheHidrogenoService;
	}

	@GET
	public List<CocheHibrido> findAll(){
		return cocheHidrogenoService.findAll();
	}
	
    /**
     * GET
     * http://localhost:8080/api/cocheHib/1
     * http://localhost:8080/api/cocheHib/2
     * http://localhost:8080/api/cocheHib/3
     */
    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Long id){
    	CocheHibrido coche = cocheHidrogenoService.findOne(id);
        if (coche == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(coche).build();
    }
        
    /**
     * GET
     * http://localhost:8080/api/cocheHib/nombre/{modelo}
     * http://localhost:8080/api/cocheHib/nombre/{modelo}
     * http://localhost:8080/api/cocheHib/nombre/{modelo}
     */
    @GET
    @Path("/nombre/{modelo}")
	public Response findByName(@PathParam("modelo") String name) {
       	List<CocheHibrido> coche = cocheHidrogenoService.findByName(name);
        if (coche == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(coche).build();
    }
    
    /**
    * GET
    * http://localhost:8080/api/cocheHib/color/{color}
    * http://localhost:8080/api/cocheHib/color/{color}
    * http://localhost:8080/api/cocheHib/color/{color}
    */
    @GET
    @Path("/color/{color}")
	public Response findCarColor(@PathParam("color") String color) {
    	List<CocheHibrido> coche = cocheHidrogenoService.findCarColor(color);
        if (coche == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(coche).build();
    }
    
    /**
    * GET
    * http://localhost:8080/api/cocheHib/puerta/{door}
    * http://localhost:8080/api/cocheHib/puerta/{door}
    * http://localhost:8080/api/cocheHib/puerta/{door}
    */
    @GET
    @Path("/puerta/{door}")
	public List<CocheHibrido> findCarDoor(@PathParam("door") int door) {
    	return cocheHidrogenoService.findCarDoor(door);
    }

    @POST 
    public Response create(CocheHibrido cocheHib){
        if (cocheHib.getId() != 0) 
            return Response.status(Response.Status.BAD_REQUEST).build();
        
        CocheHibrido result = cocheHidrogenoService.save(cocheHib);
        return Response.ok(result).build();
    }
    
    @PUT
    public Response update(CocheHibrido cocheHib){
        if (cocheHib.getId() == null || cocheHib.getId() == 0) 
            return Response.status(Response.Status.BAD_REQUEST).build();
        return Response.ok(cocheHidrogenoService.save(cocheHib)).build();
    }


    @DELETE
    @Path("{id}")
    public Response deleteOne(@PathParam("id") Long id){
        if(!cocheHidrogenoService.delete(id))
            return Response.ok(Response.Status.NOT_FOUND).build();
        return Response.ok(Response.Status.OK).build();
    }

    @DELETE
    public Response deleteAll(){
    	cocheHidrogenoService.deleteAll();
        return Response.ok(Response.Status.OK).build();
    }
}
