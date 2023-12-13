package dados;
import java.util.Random;
import java.util.Scanner;
public class dados {

		 public static void main(String[] args) {
		        Random rand = new Random();
		        Scanner scanner = new Scanner(System.in);

		        int intentosMaximos = 5; 
		        int intentosRealizados = 0; 
		        
		        while (intentosRealizados < intentosMaximos) {
		            
		            int dado1 = rand.nextInt(6) + 1;
		            int dado2 = rand.nextInt(6) + 1; 

		            System.out.println("El numero del primer dado es: " + dado1);
		            System.out.println("El numero del segundo dado es: " + dado2);

		            if (dado1 == dado2) {
		                System.out.println("¡Felicidades! ganaste ");
		                break;
		            } else {
		                System.out.println("no sacaste par, sigue intentando");
		                intentosRealizados++;
		                if(intentosRealizados < intentosMaximos) {
		                    System.out.println("Te quedan " + (intentosMaximos - intentosRealizados) + " intentos.");
		                    System.out.println("oprime ENTER para lanzar los dados");
		                    scanner.nextLine(); 
		                }
		            }
		        }

		        if (intentosRealizados == intentosMaximos) {
		            System.out.println("Se acabaron tus intentos. ¡Has perdido!");
		        }

		        scanner.close();

	}

}
