package Hijos;

import java.util.Iterator;

public class Principal implements Runnable {
	
	private static final int NUM_SALUDO =5;
	private static final int NUM_HIJO = 4;
	int id;
	
	public Principal(int id) {
		this.id = id;
	}
	
	public void run() {
		for (int i = 0; i < NUM_SALUDO; i++) {
			System.out.println("soy el hijo"+ id);
		}
	}

	public static void main(String[] args) {
		
		for(int i=0; i<NUM_HIJO;i++) {
			Principal hijo = new Principal(i);
			Thread t = new Thread(hijo);
			t.start();
		}
		
		for (int i = 0; i <NUM_SALUDO; i++) {
			System.out.println("Soy el principal");
		}

	}

}
