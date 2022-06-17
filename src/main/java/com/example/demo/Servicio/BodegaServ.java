package com.example.demo.Servicio;

import com.example.demo.DTO.BodegaRequest;
import com.example.demo.DTO.BodegaResponse;



public interface BodegaServ {

	public void guardarBodega(BodegaRequest bodega);
	public void editarBodega(BodegaRequest bodega);
	
	public void eliminarBodega(Integer id);
	
	public java.util.List<BodegaResponse> listarBodega();
	public BodegaResponse obtenerBodegaId(Integer id);
}
