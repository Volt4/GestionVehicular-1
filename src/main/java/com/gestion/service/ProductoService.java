package com.gestion.service;

import java.util.List;

import com.gestion.model.Producto;

public interface ProductoService {
	public List<Producto> getAllProductos();
	
	public List<Producto> findByNombre(String nombre);
	
	void save(Producto producto) throws Exception;
	
}
