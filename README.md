# César Henrique Soares Marques - RA 622120352
## Lista de Atividades VII - Java

### 2. Explique o que é uma lista e uma pilha em estrutura de dados. Escreva em Java exemplos de uma lista e uma pilha.

#### Uma lista em programação é uma estrutura de dados fundamental que permite organizar e gerenciar coleções de elementos de forma ordenada e flexível, que seguem uma "ordem de chegada". Isto é, o primeiro a entrar é o primeiro a sair. Exemplo:

'''
	
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

### 3. Escreva um algoritmo em Java que implemente a lógica de ordenação por inserçãodo Insertion Sort.


'''
	
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
		
		int[] vetor = {1, 100, 30, 50, 11, 13, 5, 7, 78};
		
		System.out.println("Vetor original: ");
		
		for(int num : vetor) {
			System.out.print(num + " ");
		}
	
		insertionSort(vetor);
		
		System.out.println("\nVetor ordenado: ");
		
		for(int num : vetor) {
			System.out.print(num + " ");
		}

	}
	
}


'''

### 4. Escreva um algoritmo em C# que implemente a lógica de ordenação por inserçãodo Shell Sort.

'''
	
	    public static void shellSort(int[] array) {
	        int n = array.length;
	        
	        
	        for(int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
	        
	            for(int i = intervalo; i < n; i++) {
	                int temp = array[i];
	                int j;
	                
	                	for(j = i; j >= intervalo && array[j - intervalo] > temp; j -= intervalo) {
	                		array[j] = array[j - intervalo];
	                	}
	                
	                array[j] = temp;
	            }
	        }
	    }
	
	    public static void main(String[] args) {
	    	int[] vetor = {1, 100, 30, 50, 11, 13, 5, 7, 78};
		
	    	System.out.println("Vetor original:");
	    	for (int num : vetor) {
	    		System.out.print(num + " ");
        	
	    	shellSort(vetor);

	    	System.out.println("\nVetor ordenado:");
	    		for (int num1 : vetor) {
	    			System.out.print(num1 + " ");
	    		}
	    	}
	    }

'''
