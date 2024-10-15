package com.proyectoWebServidor.quico_proyecto_spring_boot.model.ram;

public class Pagina{
	
	String titulo;
	String paginaActiva;
	
	
	public Pagina(String titulo, String paginaActiva) {
		super();
		this.titulo = titulo;
		this.paginaActiva = paginaActiva;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getPaginaActiva() {
		return paginaActiva;
	}


	public void setPaginaActiva(String paginaActiva) {
		this.paginaActiva = paginaActiva;
	}
}