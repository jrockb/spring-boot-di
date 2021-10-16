package co.com.jcd.springboot.di.app.models.services;

// se usa una interfaz para desacoplar más, ya que la dependencia en una clase concreta puede
// cambiar, lo que puede dificultar el mantenimiento de la aplicación

public interface IServicio { 
	
	public String operacion();
							

}
