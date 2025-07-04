import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual valor deseja pegar emprestado?");
        double valorEmprestimo = scanner.nextDouble();

        System.out.println("Em quantas parcelas deseja pagar?");
        int qntdParcelas = scanner.nextInt();

        System.out.println("Qual seu salário mensal?");
        double salarioUsuario = scanner.nextDouble();

        double valorParcelas = valorEmprestimo / qntdParcelas;

        if ((valorParcelas < salarioUsuario) && (qntdParcelas >= 1 && qntdParcelas <= 24) ) {
            System.out.println("Empréstimo aprovado. O valor da parcela é R$" + valorParcelas);
        } else if (valorParcelas >= salarioUsuario) {
            System.out.println("Parcela muito alta");
        } else if (qntdParcelas < 1 || qntdParcelas > 24) {
            System.out.println("Quantidade de parcelas inválida!");
        }
    }
}
