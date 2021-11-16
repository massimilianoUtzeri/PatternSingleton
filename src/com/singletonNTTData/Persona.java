package com.singletonNTTData;

public class Persona {
	
	private static Persona instance;
	private String nombre;
	private String apellido;
	
	private Persona(){	
	}
	
	private Persona(String nombre,String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public static Persona getInstance(String nombre,String apellido) {
		if(instance==null) {
			instance = new Persona(nombre,apellido);
		}
		return instance;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	

}
