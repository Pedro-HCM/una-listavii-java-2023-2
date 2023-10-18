package listavii;
import java.util.Scanner;
import java.util.Stack;

public class exercicio2_pilha {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Stack<Integer> numeros = new Stack<>();

        numeros.push(5);
        numeros.push(10);
        numeros.push(15);
        
        System.out.println("Lista original: ");

        for(int numero : numeros) {
            System.out.println(numero);
        }
        // Removendo o último valor impresso da pilha
        numeros.pop();

        System.out.println("Nova lista: ");

        for(int numero : numeros) {
            System.out.println(numero);
        }
		
	}
		
}
