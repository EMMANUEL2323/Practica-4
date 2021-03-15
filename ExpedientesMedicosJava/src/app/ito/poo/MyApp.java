package app.ito.poo;

import java.time.LocalDate;

import clases.ito.poo.Expedientes;

public class MyApp {

	static void run() {
		System.out.println(new Expedientes("Emmanuel","DIVE2155515",LocalDate.of(2001, 04,28),LocalDate.of(2021, 03,15),"tos","Infeccion en la garganta","Ambroxol"));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();	
	}
}
