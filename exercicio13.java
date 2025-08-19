//Converter moeda para real, dólar ou euro

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Perguntar o valor, qual a moeda que o usuário tem e para qual deseja converter
        System.out.println("-------- CONVERSOR DE MOEDAS --------");
        System.out.println("(Digite as opções numéricas correspondentes)");
        System.out.println("Qual moeda você tem?  [1] Real  [2] Dólar  [3] Euro");
        int moeda_atual = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o valor: ");
        double valor = Double.parseDouble(scanner.nextLine());
        System.out.println("Para qual moeda deseja converter?  [1] Real  [2] Dólar  [3] Euro");
        int moeda_desejada = Integer.parseInt(scanner.nextLine());

        //Realizar a conversão
        String moeda = "";
        double valor_convertido = 0;

        if (moeda_atual == moeda_desejada){
            valor_convertido = valor;
            if (moeda_desejada == 1){
                moeda = "R$";
            }
            else if (moeda_desejada == 2){
                moeda = "US$";
            }
            else{
                moeda = "€";
            }
        }
        else if (moeda_atual == 1){
            if (moeda_desejada == 2){
                valor_convertido = valor/5.67;
                moeda = "US$";
            }
            else {
                valor_convertido = valor*0.15;
                moeda = "€";
            }
        }
        else if (moeda_atual == 2){
            if (moeda_desejada == 1){
                valor_convertido = valor*5.67;
                moeda = "R$";
            }
            else{
                valor_convertido = valor*0.88;
                moeda = "€";
            }
        }
        else{
            if (moeda_desejada == 1){
                valor_convertido = valor*6.45;
                moeda = "R$";
            }
            else{
                valor_convertido = valor*1.14;
                moeda = "US$";
            }
        }

        //Exibir o valor convertido
        System.out.printf("Valor convertido: %s%.2f", moeda, valor_convertido);

    }
}
