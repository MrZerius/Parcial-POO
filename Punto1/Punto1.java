package Punto1;
import java.util.Scanner;

public class Punto1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		int num1,num2,opcion;
		float resultado;
		
		
		
		System.out.println("Calculadora: ");
		
		System.out.println("Digite el primer numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite el segundo numero: ");
		num2 = sc.nextInt();
		
		
		System.out.println("Seleccione la operacion que desea realizar: ");
		
		System.out.println("1: Suma: ");
		System.out.println("2: Resta: ");
		System.out.println("3: Multiplicacion: ");
		System.out.println("4: Division: ");
		opcion = sc.nextInt();
		
		
		switch(opcion) {
		
		
		case 1: 
			System.out.println("Ha seleccionado suma: ");
			System.out.println(" SUMA : ");
		
				resultado = num1 + num2 ;
		
					System.out.println(+num1+ " + " +num2+ " = " +resultado++);
					
					break;
		
		case 2: 
			System.out.println("Ha seleccionado resta: ");
			System.out.println(" RESTA : ");
			
			resultado = num1 - num2 ;
			
					System.out.println(+num1+ " - " +num2+ " = " +resultado++);
					
					break;
					
		case 3: 
			System.out.println("Ha seleccionado multiplicacion: ");
			System.out.println(" MULTIPLICACION : ");
			
			resultado = num1 * num2 ;
			
					System.out.println(+num1+ " * " +num2+ " = " +resultado++);
					
					break;
					
		case 4: 
			System.out.println("Ha seleccionado division: ");
			System.out.println(" DIVISION : ");
			
			if(num2 == 0) {
				
				System.out.println("Error, Imposible dividir por cero. ");
				
			}
			else {
				
			
			
			resultado = num1 / num2 ;
			
					System.out.println(+num1+ " / " +num2+ " = " +resultado++);
			}
		
			break;
		}
	
	
		
		sc.close();
		
		
	}

}
