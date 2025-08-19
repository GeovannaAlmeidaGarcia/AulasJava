//Soma de três algarismos

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar um número com 3 algarismos
        System.out.print("Digite um número com 3 algarismos: ");
        String num = scanner.nextLine();

        //Separando os algarismos
        int n1 = Integer.parseInt(num.substring(0,1));  //parseInt não aceita char
        int n2 = Integer.parseInt(num.substring(1,2));
        int n3 = Integer.parseInt(num.substring(2));

        //Cálculo
        int resultado = n1 + n2 + n3;

        //Exibindo a soma
        System.out.printf("%d + %d + %d = %d", n1, n2, n3, resultado);
    }
}
