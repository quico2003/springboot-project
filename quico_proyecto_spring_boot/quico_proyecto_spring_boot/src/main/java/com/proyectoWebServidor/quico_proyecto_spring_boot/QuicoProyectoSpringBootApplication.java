package com.proyectoWebServidor.quico_proyecto_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.proyectoWebServidor")
public class QuicoProyectoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuicoProyectoSpringBootApplication.class, args);
	}

}
