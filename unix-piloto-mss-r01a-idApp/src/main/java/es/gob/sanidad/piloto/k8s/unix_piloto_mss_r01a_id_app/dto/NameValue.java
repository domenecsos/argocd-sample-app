package es.gob.sanidad.piloto.k8s.unix_piloto_mss_r01a_id_app.dto;


public class NameValue { 
	private String name;
	private String value;	
	public NameValue(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
