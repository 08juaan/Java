
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num = Integer.MAX_VALUE;
        
        for(int i=0;i<10;i++ ){
                System.out.println("Ingrese un numero entero");
	         int numero = sc.nextInt();
                
                if (numero<num){
                num = numero; 
                }
                
         }
        System.out.println("Su numero menor que ingrerso es " + num
        ); 

	}

}