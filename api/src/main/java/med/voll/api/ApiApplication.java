package med.voll.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}

// https://start.spring.io/
// http://localhost:8080/medicos?size=1&page=2
// http://localhost:8080/medicos?sort=nome&sort=crm
// http://localhost:8080/medicos?sort=nome&sort=crm,desc
// http://localhost:8080/medicos?sort=nome&sort=crm,desc&size=2&page=1
