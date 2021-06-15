
package br.com.alura.threads;

public class RespostaMain {

	public static void main(String[] args) {
		Runnable tarefa = new ImprimeString();
		Thread threadImprime = new Thread(tarefa, "thread Imprime");
		threadImprime.start();
	}

}