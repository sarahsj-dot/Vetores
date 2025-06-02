package vetor_matriz;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[5];

		System.out.println("Digite um número: ");
		vetor[0] = sc.nextInt();
		vetor[1] = sc.nextInt();
		vetor[2] = sc.nextInt();
		vetor[3] = sc.nextInt();
		vetor[4] = sc.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}

	}

}
