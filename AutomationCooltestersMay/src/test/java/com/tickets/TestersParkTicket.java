package com.tickets;

public class TestersParkTicket extends TicketsParks {
	double adultTicket;
	double childTicket;
	double studentTicket;
	boolean student = false;
	String priceDay;
	String park;
	int age;

	public TestersParkTicket(double price, boolean student, int age) {
		super();
		this.adultTicket = price;
		this.childTicket = price * (0.85);
		this.studentTicket = price * (0.6);
		this.student = student;
		this.priceDay = "Precio dia regular";
		this.park = "Testers Park - ";
		this.age = age;
	}
	
	public TestersParkTicket(double price, boolean student, int age, int discont) {
		super();
		this.adultTicket = price - discont;
		this.childTicket = (price * (0.85)) - discont;
		this.studentTicket = (price * (0.6)) - discont;
		this.student = student;
		this.priceDay = "Precio ESPECIAL";
		this.park = "Testers Park - ";
		this.age = age;
	}

	// Encapsulation
	private void setPriceDay(String priceDay) {
		this.priceDay = priceDay;
	}

	private String getPriceDay() {
		return priceDay;
	}

	@Override
	public double getTicketPrice() {
		double priceTicket;

		if (age >= 18 && !student) {
			priceTicket = adultTicket;
			System.out.println("Precio Adulto: $" + adultTicket);
		} else if (age >= 18 && student) {
			priceTicket = studentTicket;
			System.out.println("Precio Estudiante: $" + studentTicket);
		} else {
			priceTicket = childTicket;
			System.out.println("Precio Nino: $" + childTicket);
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
	
	public String priceEspecialDay() {
		return getPriceDay();
	}

}
