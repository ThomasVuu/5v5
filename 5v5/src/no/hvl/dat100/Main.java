package no.hvl.dat100;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	 public static void main(String args[]){
		 
//		String[] Spiller = new String[10];
		String[] Spiller = {"Thomas","Markus","Ole","Emil","Eivind","Heine","David","Wolles","Nima","Jona"};
		
		 
//		Scanner SkrivInnSpiller = new Scanner(System.in);
//		System.out.println("Skriv inn spillere: ");
//		
//		for(int i = 0; i<10; i++) {
//		String person = SkrivInnSpiller.nextLine();
//		Spiller[i]=person;
//		}
		
		 
	    shuffleArray(Spiller);
	    
	    System.out.println("Lag 1: 		");
	    System.out.println("Top:		" + Spiller[0] + " ");
	    System.out.println("Jungle: 	" + Spiller[1] + " ");
	    System.out.println("Mid:		" + Spiller[2] + " ");
	    System.out.println("Adc:		" + Spiller[3] + " ");
	    System.out.println("Support: 	" + Spiller[4] + " ");
	    System.out.println("");
	    System.out.println("Lag 2: 		");
	    System.out.println("Top: 		" + Spiller[5] + " ");
	    System.out.println("Jungle:		" + Spiller[6] + " ");
	    System.out.println("Mid: 		" + Spiller[7] + " ");
	    System.out.println("Adc: 		" + Spiller[8] + " ");
	    System.out.println("Support: 	" + Spiller[9] + " ");
//	    
	  }

	  // Implementing Fisher–Yates shuffle
	  static void shuffleArray(String[] ar)
	  {
	    // If running on Java 6 or older, use `new Random()` on RHS here
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      String a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	  }

}
