package com.proyectoWebServidor.quico_proyecto_spring_boot.srv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.StaticApplicationContext;
import org.springframework.stereotype.Service;

import com.proyectoWebServidor.quico_proyecto_spring_boot.model.ram.Clientes;

@Service
public class LoginService {
	
	//ArrayList que guarda los clientes
	private static List<Clientes> clientes = new ArrayList<Clientes>();

	//Usuarios prueba creados por teclado
	static {
		clientes.add(new Clientes("Quico", "Quicoquico", "quico@gmail.com", 20));
		clientes.add(new Clientes("Valeria", "Valeriavaleria", "valeria@gmail.com", 19));
		}
	
	//Comprovacion de si usuario existe en el arrayList
	public boolean verificarAlumno(String nombre, String password) {
		
		//En existeCliente buscara si existe y retorna true o false
		boolean existeCliente = clientes.stream()
				.anyMatch(cliente -> cliente.getNombre().equals(nombre) && 
						cliente.getPassword().equals(password));
		
		return existeCliente;
	}
	
	//Metodo para añadir un cliente al arrayList
	public void addCliente(Clientes cliente) {
		clientes.add(cliente);
	}
	
}