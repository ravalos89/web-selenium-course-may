package com.java;

public class LimiteVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad = 80; // KM/H
		int limiteVelocidad = 100; // Calle, avenida

//		if(velocidad > limiteVelocidad) {
//			System.out.println("MULTA!!");
//		}else {
//			System.out.println("El coche va en la velocidad adecuada");
//		}

		// IF anidado / IF ELSE

		boolean highway = false;

		if (highway) {
			System.out.println("Estamos conduciendo en una highway");

			limiteVelocidad = 120;

			if (velocidad > limiteVelocidad) {
				System.out.println("MULTA!!");
			} else {
				System.out.println("El coche va en la velocidad adecuada");
			}

		} else if (velocidad > limiteVelocidad) {
			System.out.println("El coche esta en una calle y va a exceso de velocidad, MULTA!!");
		} else {
			System.out.println("El coche estan en una calle y va a una velocidad permitida");
		}

		// Switch Case

		int temperatura = 87;

		switch (temperatura) {
		case 5:
			System.out.println("Mucho frio");
			break;

		case 10:
			System.out.println("Frio");
			break;

		case 20:
		case 25:
			System.out.println("Templado");
			break;

		case 35:
			System.out.println("Calor");
			break;

		default:
			System.out.println("No encontro relacion con la temperatura");
			break;
		}

	}

}
