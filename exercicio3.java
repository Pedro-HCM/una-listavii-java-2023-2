package listavii;
import java.util.Scanner;

public class exercicio3 {
	
	public static void insertionSort(int[] vetor) {
		for (int i = 1; i < vetor.length; i++) { 
				
			int j = i;
			
			while (j > 0 && vetor[j] < vetor[j-1]) {
				int aux = vetor[j];
				vetor[j] = vetor[j - 1];
				vetor[j - 1] = aux;
				j -= 1;
			}
			
		}
				
	}
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[] vetor = {1, 100, 30, 50, 11, 13, 5, 7, 78};
		
		System.out.println("Vetor original: ");
		
		for(int num : vetor) {
			System.out.print(num + " ");
		}
	
		insertionSort(vetor);
		
		System.out.println("Vetor ordenado: ");
		
		for(int num : vetor) {
			System.out.print(num + " ");
		}

	}
	
}
