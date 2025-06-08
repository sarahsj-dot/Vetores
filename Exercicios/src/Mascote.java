import java.util.Scanner;

public class Mascote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mascotes = {"Cachorro", "Gato", "Hamster", "Papagaio"};
        int[] votos = new int[4];
        int totalVotos = 0;

        System.out.println("Escolha seu mascote:");

        for (int i = 0; i < mascotes.length; i++) {
            System.out.println((i+1) + ". " + mascotes[i]);
        }

        System.out.println("\nVote digitando o número (1-4) ou 0 para encerrar:");

        int voto;
        do {
            System.out.print("Voto: ");
            voto = sc.nextInt();

            if (voto >= 1 && voto <= 4) {
                votos[voto-1]++;
                totalVotos++;
                System.out.println("Votou em " + mascotes[voto-1]);
            } else if (voto != 0) {
                System.out.println("Erro! Use 1-4");
            }
        } while (voto != 0);

        System.out.println("\nMascote Ecolhido");
        for (int i = 0; i < mascotes.length; i++) {
            double percentual = totalVotos > 0 ? (votos[i] * 100.0) / totalVotos : 0;
            System.out.printf("%s: %d votos (%.1f%%)\n", mascotes[i], votos[i], percentual);
        }

        sc.close();
    }
}

