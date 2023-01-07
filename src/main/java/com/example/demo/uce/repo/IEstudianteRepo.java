package com.example.demo.uce.repo;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	
	//CRUD siempre por pk
	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public void eliminar(Integer id);
}
