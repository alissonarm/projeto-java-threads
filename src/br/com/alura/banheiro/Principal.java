package br.com.alura.banheiro;

public class Principal {

	public static void main(String[] args) {

		Banheiro banheiro = new Banheiro();
		
		Thread a = new Thread(new TarefaNumero1(banheiro), "Joao   =   ");
		Thread b = new Thread(new TarefaNumero2(banheiro), "Emilio ==  ");
		Thread c = new Thread(new TarefaNumero3(banheiro), "Jorge  === ");
		Thread l = new Thread(new TarefaLimpeza(banheiro), "Limpeza!");
		l.setDaemon(true);

		a.start();
		b.start();
		c.start();
		l.start();

//		NEW      - Uma thread foi criada mas ainda n�o foi iniciada.
//		RUNNABLE - A thread est� rodando dentro da JVM.
//		BLOCKED  - A thread foi bloqueada pois n�o conseguiu pegar a chave.
//		WAITING  - A thread est� esperando pois foi chamado this.wait().
//		TIMED_WAITING - A thread est� esperando pois foi chamado this.wait(milis).
//		TERMINATED - A thread est� finalizada
		
		
		
	}

}
