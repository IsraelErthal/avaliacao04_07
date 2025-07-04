import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 100");
        int nota = scanner.nextInt();
        
        if ((nota >= 90) && (nota <= 100) ) {
            System.out.println("Conceito A");
        } else if ((nota >= 80) && nota <= 89) {
            System.out.println("Conceito B");
        } else if ((nota >= 70) && (nota <= 79)) {
            System.out.println("Conceito C");
        } else if ((nota >= 60) && (nota <= 69)) {
            System.out.println("Conceito D");
        } else if ((nota < 60) && (nota >= 0)) {
            System.out.println("Conceito F");
        } else if (nota < 0 || nota > 100){
            System.out.println("Nota inválida");
        }
    }
}
