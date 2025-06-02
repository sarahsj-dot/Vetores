package vetor_matriz;


public class exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor[] = new int[10];
		for (int i = 0; i < vetor.length; i++) {
		vetor [i] = (int)(Math.random() * 100) + 1;
		}
		
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
			System.out.println("Números: " + vetor[i]);
		}
		System.out.println("Soma: " + soma);
	}

}
