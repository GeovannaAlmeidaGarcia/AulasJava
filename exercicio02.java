//Adição de 2 números

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar dois números
        System.out.println("Adição de dois números");
        System.out.print("Digite o 1° número: ");
        double n1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o 2° número: ");
        double n2 = Double.parseDouble(scanner.nextLine());
        System.out.println("");

        //Cálculo
        double resultado = n1 + n2;
        String mensagem = "";

        //Condições
        if (resultado > 20) {
            resultado += 8;
            mensagem = "+ 8";
        }
        else{
            resultado -= 5;
            mensagem = "- 5";
        }

        //Apresentando o resultado final
        System.out.printf("%.1f + %.1f %s = %.1f", n1, n2, mensagem, resultado);
    }
}
