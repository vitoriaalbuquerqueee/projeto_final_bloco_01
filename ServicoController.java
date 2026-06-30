package ECommerce_Functions;

import java.util.ArrayList;

public class ServicoController {


    private ArrayList<Servico> listaServicos = new ArrayList<>();


    public void cadastrar(Servico servico) {
        listaServicos.add(servico);
        System.out.println("Serviço cadastrado com sucesso!");
    }

    
    public void listarTodas() {
        for (Servico s : listaServicos) {
            s.visualizar();
        }
    }
}
