package com.tickets;

public abstract class TicketsParks {
	
	// Instancia de variable o Instancia de objecto
	String welcomeMessage;
	
	//Constructor
	public TicketsParks() {
		this.welcomeMessage = "Bienvenidos a Cooltesters Parks - ";
	}
	
	public TicketsParks(String algo) {
		this.welcomeMessage = "Bienvenidos a Cooltesters Parks - ";
	}
	
	// Metodo obtener mensaje
	public String welcomeMessageString() {
		return this.welcomeMessage;
	}
	
	public abstract double getTicketPrice();
	public abstract void printPriceDay();
	public abstract void printPriceDay(String authKey, String priceDay);

}
