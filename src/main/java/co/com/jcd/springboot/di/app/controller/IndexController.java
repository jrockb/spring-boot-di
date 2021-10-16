package co.com.jcd.springboot.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.com.jcd.springboot.di.app.models.services.IServicio;

@Controller
public class IndexController {
	
	@Autowired // inyectar un objeto que está registrado en el contenedor de Spring
	private IServicio servicio; // al inyectar la interfaz el código queda aún menos acoplado
	
	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";		
	}

}
