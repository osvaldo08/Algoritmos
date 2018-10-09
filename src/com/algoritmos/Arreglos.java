package com.algoritmos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Arreglos {
	
	public int media(ArrayList nums) {
		
		int media = 0;
		Iterator it = nums.iterator(); //Recorrer arraylist
		while(it.hasNext()) { //Regresa true si existen elemtnos en el arreglo
			media +=(int)it.next();		//mostrar el arreglo
			}
		media = media/nums.size();
		
		return media;
  	  
    }
	
	public long[] fibonacci(int limite) {

		long[] serie = new long[limite];
		
		if(limite>1)
		{
			serie[0]=0;
			serie[1]=1;
			for(int i=2; i<limite; i++) {
				serie[i] = serie[i-1]+serie[i-2];}
		}else if(limite==1){
			serie[0]=0;
		}
		
		return serie;
		
		}
	
	public int arreglo(int numero) {

		int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		for(int i=0; i<numero; i++) {
			for(int j=0; j<10; j++)
			{
			System.out.println(arreglo[j]);
			}
			System.out.println("\n");
			for(int k=0; k<10; k++) {
				if(arreglo[k]==0)
				{
					arreglo[k]=9;
				}else
				{
					arreglo[k] = arreglo[k]-1;
				}
				
			}
		}
		return numero;
	}
	
	public int[] recorrido(int[] arreglo) {
		int[] nuevoArr = new int[arreglo.length];
		for(int i=1; i<arreglo.length; i++)
			nuevoArr[i]=arreglo[i-1];
		nuevoArr[0]=arreglo[arreglo.length-1];
		
		return nuevoArr;
	}
		
		//while()
		
//		if(limite>1)
//		{
//			serie[0]=0;
//			serie[1]=1;
//			for(int i=2; i<limite; i++) {
//				serie[i] = serie[i-1]+serie[i-2];}
//		}else if(limite==1){
//			serie[0]=0;
//		}
//		
//		return serie;
//		
//		}
	
	/*public static void main(String[] args) {
		
		
		Random rn = new Random();
	
            int [] elementos = new int[10];    
		    int n=0;      

		      for(int i=0; i<10; i++) //generamos 10 números
		      {
		             n = (int)(rn.nextDouble() * 12)+1; //generamos numeros aleatorios entre 1 y 12
		             elementos[i] = n; //guardamos el entero obtenido en el array
		      }
		      
		      
		      for(int i=0; i<10; i++) {
		      
		      switch(elementos[i]) {
		      
		      case 1: System.out.println(elementos[i]+" -> Enero");
		    	  break;
		      case 2: System.out.println(elementos[i]+" -> Feberero");
	    	  break;
		      case 3: System.out.println(elementos[i]+" -> Marzo");
	    	  break;
		      case 4: System.out.println(elementos[i]+" -> Abril");
	    	  break;
		      case 5: System.out.println(elementos[i]+" -> Mayo");
	    	  break;
		      case 6: System.out.println(elementos[i]+" -> Junio");
	    	  break;
		      case 7: System.out.println(elementos[i]+" -> Julio");
	    	  break;
		      case 8: System.out.println(elementos[i]+" -> Agosto");
	    	  break;
		      case 9: System.out.println(elementos[i]+" -> Septiembre");
	    	  break;
		      case 10: System.out.println(elementos[i]+" -> Octubre");
	    	  break;
		      case 11: System.out.println(elementos[i]+" -> Noviembre");
	    	  break;
		      case 12: System.out.println(elementos[i]+" -> Diciembre");
	    	  break;
		      default: System.out.println("Error");
		      break;
		      }
		      }
		      
		      
		      
		      
		  */
		

		       
	
	}
	
	                         

