package ECommerce_Functions;

public class ServicoExporadico extends Servico {
	
	private int horasTrabalhadas;
	
	public ServicoExporadico(int id, String nome, float preco, String funcao, int turno, int horasTrabalhadas) {
	super(id, nome,  preco, funcao, turno);
	this.horasTrabalhadas = horasTrabalhadas;
	
	
}
	public int gethorasTrabalhadas() {
		return horasTrabalhadas;
	}
     public void sethorasTrabalhadas(int horasTrabalhadas) {
	    this.horasTrabalhadas = horasTrabalhadas;
}
 
     @Override
     public void visualizar() {
       super.visualizar();
     System.out.println("Horas Contratatadas: " + this.horasTrabalhadas + "horas");

}
}
