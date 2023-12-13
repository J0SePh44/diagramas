package cartas;
import java.util.Random;
import java.util.Scanner;
public class cartas {
	
	
	
	public static void main(String[] args) {
		
		Random rand = new Random();
	    Scanner scanner = new Scanner(System.in); 
	    
	    int dado1 = rand.nextInt(13) + 1;
	    int dados2 = rand.nextInt(10) + 1; 
	    int total;
	    int suma;
		int J=10;
		int Q=10;
		int K=10;
	   
	    
	    System.out.println("EL RESULTADO DE LA PRIMERA CARTA ES:" + dado1);
	 
	    
	   switch (dado1) {
	   	case 11: { 
	   		dado1=11;
	   		System.out.println("J" );
	   		}
	  break;
	   	case 12: { 
	   		dado1=12;
	   		System.out.println("Q" );
	   		}
	  break;
	   case 13: {
		   dado1=13;
		   System.out.println("K" );
		   break;
	   		}
	 
	   }
	
	   System.out.println("EL RESULTADO DE LA SEGUNDA CARTA ES:" + dados2);
	   
	   
	   total= dado1+dados2;
	switch (total) {
	case 12: {
		total=12;
			System.out.println("repetir con 12");
		
	}
	break;
	case 11: {
		if (dado1==J && dados2==1) {
			total=11;
			System.out.println("GANÓ CON 11");
		}
		if (dado1==Q && dados2==1) {
			total=11;
			System.out.println("GANÓ CON 11");
		}
		if (dado1==K && dados2==1) {
			total=11;
			System.out.println("GANÓ CON 11");
		}
	}
	break;
	
	case 14: {
		total=14;
		System.out.println("medio ganaste");
	}
	
	case 21: { 
		if (total>21) {
			System.out.println("HAS OBTENIDO UNA SUMATORIA MAYOR A 21, PIERDES");
		}
	}
	}// del cierre del switch
	}//del public
}
