//Verificar múltiplos de 3

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar número
        System.out.print("Digite um número inteiro para verificar se ele é múltiplo de 3: ");
        int n = Integer.parseInt(scanner.nextLine());

        //Cálculo
        int resultado = n % 3;

        //Dizer se é ou não múltiplo de 3
        if (resultado == 0) {
            System.out.printf("%d é múltiplo de 3", n);
        } else {
            System.out.printf("%d não é múltiplo de 3", n);
        }
    }
}
