package com.algoritmos;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

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
	    Arreglos arreglo = new Arreglos();
		
	   /* //Holaaa Pedir base y exponente, calcular resultado
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
	    /*System.out.println("Ingrese un numero");
	    primo = sc.nextInt();
	    System.out.println("Numero primo: "+condicion.primos(primo));*/
	    
	    ArrayList<Integer> nums = new ArrayList<Integer>();
	    int limite=0;
	    /*do {
	    	System.out.println("Dame un numero");
	    	x = sc.nextInt();
	    	if(x>=0)
	    		nums.add(x);
	    }while(x>=0);
	    x=arreglo.media(nums);
	    System.out.println("La medida es: "+x);*/
	    
//	    System.out.println("Dame un numero: ");
//	    limite=sc.nextInt();
//	    long[] serie = new long[limite];
//	    serie=arreglo.fibonacci(limite);
//	    
//	    for(long num : serie) {
//	    	System.out.println(num);
//	    }
//	    
	    
	    //Pilas 
	   /* Stack<String> pila = new Stack<String>();
	    pila.push("Adal");
	    pila.push("Victor");
	    pila.push("Efren");
	    pila.push("La Yadis");
	    System.out.println("El tamano: "+pila.size());
	    //Peek nos muestra el elemento en la cima de la lista sn guardarlo
	    System.out.println("Ultimo elemento: "+pila.peek());  
	    System.out.println("El tamano: "+pila.size());
	    //Pop nos muestra el elemento en la cima de la lista y lo guarda
	    System.out.println("Ultimo elemento despues del peek: " +pila.pop());
	    System.out.println("El tamano: "+pila.size());
	    System.out.println("Ultimo elemento despues del pop: " +pila.peek());
	    //Get nos regresa el elemento en un indice determinado
	    System.out.println("El indice 1 "+pila.get(1));
	    while(pila.size()>0) {
	    	System.out.println(pila.pop());
	    }*/
	    
	    //Colas
//	    PriorityQueue<String> cola = new PriorityQueue<String>();
//	    cola.add("Ulises");
//	    cola.add("Pacheco");
//	    cola.add("Axel");
//	    cola.add("Chino");
//	    
//	    Iterator it = cola.iterator();
//	    while(it.hasNext()) { 
//	    	System.out.println(it.next());
//	    }
//	    //peek nos muestra el primer elemento de la cola
//	    System.out.println("El primero: "+cola.peek());
//        //poll nos muestra ek primer elemento de la cola y lo saca de ella
//	    System.out.println("El primero: "+cola.poll());
//	    System.out.println("El nuevo primero: "+cola.peek());
//	    //contains nos dice si nuestra cola contiene ciertos elementos
//	    System.out.println("Contiene Ulises? "+cola.contains("Ulises"));
//	    System.out.println("Contiene Manu? "+cola.contains("Manu"));
//	    //Remove saca un elemento especifico de la cola
//	    cola.remove("Pacheco");
        
	    //TreeSet No guarda elementos repetidos, y se ordena automaticamente
//	    TreeSet<String> arbol = new TreeSet<String>();
//	    arbol.add("Mario");
//	    arbol.add("Cesar");
//	    arbol.add("Mario");
//	    arbol.add("Cesar");
//	    
//	    System.out.println("Elementos en el arbol: "+arbol.size());
//	    Iterator it = arbol.iterator();
//	    while(it.hasNext())
//	    	System.out.println(it.next());
//	    System.out.println("Se agrego elemento? "+arbol.add("Marco"));
//	    System.out.println("Se agrego elemento? "+arbol.add("Cesar"));
//	    System.out.println("Se agrego elemento? "+arbol.add("Osvaldo"));
//	    //Remove quita un elemento
//       arbol.remove("Marco");
//       System.out.println("Elementos en el arbol: "+arbol.size());
//       //clear quita todos los elementos
//       arbol.clear();
//       System.out.println("Elementos en el arbol: "+arbol.size());
       
       //Hashtable Contiene claves para cada una de sus entradas. No se pueden repetir
//	    Hashtable<Integer, String> hash = new Hashtable<Integer, String>();
//	    //se define el tipo de dato de la clave y el del valor
//	    hash.put(1, "Yareli");
//	    hash.put(2, "Alan");
//	    //Al repetir una clave se sobreescribe la existente
//	    hash.put(2, "Manu");
//	    
//	    //Hashtable se recorre con Enumeration en lugar de iterator
//	    Enumeration en = hash.keys();
//	    while(en.hasMoreElements()) {
//	    	int clave = (int)en.nextElement();
//	        System.out.println(clave+" - "+hash.get(clave));
//	    }
//	    System.out.println("\n");
//	    hash.put(5, "Osvaldo");
//	    hash.put(3, "Alan");
//	    en = hash.keys();
//	    while(en.hasMoreElements()) {
//	    	int clave = (int)en.nextElement();
//	        System.out.println(clave+" - "+hash.get(clave));
//	    }
//	    //Podemos comprobar si nuestra Hashtable ya contiene una clave con:
//      System.out.println("Existe la clave 3? "+hash.containsKey(3));
//      System.out.println("Existe la clave 4? "+hash.containsKey(4));
	    
		//TreeMap Incluye una clave por cada valor, y se ordena automaticamente de acuerdo a las claves
//        int numero = 3;
//	    Arreglos ar = new Arreglos();
//	    ar.arreglo(numero);
	    
	    
	    //Recorrer el contenido del arreglo una posicicon
//	    int[] arreglo1 = {1,2,3,4,5,6,7,8,9,0};
//	    for(int i : arreglo1)
//	    	System.out.print(i+" ");
//	    System.out.println();
//	    arreglo1 = arreglo.recorrido(arreglo1);
//	    for(int i: arreglo1)
//	    	System.out.print(i+" ");
	    
	    Archivos archivo = new Archivos();
	    String lorem = "";
	    
	    lorem = archivo.minusculaLeer("C:\\Users\\osval\\Desktop\\prueba.txt"); 
	    System.out.println(lorem);
	    archivo.minusculaGuardar("C:\\Users\\osval\\Desktop\\prueba1.txt", lorem);
	    
//	    archivo.escribir("C:\\Users\\osval\\Desktop\\Escribir.txt", "Tienen lavadora?");
//	    archivo.escribir("C:\\Users\\osval\\Desktop\\Escribir.txt", "Sobreescribiendo");
	    
	    
	    
	}
	

}


