package ECommerce_Functions;

public class Servico {

	
		private String nome;
		private float preco;
		private String funcao;
		private int turno;
		
		public  Servico(String nome, float preco, String funcao, int turno) {
			this.nome= nome;
			this.preco = preco;
			this.funcao = funcao;
			this.turno = turno;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public  float getPreco() {
			return preco;
		}
		public void setPreco(float preco) {
			this.preco = preco;
		}
		public String getFuncao() {
			return funcao;
		}
		public void setFuncao(String funcao) {
			this.funcao = funcao;
		}
		public int getTurno() {
			return turno;
		}
		public void  setTurno(int turno) {
			this.turno = turno;
		}
		
		
		public void visualizar() {
	
        String categoria = " ";
		switch(this.turno) {
			case 1: categoria = "Freelancers Exporadicos ";
			break;
			case 2: categoria = "Freelancers Temporarios ";
			break;
			default: categoria = "Inválido";
		}
		
		System.out.println("Categoria: " + categoria);
		
		}
}


