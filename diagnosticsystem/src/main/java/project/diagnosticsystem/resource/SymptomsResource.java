package project.diagnosticsystem.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import project.diagnosticsystem.model.Symptom;
import project.diagnosticsystem.service.SymptomService;

@Path("/symptoms")
public class SymptomsResource {

	SymptomService service = new SymptomService();

	@GET
	@Path("/{bodyarea}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Symptom> getSymptoms(@PathParam("bodyarea") String bodyarea) {
		return service.getSymptoms(bodyarea);
	}

}
