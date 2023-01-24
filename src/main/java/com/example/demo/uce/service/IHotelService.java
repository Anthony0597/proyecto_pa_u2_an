package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelService {
	public void guardar(Hotel hotel);
	public void modificar(Hotel hotel);
	public Hotel buscar(Integer id);
	public void borrar(Integer id);
}
