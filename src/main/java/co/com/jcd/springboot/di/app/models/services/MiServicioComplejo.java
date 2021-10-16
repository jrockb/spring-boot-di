package co.com.jcd.springboot.di.app.models.services; // todas las clases deben pertenecer al paquete padre ...app

import org.springframework.stereotype.Component;


//@Component("miServicioComplejo") 
public class MiServicioComplejo implements IServicio{ 
	
	@Override
	public String operacion() {
		return "ejecutando algun proceso importante complicado...";
	}

}
