package pl.example.train.schedule.resource;

import pl.example.train.schedule.model.RailConnection;
import pl.example.train.schedule.model.RailConnectionQuery;
import pl.example.train.schedule.service.RailConnectionService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/connections")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
public class RailConnectionResource {

    @Inject
    private RailConnectionService railConnectionService;

    @GET
    public Response getConnections(@BeanParam RailConnectionQuery railConnectionQuery) {
        List<RailConnection> railConnections = railConnectionService.findConnections(railConnectionQuery);
        return Response.ok(railConnections).build();
    }

}
