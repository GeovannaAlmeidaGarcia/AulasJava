//Reajuste no salário de funcionário

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler salário atual
        System.out.print("Informe o seu salário atual: R$");
        double salario_atual = Double.parseDouble(scanner.nextLine());

        //Calcular o reajuste
        double aumento = 0;
        if (salario_atual <= 3000){
            aumento = salario_atual * 0.35;
        }
        else{
            aumento = salario_atual * 0.15;
        }
        double salario_reajustado = salario_atual + aumento;

        //Informar o novo salário
        System.out.printf("Seu salário foi reajustado para R$%.2f", salario_reajustado);
    }
}
