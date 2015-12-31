package com.tsaltas.agent;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

@Path(AgentResource.PATH)
public class AgentResource {
	public static final String PATH = "/agent";

	@Timed
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Agent createAgent(
		@Valid final Agent agent
	) {
		return agent; // Deserialize agent, serialize agent, and return back as JSON
	}
}
