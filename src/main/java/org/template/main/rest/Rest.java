package org.template.main.rest;

import org.template.main.domain.Domain;
import org.template.main.service.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class Rest {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Domain getDefaultJSON() throws Exception {
        Service service = new Service();
        return service.getDefaultDomain();
    }

}
