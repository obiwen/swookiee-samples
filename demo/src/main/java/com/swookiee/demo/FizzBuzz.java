package com.swookiee.demo;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/1/fizzbuzz")
public interface FizzBuzz {

    @GET
    @Produces(APPLICATION_JSON)
    @Path("{limit}")
    List<String> fizzbuzz(@PathParam("limit") Integer limit);
}
