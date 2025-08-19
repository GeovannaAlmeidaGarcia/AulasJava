//Classificação de nadadores por idade

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler a idade
        System.out.print("Digite a sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        //Exibir a classificação
        if (idade >= 5 && idade <= 7) {
            System.out.print("Infantil A");
        }
        else if (idade <= 10) {
            System.out.print("Infantil B");
        }
        else if (idade <= 13){
            System.out.print("Juvenil A");
        }
        else if (idade <= 17){
            System.out.print("Juvenil B");
        }
        else{
            System.out.print("Sênior");
        }

    }
}
