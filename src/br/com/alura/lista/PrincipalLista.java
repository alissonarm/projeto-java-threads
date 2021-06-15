package br.com.alura.lista;

public class PrincipalLista {

	public static void main(String[] args) throws InterruptedException {

		Lista lista = new Lista();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElemento(lista, i)).start();
		} 
		
		new Thread(new TarefaImprimir(lista)).start();
		
//		Thread.sleep(1000);
//		for (int i = 0; i < lista.tamanho(); i++) {
//			System.out.println(i + " - " + lista.pegaElemento(i));
//		}
		
	}

}
