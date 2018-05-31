package com.company;

import com.company.model.Clothes;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Response;

@Path("/clothes")
public class Service {
    private static Map<Integer, Clothes> clothesMap = new HashMap<>();

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public final Clothes getClothes(final @PathParam("id") Integer id) {
        return clothesMap.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createClothes(final Clothes clothes) {
        clothesMap.put(clothes.getId(), clothes);
        return Response.status(200).entity("Yeah").build();
    }


    @DELETE
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteClothes(final @PathParam("id") Integer id) {
        clothesMap.remove(id);
        return Response.status(200).entity("Yeah").build();
    }

    @PUT
    public final Response replaceClothes(final Clothes clothes) {
        clothesMap.replace(clothes.getId(), clothes);
        return Response.status(200).entity("Yeah").build();
    }
}
