package com.algoritmos;

public class Ciclos {
	
	public int potencia(int base, int exponente) {
		int res=1;
		
		for(int i=0; i<exponente; i++) {
			res *= base;
		}
		
		return res;
	}
	
}
