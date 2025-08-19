//Ordem crescente

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Soliticar 3 números
        System.out.print("Digite o 1° número: ");
        double n1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o 2° número: ");
        double n2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o 3° número: ");
        double n3 = Double.parseDouble(scanner.nextLine());

        //Oganizando em ordem crescente
        double primeiro = 0;
        double segundo = 0;
        double terceiro = 0;


        if (n1 <= n2 && n1 <= n3) {
            primeiro = n1;
            if (n2 < n3) {
                segundo = n2;
                terceiro = n3;
            } else {
                segundo = n3;
                terceiro = n2;
            }
        } else if (n2 < n1 && n2 < n3) {
            primeiro = n2;
            if (n1 < n3) {
                segundo = n1;
                terceiro = n3;
            } else {
                segundo = n3;
                terceiro = n1;
            }
        } else {
            primeiro = n3;
            if (n1 < n2) {
                segundo = n1;
                terceiro = n2;
            } else {
                segundo = n2;
                terceiro = n1;
            }
        }

        //Imprimir em ordem crescente
        System.out.printf("Números em ordem crescente: %.01f,  %.01f,  %.01f", primeiro, segundo, terceiro);

    }
}
