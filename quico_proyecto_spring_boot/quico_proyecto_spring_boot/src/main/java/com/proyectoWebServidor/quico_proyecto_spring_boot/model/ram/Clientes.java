package com.proyectoWebServidor.quico_proyecto_spring_boot.model.ram;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Clientes implements Serializable, Comparable<Clientes>{
	
	@Size(min = 5, message = "El nombre debe de tener un tamaño minimo de 5 carácteres")
	private String nombre;
	private String password;
	private String correo;
	@NotNull(message = "La edad no puede estar vacia")
	@Range(min = 18, max = 99, message = "La edad deve ser igual o mayor a 18 y menor o igual a 99")
	@Digits(integer = 2, fraction = 0, message = "La edad no puede tener decimales ni más de dos dígitos")
	private Integer edad;
	
	
	public Clientes(@Size(min = 5, message = "El nombre debe de tener un tamaño minimo de 5 carácteres") String nombre,
			String password, String correo,
			@NotNull(message = "La edad no puede estar vacia") @Range(min = 18, max = 99, message = "La edad deve ser igual o mayor a 18 y menor o igual a 99") @Digits(integer = 2, fraction = 0, message = "La edad no puede tener decimales ni más de dos dígitos") Integer edad) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.correo = correo;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	@Override
	public int compareTo(Clientes o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		return "Clientes [nombre=" + nombre + ", password=" + password + ", correo=" + correo + ", edad=" + edad + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(correo, edad, nombre, password);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		return Objects.equals(correo, other.correo) && Objects.equals(edad, other.edad)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(password, other.password);
	}
	
	
	
	
}