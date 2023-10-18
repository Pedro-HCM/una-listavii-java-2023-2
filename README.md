# César Henrique Soares Marques - RA 622120352
## Lista de Atividades VII - Java

### 2. Explique o que é uma lista e uma pilha em estrutura de dados. Escreva em Java exemplos de uma lista e uma pilha.

#### Uma lista em programação é uma estrutura de dados fundamental que permite organizar e gerenciar coleções de elementos de forma ordenada e flexível, que seguem uma "ordem de chegada". Isto é, o primeiro a entrar é o primeiro a sair. Exemplo:

'''
package listavii;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		List<String> nomes = new ArrayList<String>();
        	nomes.add("Paulo");
        	nomes.add("Geralda");
        
        System.out.println("Lista primária:");

        	for(String nome : nomes) {
        		System.out.println("Oi, " + nome);
        	}

        	nomes.add("Bruno");
        System.out.println("Lista 2:");


        	for(String nome : nomes) {
        		System.out.println("Oi, " + nome);
        	}
        
        	nomes.remove("Bruno");
        System.out.println("Lista 3:");
        
        	for(String nome : nomes) {
        		System.out.println("Oi, " + nome);
        	}
		
	}

}
'''

#### Já no caso da pilha, ela possui um funcionamento similar a lista, porém seu ordenamento se dá de forma diferente: o último a entrar é o primeiro a sair. Exemplo:

'''
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
'''

### 3. Escreva um algoritmo em C# que implemente a lógica de ordenação por inserçãodo Insertion Sort.

### 4. Escreva um algoritmo em C# que implemente a lógica de ordenação por inserçãodo Shell Sort.
