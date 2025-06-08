import java.util.Scanner;

public class CofrinhoInteligente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] moedas = {0.01, 0.05, 0.10, 0.25, 0.50, 1.00};
        System.out.println("Bem-vindo ao Simulador de Cofrinho Inteligente");

        System.out.println("Informe a quantidade de moedas: ");
        int[] quantidade = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < moedas.length; i++) {
            System.out.print(moedas[i] + ": ");
            quantidade[i] = sc.nextInt();
        }

        double total = 0;
        for (int i = 0; i < moedas.length; i++) {
            total += quantidade[i] * moedas[i];
        }

        System.out.printf("\nTotal no cofrinho: R$ %.2f%n", total);

        double sugestao = Math.ceil(100 / total);

        System.out.println("Faltam " + sugestao + " semanas para completar R$ 100");
    }
}


