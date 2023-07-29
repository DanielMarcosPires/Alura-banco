import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println(
                """
                 ***************************
                 Nome do cliente: """+nome+"""
                
                 Tipo da conta: """+tipoConta+"""
                
                 Saldo atual: """+saldo+"""
                
                ***************************
                """
        );
        System.out.println("""
                Digite sua opção
                1 - consultar saldo
                2 - transferir valor
                3 - receber valor
                4 - sair
                """);
        while(opcao != 4){
            System.out.print("> ");
            opcao = scanner.nextInt();

            switch (opcao){
                case (1):
                    System.out.println("O saldo atualizado é " + saldo);
                    break;
                case (2):
                    System.out.println("Qual o valor que deseja transferir");
                    System.out.print(">");
                    double valor = scanner.nextDouble();
                    if(valor > saldo){
                        System.out.println("Não há saldo para realizar a transferência");
                    }else{
                        saldo -= valor;
                        System.out.println("Novo saldo "+ saldo);
                    }
                    break;
                case (3):
                    System.out.println("Valor recebido: ");
                    System.out.print(">");
                    valor = scanner.nextDouble();
                    saldo += valor;
                    break;
                case (4):break;
            }
        }
    }
}
