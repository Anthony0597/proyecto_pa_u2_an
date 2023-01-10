package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {
	public void agregar(Estudiante estu);
	public void modificar(Estudiante estu);
	public Estudiante buscarEstu(Integer id);
	public void borrar(Integer id);
}
