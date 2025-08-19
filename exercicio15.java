//Escrever o número digitado por extenso

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir um número
        System.out.println("Digite um número entre 0 e 99:");
        int numero = Integer.parseInt(scanner.nextLine());

        //Se o número tiver apenas um dígito
        if (numero == 1){
            System.out.print("Um");
        }
        else if (numero == 2){
            System.out.print("Dois");
        }
        else if (numero == 3){
            System.out.print("Três");
        }
        else if (numero == 4){
            System.out.print("Quatro");
        }
        else if (numero == 5){
            System.out.print("Cinco");
        }
        else if (numero == 6){
            System.out.print("Seis");
        }
        else if (numero == 7){
            System.out.print("Sete");
        }
        else if (numero == 8){
            System.out.print("Oito");
        }
        else if (numero == 9){
            System.out.print("Nove");
        }
        //Se o número tiver mais de um dígito e for um número entre 10 e 19
        else if (numero >= 10 && numero < 20) {
            if (numero == 10) {
                System.out.print("Dez");
            } else if (numero == 11) {
                System.out.print("Onze");
            } else if (numero == 12) {
                System.out.print("Doze");
            } else if (numero == 13) {
                System.out.print("Treze");
            } else if (numero == 14) {
                System.out.print("Catorze");
            } else if (numero == 15) {
                System.out.print("Quinze");
            } else if (numero == 16) {
                System.out.print("Dezesseis");
            } else if (numero == 17) {
                System.out.print("Dezessete");
            } else if (numero == 18) {
                System.out.print("Dezoito");
            } else if (numero == 19) {
                System.out.print("Dezenove");
            }
        }
        //Se a parte da dezena for de 2 pra cima
        else{
            String numero_string = String.valueOf(numero);  //converte o valor de inteiro para string
            int dezena = Integer.parseInt(numero_string.substring(0,1));
            int unidade = Integer.parseInt(numero_string.substring(1));

            if (dezena == 2){
                System.out.print("Vinte ");
            }
            else if (dezena == 3){
                System.out.print("Trinta ");
            }
            else if (dezena == 4){
                System.out.print("Quarenta ");
            }
            else if (dezena == 5){
                System.out.print("Cinquenta ");
            }
            else if (dezena == 6){
                System.out.print("Sessenta ");
            }
            else if (dezena == 7){
                System.out.print("Setenta ");
            }
            else if (dezena == 8){
                System.out.print("Ointenta ");
            }
            else{
                System.out.print("Noventa ");
            }

            //Verificar a parte da unidade
            if (unidade == 1){
                System.out.print("e um");
            }
            else if (unidade == 2){
                System.out.print("e dois");
            }
            else if (unidade == 3){
                System.out.print("e três");
            }
            else if (unidade == 4){
                System.out.print("e quatro");
            }
            else if (unidade == 5){
                System.out.print("e cinco");
            }
            else if (unidade == 6){
                System.out.print("e seis");
            }
            else if (unidade == 7){
                System.out.print("e sete");
            }
            else if (unidade == 8){
                System.out.print("e oito");
            }
            else if (unidade == 9){
                System.out.print("e nove");
            }
        }

    }
}
