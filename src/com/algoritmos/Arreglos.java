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
		      
		      
		      
		      
		  
		

		       
	
	}*/
	
	                         

}
