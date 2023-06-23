package es.gob.sanidad.piloto.k8s.unix_piloto_mss_r01a_id_app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.gob.sanidad.piloto.k8s.unix_piloto_mss_r01a_id_app.dto.NameValue;
import es.gob.sanidad.piloto.k8s.unix_piloto_mss_r01a_id_app.dto.NameValueList;
import es.gob.sanidad.piloto.k8s.unix_piloto_mss_r01a_id_app.service.InformationService;

/**
 * La publcación de esta API está sujeta a server.servlet.context-path: /api
 */
@RestController
public class InformationController {

	@Autowired
	InformationService infoSvc;

	@GetMapping("/props")
	public List<NameValue> props() {
		return infoSvc.props();
	}

	@GetMapping("/envvars")
	public List<NameValue> envvars() {
		return infoSvc.envvars();
	}

	@GetMapping("/profiles")
	public List<NameValueList> profiles() {
		return infoSvc.profiles();
	}
}