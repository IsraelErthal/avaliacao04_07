import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Você é estudante? (S ou N)");
        String validacaoEstudante = scanner.next();
        
        if ((idade < 6) || (idade > 65) ) {
            System.out.println("Você não paga tarifa!");
        } else if (validacaoEstudante.equalsIgnoreCase("S") && (idade <= 25)) {
            System.out.println("Você pagará 50%, ou seja, R$2,00.");
        } else {
            System.out.println("Você pagará tarifa cheia, ou seja, R$4,00");
        }
    }
}
