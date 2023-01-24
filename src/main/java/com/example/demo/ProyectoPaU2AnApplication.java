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
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2AnApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IEmpleadoService empleadoService;
	@Autowired
	private ICiudadanoService ciudadanoService;
	@Autowired
	private IHotelService hotelService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
				
		
		
		Hotel hotel = new Hotel();
		hotel.setNombre("Marriott");
		hotel.setDireccion("Av. Francisco de Orellana y Av. Amazonas");
		
		//insertar un hotel
		this.hotelService.guardar(hotel);
		
		//actualizar el hotel
		hotel.setDireccion("Av. Patria y Av. Amazonas");
		this.hotelService.modificar(hotel);
		
		//buscar un hotel
		Hotel nuevoH = new Hotel();
		nuevoH = this.hotelService.buscar(1);
		
		//eliminar un hotel
		this.hotelService.borrar(nuevoH.getId());
		
	}

}
