package com.tickets;

public class CoolParkTicket extends TicketsParks {

	double adultTicket;
	double childTicket;
	double studentTicket;
	boolean student = false;
	String priceDay;
	String park;
	int age;

	public CoolParkTicket(double price, boolean student, int age) {
		super("algo");
		this.adultTicket = price;
		this.childTicket = price * (0.80);
		this.studentTicket = price * (0.5);
		this.student = student;
		this.priceDay = "Precio dia regular";
		this.park = "Cool Park - ";
		this.age = age;
	}
	
	//Encapsulation
	private void setPriceDay(String priceDay) {
		this.priceDay = priceDay;
	}
	
	private String getPriceDay() {
		return priceDay;
	}

	@Override
	public double getTicketPrice() {
		double priceTicket;
		
		if(age>=18 && !student) {
			priceTicket = adultTicket;
			System.out.println("Precio Adulto: $"+adultTicket);
		}else if(age>=18 && student) {
			priceTicket = studentTicket;
			System.out.println("Precio Estudiante: $"+studentTicket);		
		}else if(age<18 && student){
			priceTicket = studentTicket - 20;
		}else {
			priceTicket = childTicket;
			System.out.println("Precio Nino: $"+childTicket);
		}
		return priceTicket;
	}

	@Override
	public void printPriceDay() {
		System.out.println(welcomeMessageString() + park + getPriceDay());
	}
	
	@Override
	public void printPriceDay(String authKey, String priceDay) {
		setPriceDay(priceDay);
		System.out.println(welcomeMessageString() + park + getPriceDay());
	}

}
