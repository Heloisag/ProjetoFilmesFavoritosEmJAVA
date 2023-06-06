import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {

        //Dados iniciais do cliente
        String nome = "Heloisa";
        String tipoDeConta = "Corrente";
        String profissão = "Deselvovedora Junior";
        double saldoInicial = 2800.00;
        int idade = 19;

        // Imprime as informaçoes
        System.out.println("BEM VINDO AO NOSSO BANCO!\n");
        System.out.println("*********************************");

        System.out.println("---- DADOS INICIAIS DO CLIENTE ----");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo Da Conta: " + tipoDeConta);
        System.out.println("Profissão: ");
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("Idade: " + idade);

        System.out.println("*********************************\n");

//--------------------------------------------------------------------------------------------------------------------/

        //Menu
        String menu = """
                \n*** Digite a sua opção ***
                                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor;
                4 - Sair
                """;

        int consultaDeSaldo = (int) saldoInicial;
        String recebeValor = "Receber valor";
        String transferirValor = "Transferir valor";
        String sair = "Sair";
        int opção = 0;


        System.out.println("---- Operações ----");
        Scanner leitura = new Scanner(System.in); // -> Recebe os dados do teclado

        while (opção != 4) {
            System.out.println(menu);
            opção = leitura.nextByte();

            if (opção == 1) {
                System.out.println("O saldo desta conta é de: " + consultaDeSaldo);

            } else if (opção == 2) {
                System.out.println("Recebe o valor : " + recebeValor);
            } else if (opção == 3) {
                System.out.println("Você fez uma transferência de: " + transferirValor);
            } else {
                System.out.println("""
                        Obrigada por utilizar nossos serviços
                        Tenha um bom dia! :)
                        """);

            }
        }
    }
}