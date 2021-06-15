package br.com.alura.threads;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Isso é o thread main");
		
		Thread.sleep(10000); // wait por 10 segundos
		
		for (int i = 0; i < 50; i++) {
			System.out.println(i);
			Thread.sleep(1000); // wait por 1 segundos
		} 
		
	}

}
