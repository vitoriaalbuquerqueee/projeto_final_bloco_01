package ECommerce_Functions;
import java.io.IOException;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao;
        while (true) {
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("      SISTEMA DE E-COMMERCE (Function Company)       ");       ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("            1 - Listar todos os Produtos             ");
            System.out.println("            2 - Listar Produto pelo ID               ");
            System.out.println("            3 - Cadastrar Produto                    ");
            System.out.println("            4 - Atualizar Produto                    ");
            System.out.println("            5 - Deletar Produto                      ");
            System.out.println("            6 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");

            opcao = leia.nextInt();

            if (opcao == 6) {
                System.out.println("\nE-commerce - Obrigado por utilizar nosso sistema!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n Listar todos os Produtos\n");
                    keyPress();
                    break;
                case 2:
                    System.out.println("\n Listar Produto pelo ID\n");
                    keyPress();
                    break;
                case 3:
                    System.out.println("\n Cadastrar Produto\n");
                    keyPress();
                    break;
                case 4:
                    System.out.println("\n Atualizar Produto\n");
                    keyPress();
                    break;
                case 5:
                    System.out.println("\n Deletar Produto\n");
                    keyPress();
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    keyPress();
                    break;
        }
     }
   }
public static void sobre() {
System.out.println("\n*****************************************************");
System.out.println("Projeto Desenvolvido por: Vitória Albuquerque");
System.out.println("Generation Brasil - vitoria@generation.org");
System.out.println("github.com/vitoriaalbuquerqueee");
System.out.println("*****************************************************");
    }

    public static void keyPress() {
        try {
            System.out.println("\nPressione Enter para Continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}
