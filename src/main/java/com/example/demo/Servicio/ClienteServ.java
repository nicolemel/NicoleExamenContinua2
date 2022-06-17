package com.example.demo.Servicio;

import java.util.List;

import com.example.demo.DTO.ClienteRequest;
import com.example.demo.DTO.ClienteResponse;

public interface ClienteServ {
	
	public void guardarCliente(ClienteRequest cliente);
	public void editarCliente(ClienteRequest cliente);
	
	public void eliminarCliente(Integer id);
	
	public List<ClienteResponse> listarCliente();
	public ClienteResponse obtenerClienteId(Integer id);

}
