package project.diagnosticsystem.service;

import java.util.List;

import project.diagnosticsystem.database.Database;
import project.diagnosticsystem.model.Symptom;

public class SymptomService {
	public List<Symptom> getSymptoms(String bodyarea) {
		Database d = new Database();
		return d.getSymptomList(bodyarea);
	}
}
