package es.gob.sanidad.piloto.k8s.unix_piloto_mss_r01a_id_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class UnixPilotoMssR01aIdApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnixPilotoMssR01aIdApplication.class, args);
	}

	@Bean
	public Docket addSwagger() {
		// La publcación de Swagger está sujeta a server.servlet.context-path: /api
		return new Docket(DocumentationType.SWAGGER_2).select() //
				.apis(RequestHandlerSelectors.basePackage("es.gob.sanidad.piloto.k8s.unix_piloto_mss_r01a_id_app"))
				.build();
	}
}
