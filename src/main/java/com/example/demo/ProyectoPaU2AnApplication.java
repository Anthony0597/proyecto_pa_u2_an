package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
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
		/*Estudiante estu = new Estudiante();
		estu.setNombre("Anthony");
		estu.setApellido("Naranjo");
		estu.setCedula("1765894532");
		estu.setCiudad("Quito");
		estu.setGenero("M");
		//this.estudianteService.agregar(estu);*/
		
		Ciudadano ciu= new Ciudadano();
		Empleado empl = new Empleado();
		
		ciu.setNombre("Edison");
		ciu.setApellido("Cayambe");
		
		 
		
		empl.setSalario(new BigDecimal(200));
		empl.setFechaIngreso(LocalDateTime.now());
		ciu.setEmpleado(empl);
		empl.setCiudadano(ciu);
		
		this.ciudadanoService.guardar(ciu);
		
		
		Ciudadano tempC;
		tempC = this.ciudadanoService.mostrar(3);
		tempC.setNombre("Juan");
		tempC.setApellido("Perez");
		this.ciudadanoService.modificar(tempC);
		
		this.ciudadanoService.borrar(ciu.getId());
		
		Empleado tempE;
		tempE = this.empleadoService.mostrar(2);
		tempE.setSalario(new BigDecimal(300));
		this.empleadoService.modificar(tempE);
				
		
	}

}
