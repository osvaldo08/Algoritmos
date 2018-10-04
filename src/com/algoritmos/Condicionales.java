package com.algoritmos;

public class Condicionales {

	////////////////////////////////////////////////////////
	public boolean acreditar(int asistencias, int calificacion) {
		final int totalAsist = 70;
		boolean paso = false;
		if(asistencias >= (totalAsist*.8) && calificacion>=60) {
			paso = true;
			
		}
		
		
		return paso;
	}
	
	////////////////////////////////////////////////////////////////////////////////
	public double pago(int horas, int pago ) {
		   double total = 0;
		if(horas>40){
			double extras = (horas-40)*(pago*1.5);
			total = 40*pago+extras;	
			
		}else {
			total=horas*pago;
		}
		
		
		
		return total;
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	public int medio(int n1, int n2, int n3) {
		
		if(n1<n2&&n1>n3||n1>n2&&n1<n3) {
			return n1;
		}else if(n2>n1&&n2<n3||n2<n1&&n2>n3) {
			return n2;
		}else {
		
		return n3;}
	}
	
/////////////////////////////////////////////////////////////////////////	
	public int sumaDigitos(int n1, int n2) {
		int i, j;
		for(i= 0; n1>=0;i++) {
			n1 = n1/10;
			int cifras1 = i;
			
		}
		
		for(j= 0; n2>=0;j++) {
			n2 = n2/10;
			int cifras2=j;
			
		}
		
		int total = j+i;
		
       return total;
	}
	
	//////////////////////////////////////////////////////////////////////
	
        public boolean primos(int numero) {
		
		int i=1;
		int a=0;
		boolean bandera=false;
		
		do{
			
			if(numero%i==0) {
				
				i++;
				a++;
				
			}else {
				i++;
			}
			
		}while(i<=numero);
		
		if(a==2) {
			bandera=true;
		}
		
		return bandera;
	}
        
       

}
