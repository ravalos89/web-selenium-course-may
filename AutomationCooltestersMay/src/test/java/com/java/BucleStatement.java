package com.java;

public class BucleStatement {

	public static void main(String[] args) {
		
		//While
		
		int numero = 1;
		while(numero <=10) {
			
			//BLOCKCODE
			System.out.println("el numero es :"+numero);
			++numero;
		}
		
		// Do While
		// Cuantas veces se tiene que sumar un mismo numero para llegar a 100?
		
		int numeroLimite = 20;
		int sumTotal = 0;
		int count = 0;
		
		do {
//			sumTotal = sumTotal + numeroLimite;
			sumTotal += numeroLimite;
//			++count;
			count++;
//			count = count + 1;
			
		} while (sumTotal < 100);
		
		System.out.println("El numero se sumo = "+count);
		
		// FOR
		
		int numeroFor = 10;
		
		for(int i = 1; i <=numeroFor; i++) {
			System.out.println("El numero for es "+ i);
		}
	}

}
