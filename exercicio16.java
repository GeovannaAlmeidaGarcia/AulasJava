//Calcular comissão de vendas

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Perguntar o valor da venda
        System.out.println("-------- CALCULADOR DE COMISSÃO --------");
        System.out.println("Bem-vindo(a), vendedor(a)!");
        System.out.print("Qual foi o valor da venda? R$");
        double valor_venda = Double.parseDouble(scanner.nextLine());

        //Calcular a comissão vendas
        double comissao = 0;
        if (valor_venda >=1000000) {
            comissao = 700 + (valor_venda*0.16);
        }
        else if (valor_venda >= 80000) {
            comissao = 650 + (valor_venda*0.14);
        }
        else if (valor_venda >= 60000) {
            comissao = 600 + (valor_venda*0.14);
        }
        else if (valor_venda >= 40000) {
            comissao = 550 + (valor_venda*0.14);
        }
        else {
            comissao = 500 + (valor_venda*0.14);
        }

        //Exibir o valor da comissão do vendedor
        System.out.printf("Parabéns! Sua comissão é de R$%.2f", comissao);
    }
}
