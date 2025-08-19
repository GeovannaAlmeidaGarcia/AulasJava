//Calcular o consumo km/l de um veículo

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler distância percorrida e quantidade de litros consumidos
        System.out.print("Informe a distância percorrida com o veículo: ");
        double distancia = Double.parseDouble(scanner.nextLine());
        System.out.print("Informe a quantidade de litros de combustível consumida pelo veículo para percorrer a distância: ");
        double litros = Double.parseDouble(scanner.nextLine());

        //Cálculo
        double consumo = distancia/litros;

        //Exibir mensagem
        if (consumo < 8){
            System.out.printf("Consumo do seu veículo: %.1f km/l | Venda este carro!", consumo);
        }
        else if (consumo < 12){
            System.out.printf("Consumo do seu veículo: %.1f km/l | Econômico", consumo);
        }
        else{
            System.out.printf("Consumo do seu veículo: %.1f km/l | Super econômico!", consumo);
        }
    }
}
