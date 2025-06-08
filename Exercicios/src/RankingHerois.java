import java.util.Scanner;

public class RankingHerois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] herois = new String[3];
        int[] poderes = new int[3];

        System.out.println("HERÓIS");
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do herói " + (i+1) + ": ");
            herois[i] = sc.nextLine();

            System.out.print("Digite o poder de " + herois[i] + " (0-100): ");
            poderes[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < 3; j++) {
                if (poderes[i] < poderes[j]) {
                    int poder = poderes[i];
                    poderes[i] = poderes[j];
                    poderes[j] = poder;

                    String nome = herois[i];
                    herois[i] = herois[j];
                    herois[j] = nome;
                }
            }
        }
        System.out.println("\nRANKING");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + "º " + herois[i] + " - Poder: " + poderes[i]);
        }

        sc.close();
    }
}
