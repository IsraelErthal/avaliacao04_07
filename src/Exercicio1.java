import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu login");
        String login = scanner.next();

        System.out.println("Digite sua senha");
        int senha = scanner.nextInt();

        String loginCorreto = "admin";
        int senhaCorreta = 1234;

        if (login.equalsIgnoreCase(loginCorreto) && senha == senhaCorreta) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Login inválido. Conta bloqueada.");
        }
    }
}
