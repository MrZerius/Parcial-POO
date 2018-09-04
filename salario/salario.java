package salario;

import java.util.Scanner;

public class salario {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double salario,pago_mensual,pago_mensual1,interes;
		double meses,total_pagar;

		
		System.out.println("ingrese monto");
		salario = sc.nextFloat();
		
		
		 
		pago_mensual= salario * 0.30;
		pago_mensual1=pago_mensual - (pago_mensual + 0.02);
		
		System.out.println("ingrese meses");
		meses= sc.nextInt();
		
		interes = pago_mensual1 * 0.025;
		System.out.println ("el interes es de "+interes++);
		
			
			total_pagar = (meses * pago_mensual1)+interes ;
			
			System.out.println ("total a pagar  es de " +total_pagar++);
		}
		
		
	}
	

