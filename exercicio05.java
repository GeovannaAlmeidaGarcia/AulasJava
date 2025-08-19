//Informar classe eleitoral de uma pessoa

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler a idade da pessoa
        System.out.print("Digite a sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        //Informar a classe eleitoral
        if (idade < 16) {
            System.out.print("Não eleitor");
        }
        else if(idade < 18 || idade > 65) {
            System.out.print("Eleitor facultativo");
        }
        else {
            System.out.print("Eleitor obrigatório");
        }
    }
}
