package temperatura;
import java.util.Scanner;

public class temperatura {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		float num1,resultado;

		
		System.out.println("digite el numero de grados celcius a convertir");
		num1 = sc.nextFloat();
		
		
		
		resultado=32+((9*num1)/5);
		
		System.out.println("grados fahrenheit "+resultado++);
	}
	

}
