package com.example.demo.Servicio;

import java.util.List;

import com.example.demo.DTO.ProductoRequest;
import com.example.demo.DTO.ProductoResponse;

public interface ProductoServ {
	
	public void guardarProductos(ProductoRequest producto);
	public void editarProductos(ProductoRequest producto);
	
	public void eliminarProductos(Integer id);
	
	public List<ProductoResponse> listarProducto();
	public ProductoResponse obtenerProductoId(Integer id);

}
