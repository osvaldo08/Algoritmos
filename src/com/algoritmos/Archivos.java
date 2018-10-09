package com.algoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos {
	
	//Leer un archivo 
	public String leer(String ubicacion) {
		String texto ="";
	
		try {
			
			File archivo = new File(ubicacion);
			FileReader reader = new FileReader(archivo); //permite leer el archivo
			BufferedReader buffer = new BufferedReader(reader); //Almacenar la informacion del archivo
			String temp;
			while((temp=buffer.readLine())!=null) {
				texto+= temp+"\n";
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return texto;
	}
	
	//Escribir en un archivo
	public void escribir(String ubicacion, String contenido) {
		
		try {
			
			
			//Agrega el texto al archivo
			FileWriter archivo = new FileWriter(ubicacion, true);
			
			//Sobreescribe lo que hay en el archivo
			PrintWriter writer = new PrintWriter(archivo);
			writer.println(contenido);
			writer.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	
	}
	
	public String minusculaLeer(String ubicacion) {
		
		String texto ="";
		String resultado="";
		
          try {
			
			File archivo = new File(ubicacion);
			FileReader reader = new FileReader(archivo); //permite leer el archivo
			BufferedReader buffer = new BufferedReader(reader); //Almacenar la informacion del archivo
			String temp;
			while((temp=buffer.readLine())!=null) {
				texto+= temp+"\n";
		         resultado = texto.replaceAll("[a|e|i|o|u|A]", "_");
		     
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return resultado;
	}
	
	public void minusculaGuardar(String ubicacion, String contenido) {
		
try {
			
			
			//Agrega el texto al archivo
			FileWriter archivo = new FileWriter(ubicacion);
			
			//Sobreescribe lo que hay en el archivo
			PrintWriter writer = new PrintWriter(archivo);
			writer.println(contenido);
			writer.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
			

	}

}
