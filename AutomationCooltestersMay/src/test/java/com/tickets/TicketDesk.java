package com.tickets;

public class TicketDesk {

	public static void main(String[] args) {
		// Inputs
		double price = 100;	
		boolean isStudent = true;
		int age = 20;
		
//	TicketsParks ticket2 = new TicketsPark();
//		
//		CoolParkTicket coolTicket = new CoolParkTicket(price, isStudent, age);
		
		TicketsParks ticket = new CoolParkTicket(price, isStudent, age);
		ticket.printPriceDay();
		double coolprice = ticket.getTicketPrice();
		
		TestersParkTicket ticket3 = new TestersParkTicket(price, isStudent, age);
		
		//Testers Park
		ticket = new TestersParkTicket(price, isStudent, age, 20);
		ticket.printPriceDay("halsshh", ticket3.priceEspecialDay());
		double testersprice = ticket.getTicketPrice();
		
		System.out.println("La suma de mis tickets es : "+ sumTickets(coolprice, testersprice));
		
		//Si es nino y estudiante que me de otro
		//Utilizar el metodo prinPriceDay con la key como parametro
		//Agregar un constructor a la clase testersParkTicket que tenga un descuento especial
		//Generar un metodo static en TicketDesk que sume el total de los tickets e imprima el precio final

	}
	
	public static double sumTickets(double ticket1, double ticket2) {
		return ticket1 + ticket2;
	}

}
