import java.util.Scanner;

public class exercicico14{

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //Data de hoje
        System.out.println("Digita a data de hoje no formato dd/mm/aaaa: ");
        String data = scanner.nextLine();

        //natal 25/05/2025
        LocalDate faltaFimDoAno = hoje.with(Month.DECEMBER).withDayOfMonth(25);


        System.out.println("Hoje: " + hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //saida: Hoje: xx/xx/xxxx

        System.out.println("Ultimo dia do ano: " + faltaFimDoAno.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //Saída: dia do natal: 25/12/2025

        System.out.println("Quantidade dias para o fim do ano: " + Period.between(hoje, faltaFimDoAno).getDays()); //Quantidade dias para o natal

    }

}