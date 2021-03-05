package app.ito.poo;

import java.time.LocalDate;

import clases.ito.poo.Composicion;

public class MyApp {

	static void run() {
		System.out.println(new Composicion("Believer",(float) 3.25,"Imagine Dragons","Rock Alternativo", LocalDate.of(2021, 2,18),LocalDate.of(2021, 2,18)));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}

}
