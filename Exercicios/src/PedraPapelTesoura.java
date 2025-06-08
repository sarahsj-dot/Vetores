import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] jogadas = {"Pedra", "Papel", "Tesoura", "Largato", "Spock"};
        System.out.println("    JOGO: PEDRA, PAPEL, TESOURA, LARGATO, SPOCK    ");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("4 - Largato");
        System.out.println("5 - Spock");

        int jogador = sc.nextInt() - 1;
        int aleatorio = rand.nextInt(5);
        if (jogador < 0 || aleatorio > 4) {
            System.out.println("Erro! Escolha um número entre 1 e 5.");
            return;
        }

        System.out.println("\nVocê: " + jogadas[jogador]);
        System.out.println("\nComputador: " + jogadas[aleatorio]);

        if (jogador == aleatorio) {
            System.out.println("\nEmpate!");
        }else{
            boolean vitoriaJogador = false;

            switch (jogador) {
                case 0:
                    vitoriaJogador = (aleatorio == 2 || aleatorio == 3);
                    break;
                case 1:
                    vitoriaJogador = (aleatorio == 0 || aleatorio == 4);
                    break;
                case 2:
                    vitoriaJogador = (aleatorio == 1 || aleatorio == 3);
                    break;
                case 3:
                    vitoriaJogador = (aleatorio == 1 || aleatorio == 4);
                    break;
                case 4:
                    vitoriaJogador = (aleatorio == 0 || aleatorio == 2);
                    break;
            }
            if (vitoriaJogador) {
                System.out.println("\nYou Won!");
            }else{
                System.out.println("\nGame Over!");
            }
        }
    }
}
