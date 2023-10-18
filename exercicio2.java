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
