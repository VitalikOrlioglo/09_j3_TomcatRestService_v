package de.cimdata.restapp.resource;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.cimdata.restapp.model.Animal;
import de.cimdata.restapp.service.AnimalService;

@Path("/animal") // http:localhost:8080/rest/animal
public class AnimalResource {
	
	private AnimalService animalService = new AnimalService();
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/info/{key}")
	public Response message(@PathParam("key") String k) { // http:localhost:8080/rest/animal/info/12
		if (!k.equals("123")) {
			return Response.status(401).build();
		}
		return Response.status(200).entity(k + " Hallo, hier bekommt Tiere.....").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/all") // http:localhost:8080/rest/animal/all
	public Response message() {
		List<Animal> animals = animalService.findAll();
		GenericEntity<List<Animal>> myEntity = new GenericEntity<List<Animal>>(animals) {};
		
		return Response.status(200).entity(myEntity).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response messageByType(@QueryParam("typ") String t) { // http:localhost:8080/rest/animal/?typ=Mammal
		List<Animal> animals = animalService.findAll().stream().filter(a -> a.getTyp().equalsIgnoreCase(t) ).collect(Collectors.toList());
		GenericEntity<List<Animal>> myEntity = new GenericEntity<List<Animal>>(animals) {};
		
		return Response.status(200).entity(myEntity).build();
	}
}
