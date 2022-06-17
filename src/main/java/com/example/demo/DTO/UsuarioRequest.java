package com.example.demo.DTO;

public class UsuarioRequest {

	
	private String usuario;
	private String password;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UsuarioRequest() {
		// TODO Auto-generated constructor stub
	}
	public UsuarioRequest(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}
	
	
	
}
