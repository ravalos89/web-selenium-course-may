package com.perro;

public class Perro {
	
	 String varTamanoPerro;
	 String varSexoPerro;
	 String varColorPerro;
	 int varNumeroPatas;
	 
	 public Perro() {
		 
	 }
	 public Perro(String tamanoPerro, String sexoPerro, String colorPerro) {
		 this.varTamanoPerro = tamanoPerro;
		 this.varSexoPerro = sexoPerro;
		 this.varColorPerro = colorPerro;
		 this.varNumeroPatas = 4;
	 }
	 
	 public Perro(String tamanoPerro, String sexoPerro, String colorPerro, int numeroPatas) {
		 this.varTamanoPerro = tamanoPerro;
		 this.varSexoPerro = sexoPerro;
		 this.varColorPerro = colorPerro;
		 this.varNumeroPatas = numeroPatas;
	 }

}
