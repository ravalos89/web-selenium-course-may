package com.java;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aritmeticos
		
		int x = 6;
		int y = 4;
		
		int z = (x + y) + (x + y);
		
		System.out.println("El valor de la variable Z = " + z);
		
		// Unarios
		
		int A = 1;
		int B = 2;
		
		++A;
		--B;
		
		A=4;
		
		System.out.println("El valor de A es "+A);
		System.out.println("El valor de B es "+B);
		
		// Relacionales
		
		if(B < A) {
			System.out.println("Block code");
		}
		
		// Condicionales
		
		int var1 = 4;
		int var2 = 3;
		int var3 = 7;
		int var4 = 7;
		
		if(var1 == var2 || var3 == var4) {
			System.out.println("Conditional Block code");
		}

	}

}
