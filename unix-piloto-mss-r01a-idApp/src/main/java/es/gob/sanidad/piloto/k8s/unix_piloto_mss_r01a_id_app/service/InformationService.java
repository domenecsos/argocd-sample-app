package es.gob.sanidad.piloto.k8s.unix_piloto_mss_r01a_id_app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import es.gob.sanidad.piloto.k8s.unix_piloto_mss_r01a_id_app.dto.NameValue;
import es.gob.sanidad.piloto.k8s.unix_piloto_mss_r01a_id_app.dto.NameValueList;

/**
 * Servicio que provee diversos valores que ayudan a entender como se ha desplegado la aplicación en K8s.
 */
@Service
public class InformationService {

	/** Valores definidos en el application.yml. */
	@Autowired
	Environment env;

	/** Algunos valores que mostramos del application.yml. */
	private final static String[] KNOWN_PROPS = { "a.b1.c1", "a.b2.c2" };

	/** Mostrar valores del application.yml. */
	public List<NameValue> props() {

		List<NameValue> props = new ArrayList<NameValue>();

		for (String prop : KNOWN_PROPS) {
			props.add(new NameValue(prop,env.getProperty(prop)));
		}

		return props;
	}
	
	/** Mostrar variables de entorno. */
	public List<NameValue> envvars() {

		List<NameValue> envvars = new ArrayList<NameValue>();

		Map<String, String> envMap = System.getenv();

		for (String envName : envMap.keySet()) {
			envvars.add(new NameValue(envName, envMap.get(envName)));
		}

		return envvars;
	}
	
	/** Mostrar entornos SpringBoot. */
	public List<NameValueList> profiles() {

		List<NameValueList> profiles = new ArrayList<NameValueList>();
		
		profiles.add(new NameValueList("activeProfiles", env.getActiveProfiles()));
		profiles.add(new NameValueList("defaultProfiles", env.getDefaultProfiles()));

		return profiles;
	}
}
