package app.ito.poo;

import java.time.LocalDate;

import clases.ito.poo.Transporte;

public class MyApp {

	static void run() {
		System.out.println(new Transporte("Ford","Camioneta",100,LocalDate.of(2021,03,18), 4));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
		
	}
	

}
