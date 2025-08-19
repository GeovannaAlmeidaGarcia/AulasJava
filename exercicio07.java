//IMC

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler peso e altura
        System.out.print("Informe o seu peso: ");
        double peso = Double.parseDouble(scanner.nextLine());
        System.out.print("Informe a sua altura: ");
        double altura = Double.parseDouble(scanner.nextLine());

        //Cálculo
        double imc = peso/(Math.pow(altura, 2));

        //Exibir classificação
        if (imc < 18.5){
            System.out.printf("IMC: %.2f | Abaixo do peso", imc);
        }
        else if(imc < 25){
            System.out.printf("IMC: %.2f | Saudável", imc);
        }
        else if(imc < 30){
            System.out.printf("IMC: %.2f | Sobrepeso", imc);
        }
        else if(imc < 35){
            System.out.printf("IMC: %.2f | Obesidade grau I", imc);
        }
        else if(imc < 40){
            System.out.printf("IMC: %.2f | Obesidade grau II", imc);
        }
        else{
            System.out.printf("IMC: %.2f | Obesidade grau III", imc);
        }

    }
}
