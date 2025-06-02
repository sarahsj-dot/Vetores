package vetor_matriz;

public class exercicio11 {

	public static void main(String[] args) {

		int [] vetor = { 1, 2 ,3, 4, 5 };
		
		System.out.print("Vetor original: ");
		for(int num : vetor) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.print("Vetor rotacionado: ");
		for (int i = 4; i < 5; i++) {
			System.out.print(vetor[i] + " ");
			
		}
		for (int i = 0; i < vetor.length -1; i++) {
			System.out.print(vetor[i] + " ");
		}
		

	}

}
