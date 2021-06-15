package br.com.alura.lista;

import java.util.List;

public class TarefaAdicionarElemento2 implements Runnable {

	private List<String> lista;
	private int numeroDoThread;

	public TarefaAdicionarElemento2(List<String> lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			lista.add("Thread " + numeroDoThread + " - " + i);
		}
	}
	
	

}
