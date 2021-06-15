package br.com.alura.banco;

public class TarefaAcessaBancoProcedimento implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessaBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {

		synchronized (pool) {
			System.out.println("comecando a tx");
			tx.begin();
			
			synchronized (tx) {
				System.out.println("pegue a conexao");
				pool.getConnection();
			}
			
		}
		
	}

}
