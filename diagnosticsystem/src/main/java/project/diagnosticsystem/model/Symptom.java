//Symptom.java
package project.diagnosticsystem.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Symptom {
	private String name;
	private String areas;

	public Symptom(String name, String areas) {
		super();
		this.name = name;
		this.areas = areas;
	}

	public Symptom() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAreas() {
		return areas;
	}

	public void setAreas(String areas) {
		this.areas = areas;
	}

}
