import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // dados do cliente
        Scanner leitor = new Scanner(System.in);
       double saldo = 2500;
       String nome = "João Henrique Fernandes";
       String tipoConta = "Corrente";
       int opcao = 0;
       



        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");



        // menu de opções // tem que ter um scanner aqui
        String menu = String.format(""" 
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                Digite a opção desejada: 
                """);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitor.nextInt();

            // visualização de saldo
            if (opcao == 1){
                System.out.println("Seu saldo é de: R$" + saldo);
            } else if (opcao ==2){
                System.out.println("Digite o valor que será recebido: ");
                double valor = leitor.nextDouble();
                saldo += valor;
                System.out.println("Valor recebido, agora o seu saldo é de: " + saldo);
            } else if (opcao == 3) {
                System.out.println("Qual valor deseja transferir? ");
                double valor = leitor.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo suficiente.");
                }else {
                    saldo -= valor;
                    System.out.println("novo saldo: " + valor);
                }
                 } else if (opcao != 4) {
                System.out.println("Opção inválida");

            }
        }


            // envia valor
            // recebe valor
    }
}
