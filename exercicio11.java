//Classificação de triângulos

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler os lados do triângulo
        System.out.print("Digite o valor do 1° lado do triângulo: ");
        double lado1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o valor do 2° lado do triângulo: ");
        double lado2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o valor do 3° lado do triângulo: ");
        double lado3 = Double.parseDouble(scanner.nextLine());

        //Classicação dos triângulos
        if (lado1 == lado2 && lado2 == lado3){
            System.out.print("Triângulo equilátero. Todos os lados são iguais.");
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.print("Triângulo isóceles. Há dois lados iguais.");
        }
        else{
            System.out.print("Triângulo escaleno. Todos os lados são diferentes.");
        }
    }
}
