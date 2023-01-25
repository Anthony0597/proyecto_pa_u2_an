package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
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
	@Autowired
	private IHabitacionService habitacionService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
				
		
		
		/*Hotel hotel = new Hotel();
		hotel.setNombre("Marriott");
		hotel.setDireccion("Av. Francisco de Orellana y Av. Amazonas");
		
		List<Habitacion> habitaciones = new ArrayList<>();
		
		Habitacion habi1 = new Habitacion();		
		habi1.setNumero("A001");
		habi1.setHotel(hotel);
		
		Habitacion habi2 = new Habitacion();		
		habi2.setNumero("A002");
		habi2.setHotel(hotel);
		
		Habitacion habi3 = new Habitacion();		
		habi3.setNumero("A003");
		habi3.setHotel(hotel);
		
		Habitacion habi4 = new Habitacion();		
		habi4.setNumero("A004");
		habi4.setHotel(hotel);
		
		habitaciones.add(habi1);
		habitaciones.add(habi2);
		habitaciones.add(habi3);
		habitaciones.add(habi4);
		
		hotel.setHabitaciones(habitaciones);
		
		
		//insertar un hotel
		this.hotelService.guardar(hotel);
		
		//actualizar el hotel
		hotel.setDireccion("Av. Patria y Av. Amazonas");
		this.hotelService.modificar(hotel);
		
		//buscar un hotel
		Hotel nuevoH = new Hotel();
		nuevoH = this.hotelService.buscar(hotel.getId());
		
		//eliminar un hotel
		this.hotelService.borrar(nuevoH.getId());*/
		
		
		Hotel tempH = this.hotelService.buscar(6);
		
		//Habitacion habi5 = this.habitacionService.buscar(15);
		
		//this.habitacionService.borrar(habi5.getId());
		
		System.out.println(tempH);
		
		/*List<Habitacion> habiList = tempH.getHabitaciones();
		
		
		for(Habitacion h : habiList) {
			Habitacion temp = h;
			System.out.println(temp);
		}*/
		
	}

}
