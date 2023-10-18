package listavii;

public class exercicio4 {
	
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
}