package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2AnApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IEmpleadoService empleadoService;
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
				
		/*Ciudadano ciu= new Ciudadano();
		Empleado empl = new Empleado();
		
		ciu.setNombre("Edison");
		ciu.setApellido("Cayambe");
		
		 
		
		empl.setSalario(new BigDecimal(200));
		empl.setFechaIngreso(LocalDateTime.now());
		ciu.setEmpleado(empl);
		empl.setCiudadano(ciu);
		
		this.ciudadanoService.guardar(ciu);*/
		
		
		//Ejemplo 2:
		
		/*Empleado empl2 = new Empleado();
		empl2.setSalario(new BigDecimal(200));
		empl2.setFechaIngreso(LocalDateTime.now());
		
		
		Ciudadano ciu2 = new Ciudadano();
		ciu2.setNombre("Juan");
		ciu2.setApellido("Perez");
		
		ciu2.setEmpleado(empl2);
		
		empl2.setCiudadano(ciu2);
		
		this.empleadoService.guardar(empl2);*/
		
		Hotel hotel = new Hotel();
		
		Habitacion habitacion = new Habitacion();
		
	}

}
