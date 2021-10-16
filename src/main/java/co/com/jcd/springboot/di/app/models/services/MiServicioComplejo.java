package co.com.jcd.springboot.di.app.models.services; // todas las clases deben pertenecer al paquete padre ...app

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary // indica al contenedor que este bean es el que se va a inyectar, cuando no se especifica en el controller
@Component("miServicioComplejo") 
public class MiServicioComplejo implements IServicio{ 
	
	@Override
	public String operacion() {
		return "ejecutando algun proceso importante complicado...";
	}

}
