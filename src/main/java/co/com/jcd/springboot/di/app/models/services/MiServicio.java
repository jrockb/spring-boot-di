package co.com.jcd.springboot.di.app.models.services; // todas las clases deben pertenecer al paquete padre ...app

import org.springframework.stereotype.Component;
// "miServicioSimple" es un calificador que indica al controlador cual implementación de la interfaz se va usar
@Component("miServicioSimple") //tambien se puede usar @Service, no hay diferencia entre ambas anotaciones
public class MiServicio implements IServicio{ // un servicio siempre debe tener un constructor vacío o por defecto
	
	@Override
	public String operacion() {
		return "ejecutando algun proceso importante...";
	}

}
