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

import com.example.demo.domain.CocheGasolina;
import com.example.demo.service.CocheGasolinaService;


@Path("/cocheGas")
@Component
@Produces(MediaType.APPLICATION_JSON) // indica que devuelve o produce JSON
public class CocheGasolinaController {
	
	private CocheGasolinaService cocheGasolinaService;

	public CocheGasolinaController(CocheGasolinaService cocheGasolinaService) {
		this.cocheGasolinaService = cocheGasolinaService;
	}

	@GET
	public List<CocheGasolina> findAll(){
		return cocheGasolinaService.findAll();
	}
	
    /**
     * GET
     * http://localhost:8080/api/cocheGas/1
     * http://localhost:8080/api/cocheGas/2
     * http://localhost:8080/api/cocheGas/3
     */
    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Long id){
    	CocheGasolina coche = cocheGasolinaService.findOne(id);
        if (coche == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(coche).build();
    }
    
    /**
     * GET
     * http://localhost:8080/api/cocheGas/nombre/{modelo}
     * http://localhost:8080/api/cocheGas/nombre/{modelo}
     * http://localhost:8080/api/cocheGas/nombre/{modelo}
     */
    @GET
    @Path("/nombre/{modelo}")
	public Response findByName(@PathParam("modelo") String name) {
       	List<CocheGasolina> coche = cocheGasolinaService.findByName(name);
        if (coche == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(coche).build();
    }
    
    /**
    * GET
    * http://localhost:8080/api/cocheGas/color/{color}
    * http://localhost:8080/api/cocheGas/color/{color}
    * http://localhost:8080/api/cocheGas/color/{color}
    */
    @GET
    @Path("/color/{color}")
	public Response findCarColor(@PathParam("color") String color) {
    	List<CocheGasolina> coche = cocheGasolinaService.findCarColor(color);
        if (coche == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(coche).build();
    }

    /**
    * GET
    * http://localhost:8080/api/cocheGas/puerta/{door}
    * http://localhost:8080/api/cocheGas/puerta/{door}
    * http://localhost:8080/api/cocheGas/puerta/{door}
    */
    @GET
    @Path("/puerta/{door}")
	public List<CocheGasolina> findCarDoor(@PathParam("door") int door) {
    	return cocheGasolinaService.findCarDoor(door);
    }
    
    @POST 
    public Response create(CocheGasolina cocheGas){
        if (cocheGas.getId() != 0) 
            return Response.status(Response.Status.BAD_REQUEST).build();
        
        CocheGasolina result = cocheGasolinaService.save(cocheGas);
        return Response.ok(result).build();
    }
    
    @PUT
    public Response update(CocheGasolina cocheGas){
        if (cocheGas.getId() == null || cocheGas.getId() == 0) 
            return Response.status(Response.Status.BAD_REQUEST).build();
        return Response.ok(cocheGasolinaService.save(cocheGas)).build();
    }


    @DELETE
    @Path("{id}")
    public Response deleteOne(@PathParam("id") Long id){
        if(!cocheGasolinaService.delete(id))
            return Response.ok(Response.Status.NOT_FOUND).build();
        return Response.ok(Response.Status.OK).build();
    }

    @DELETE
    public Response deleteAll(){
    	cocheGasolinaService.deleteAll();
        return Response.ok(Response.Status.OK).build();
    }
}
