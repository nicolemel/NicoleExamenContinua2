package com.example.demo.DTO;

public class UsuarioResponse {
	private String token;

	public UsuarioResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
