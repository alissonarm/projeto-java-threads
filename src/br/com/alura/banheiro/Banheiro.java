package br.com.alura.banheiro;

public class Banheiro {

	private boolean ehSujo = true;

	public void fazNumero1() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + "Chegou ======================");

		synchronized (this) {
			System.out.println(nome + " Entrando no banheiro");

			while (ehSujo) {
				esperaLaFora(nome);
			}

			dormeUmPouco(2000);

			this.ehSujo = true;
			System.out.println(nome + " Dando Descarga");
			System.out.println(nome + " Lavando a mão");
			System.out.println(nome + " Saindo do banheiro");
		}

	}

	public void fazNumero2() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + "Chegou ======================");

		synchronized (this) {
			System.out.println(nome + " Entrando no banheiro");

			while (ehSujo) {
				esperaLaFora(nome);
			}

			dormeUmPouco(3000);

			this.ehSujo = true;
			System.out.println(nome + " Dando Descarga");
			System.out.println(nome + " Lavando a mão");
			System.out.println(nome + " ============== Saindo do banheiro");
		}

	}

	public void fazNumero3() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + "Chegou ======================");

		synchronized (this) {

			System.out.println(nome + " Entrando no banheiro");

			while (ehSujo) {
				esperaLaFora(nome);
			}

			System.out.println(nome + " Ligando o chuveiro");
			System.out.println(nome + " Lavando o corpo");
			System.out.println(nome + " Lavando a cabeça");

			dormeUmPouco(10000);

			this.ehSujo = true;
			System.out.println(nome + " Desligando o chuveiro");
			System.out.println(nome + " Se enxugando");
			System.out.println(nome + " ===================== Saindo do banheiro");

		}
	}

	public void limpa() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + "Esperando a hora de comecar a limpeza!");

		synchronized (this) {

			System.out.println("==================================Coomeçou a limpeza !!!");;

			if (!ehSujo) {
				System.out.println(nome + " Pronto. Banhheiro limpo!!!");
				return;
			}

			System.out.println(nome + " Liberando o banheiro para o proximo !!!");
			this.ehSujo = false;

			dormeUmPouco(6000);

			this.notifyAll();

			System.out.println(" === O BANHEIRO ESTA LIMPO! PODEM USAR !!! ==========");
		}

	}

	private void esperaLaFora(String nome) {
		System.out.println(nome + " BANHEIRO ESTA SUJO!!!");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void dormeUmPouco(long millisegundos) {
		try {
			Thread.sleep(millisegundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
