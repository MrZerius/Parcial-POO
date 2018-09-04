package Punto3;
import java.util.Scanner;

public class Punto3 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int diasT,horaE,tipoHoraE,diaE;
		String nombre;
		int valorH;
		int sueldoDia;
		int valor;
		
		int SM,DT,SpH,HE,ThE,ST;

		
		System.out.println("Salario Minimo: ");
		
		
		System.out.println("Digite los siguientes datos: ");
		
		System.out.println("Nombre Empleado: ");
		nombre = sc.nextLine();
		
		
		
		System.out.println("Cuantos dias trabajo " +nombre+ ":");
		diasT = sc.nextInt();
		
		
		System.out.println("Sueldo por dia");
		sueldoDia = sc.nextInt();
		
		System.out.println("Cuantas horas extras trabajo");
		horaE = sc.nextInt();
		if(horaE > 48 ) {
			
			System.out.println("El trabajador no puede laborar mas de 48 horas al mes");
			
		}
		
		System.out.println("Que tipo de hora extra trabajo: ");
		
		System.out.println("Digite '1' si las horas extras fueron duiurnas, o '2' si fueron nocturnas");
		tipoHoraE = sc.nextInt();
		
		if(tipoHoraE == 1) {
			
			valor = 4069 + 25 / 100;
			
		}else {
			
			valor = 4069 + 75 / 100;
			
		}
		
		
			System.out.println("Que tipo de Dia trabajo las horas extras: ");
		
		System.out.println("Digite '1' si el dia fue dominical/festivo hora diurna, o '2' si fue dominical/festivo hora nocturna");
		diaE = sc.nextInt();
		
		if(diaE == 1) {
			
			valor = 6510 + (75 / 100) * (25 / 100);
			
		} else {
			
		valor =	8138 + (75 / 100) * (25 / 100);
			
		}
		
		
		
		SM = 781242;
		DT = diasT;
		SpH = sueldoDia;
		HE = horaE;
		ThE = tipoHoraE;
		ST = diasT * sueldoDia + HE;
		
		
		System.out.println("El empleado se llama: "+nombre+" Trabajo :" +diasT+ " dias el sueldo por dia es: "+sueldoDia +" Horas extra "+HE+" Tipo hora extra '1 diurno' '2 nocturno' " +ST++ );
		
		
}
}