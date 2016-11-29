//Disease.java
package project.diagnosticsystem.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disease {
	private String diseaseName;
	private String description;
	private String severity;
	private String areas;

	public Disease(String diseaseName, String description, String severity, String areas) {
		super();
		this.diseaseName = diseaseName;
		this.description = description;
		this.severity = severity;
		this.areas = areas;
	}

	public Disease() {
		super();
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getAreas() {
		return areas;
	}

	public void setAreas(String areas) {
		this.areas = areas;
	}

}
