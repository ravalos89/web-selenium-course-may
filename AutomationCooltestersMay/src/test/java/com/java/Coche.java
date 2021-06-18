package com.java;

public class Coche {
	
	public String llantas;
	public String marca;
	
	//Constructor
	
//	public Coche(String llantas, String marca) {
//		this.llantas = llantas;
//		this.marca = marca;
//	}
	
	//Overloading
	public static int operador(int x, int y) {
		return x+y;
	}
	
	public static int operador(int x, int y, int z) {
		return x+y+z;
	}
	
	public static int operador(int x, int y, int z, int a) {
		return x+y+z+a;
	}
	
	public static int operador(boolean b) {
		return 1+1;
	}
	
	public static int operador(int c) {
		
		switch(c) {
		
		case 1:
			return 1+1;
		case 2:
			return 2+2;
			
		}
		
		return 3+3;
	}

}
