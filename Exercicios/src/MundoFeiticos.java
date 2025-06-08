import java.util.Scanner;

public class MundoFeiticos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] feiticos = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};

        System.out.println("Feitiços disponíveis:");
        for (String feitico : feiticos) {
            System.out.println("- " + feitico);
        }

        System.out.print("\nDigite o feitiço a buscar: ");
        String a = sc.nextLine();
        int inicio = 0;
        int fim = feiticos.length - 1;
        int posicao = -1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = a.compareTo(feiticos[meio]);

            if (comparacao == 0) {
                posicao = meio;
                break;
            } else if (comparacao < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        if (posicao != -1) {
            System.out.println("Feitiço encontrado na posição " + posicao);
        } else {
            System.out.println("Feitiço não encontrado!");
        }
    }
}
