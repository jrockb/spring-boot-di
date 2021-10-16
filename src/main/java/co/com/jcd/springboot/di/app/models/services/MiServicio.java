package co.com.jcd.springboot.di.app.models.services; // todas las clases deben pertenecer al paquete padre ...app

import org.springframework.stereotype.Component;

@Component //tambien se puede usar @Service, no hay diferencia entre ambas anotaciones
public class MiServicio {
	
	public String operacion() {
		return "ejecutando algun proceso importante...";
	}

}
