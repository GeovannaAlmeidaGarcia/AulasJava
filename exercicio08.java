//Cálculo de valor de estacionamento

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Perguntar quantidade de horas usadas
        System.out.println("Durante quantas horas você utilizou o estacionamento?");
        int qtd_horas = Integer.parseInt(scanner.nextLine());

        /* Calcular o valor
        Primeira e segunda hora = 2,00 por hora
        Terceira e quarta hora = 1,40 por hora
        A partir da quinta hora = 1,00 por hora
        */

        double valor = 0;
        int horas_adicionais = qtd_horas - 4;

        if (horas_adicionais > 0) {
            valor += horas_adicionais;
            qtd_horas -= horas_adicionais;
        }
        if (qtd_horas > 3) {
            qtd_horas -= 2;
            valor += (qtd_horas * 1.4);
        }
        valor += qtd_horas * 2;

        //Exibir o valor a ser pago
        System.out.printf("Valor a ser pago: R$%.2f", valor);

    }
}
