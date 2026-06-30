package ECommerce_Functions;

public class ServicoTemporario extends Servico {
	
		
		int diasContrato;
		
		
		public ServicoTemporario(int id, String nome, float preco, String funcao, int turno, int horasTrabalhadas, int diasContrato) {
			super(id, nome,  preco, funcao, turno);
			this.diasContrato = diasContrato;
		
		
	}
		public int getdiasContrato() {
			return diasContrato;
		}
	     public void setdiasContratos(int diasContrato) {
		    this.diasContrato = diasContrato;
	}
	 
	     @Override
	     public void visualizar() {
	       super.visualizar();
	     System.out.println("Quantidade de dias Contratatados: " + this.diasContrato + "Dias");

	}
	}


