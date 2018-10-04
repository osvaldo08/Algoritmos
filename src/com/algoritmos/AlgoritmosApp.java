package com.algoritmos;

import java.util.Scanner;

public class AlgoritmosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int base;
		int exp;
		int calificacion;
		int asistencias;
		int horas;
		int pago;
		int n1, n2, n3;
		int primo;
		
	    Ciclos ciclo = new Ciclos();
	    Condicionales condicion = new Condicionales();
		
	   /* //Pedir base y exponente, calcular resultado
		System.out.println("Dame la base: ");
		base = sc.nextInt();
		System.out.println("Dame el exponente:");
		exp = sc.nextInt();
		System.out.println("El resultado es: "+ciclo.potencia(base, exp));
		
		
		//Decir si un alumno paso o no, de acuerdo a la calificacion y las asistencias
		System.out.println("Cual es tu calificacion:");
		calificacion = sc.nextInt();
		System.out.println("Total de asistencias:");
		asistencias = sc.nextInt();
		System.out.println("Pasaste: "+condicion.acreditar(asistencias, calificacion));*/
	    
	    
	    //Preguntar a un trabajador las horas trabajadas y el pago por hora
	    //la hora extra se paga a 1.5 a partir de 40 horas
	    /*System.out.println("Horas trabajadas:");
	    horas = sc.nextInt();
	    System.out.println("Pago por hora:");
	    pago = sc.nextInt();
	    System.out.println("Pago total: "+condicion.pago(horas, pago));*/
	    
	    //Numero de enmedio
	   /* System.out.println("Ingrese el primer numero");
	    n1 = sc.nextInt();
	    System.out.println("Ingrese el segundo numero");
	    n2 = sc.nextInt();
	    System.out.println("Ingrese el tercer numero");
	    n3 = sc.nextInt();
	    System.out.println("El numero de enmedio es: "+condicion.medio(n1, n2, n3));*/
	    
	    //sumar la cantidad de cifras
	   /* System.out.println("Ingrese primer numero:");
	    n1 = sc.nextInt();
	    System.out.println("Ingrese segundo numero");
	    n2=sc.nextInt();
	    System.out.println("Total de cifras: "+condicion.sumaDigitos(n1, n2));*/
	    
	    //numero primo
	    System.out.println("Ingrese un numero");
	    primo = sc.nextInt();
	    System.out.println("Numero primo: "+condicion.primos(primo));

	}

}


