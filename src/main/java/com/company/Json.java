package com.company;

import com.company.model.Clothes;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/clothes")
public class Json {
    private static Map<Integer, Clothes> instrumentMap = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Clothes getClothes(@PathParam("id") Integer id) {
        return instrumentMap.get(id);
    }

    @PUT
    public Response createClothes(Clothes clothes) {
        instrumentMap.put(clothes.getId(), clothes);
        return Response.status(200).entity("MusicalInstrument").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteClothes(@PathParam(("id")) Integer id) {
        instrumentMap.remove(id);
        return Response.status(200).entity("MusicalInstrument").build();
    }

    @POST
    @Path("{id}/")
    public Response updateClothes(final @PathParam("id") Integer id, final Clothes clothes) {
        instrumentMap.replace(id, clothes);
        return Response.status(200).entity("MusicalInstrument").build();
    }
}
