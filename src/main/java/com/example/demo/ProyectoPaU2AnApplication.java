package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.service.IAutorService;
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
	@Autowired
	private IAutorService autorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Autor autor = new Autor();
		autor.setNombre("ws");
		
		
		Set<Autor>autores = new HashSet<>();
		autores.add(autor);	
		Libro libro1 = new Libro();
		libro1.setNombre("P. Web");
		libro1.setEditorial("Patito");
			
		libro1.setAutores(autores);
		Libro libro2 = new Libro();
		libro2.setNombre("Redes");
		libro2.setEditorial("Patito");
		libro2.setAutores(autores);
		
		Set<Libro>libros = new HashSet<>();
		libros.add(libro1);
		libros.add(libro2);
		
		autor.setLibros(libros);
		
		this.autorService.insertar(autor);
	}

}
