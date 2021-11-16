package com.singleton.clasePrincipal;

import com.singletonNTTData.Persona;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		Persona p1 = Persona.getInstance("Massimiliano","Utzeri");
		
		Persona p2 = Persona.getInstance("Alejandro","Ramirez");
	
		Persona p3 = Persona.getInstance("Juan","Alvarez");
		
		System.out.println(p1.toString()+"\n"+p2.toString()+"\n"+p3.toString());

	}

}
