package co.com.jcd.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import co.com.jcd.springboot.di.app.models.services.IServicio;
import co.com.jcd.springboot.di.app.models.services.MiServicio;
import co.com.jcd.springboot.di.app.models.services.MiServicioComplejo;

@Configuration // permite realizar la inyección de dependencias de beans, cuando estos no tienen las anotaciones 
public class AppConfig { // siempre debe estar dentro del paquete principal (...app) o subpaquetes de este
	
	@Primary // definir el bean por defecto para la inyección
	@Bean("miServicioSimple") // para inyectar el bean especificado
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo") // para inyectar el bean especificado, el calificador tambien se puede usar en la inyección
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}


}
