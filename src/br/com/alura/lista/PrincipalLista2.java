package br.com.alura.lista;


import java.util.List;
import java.util.Vector;

public class PrincipalLista2 {

	public static void main(String[] args) throws InterruptedException {

//		List<String> lista = Collections.synchronizedList(new ArrayList<>());
		List<String> lista = new Vector<String>();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElemento2(lista, i)).start();
		} 
		
		Thread.sleep(1000);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i + " - " + lista.get(i));
		}
		
	}

}
