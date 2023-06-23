package es.gob.sanidad.piloto.k8s.unix_piloto_mss_r01a_id_app.dto;


public class NameValueList { 
	private String name;
	private String[] valueList;
	public NameValueList(String name, String[] valueList) {
		super();
		this.name = name;
		this.valueList = valueList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getValueList() {
		return valueList;
	}
	public void setValueList(String[] valueList) {
		this.valueList = valueList;
	}	
}
