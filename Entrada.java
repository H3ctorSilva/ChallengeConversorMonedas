package Conversor;

import java.awt.*;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Entrada {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Este nos permitira realizar las conversiones siempre y cuando no se de por terminado el programa
		boolean conversion = true;
		
		ListaDeConversiones moneda = new ListaDeConversiones();
		ListaDeConversionesTiempo tiempo = new ListaDeConversionesTiempo();
		
		//Si la conversion sigue siendo True continuara haciendo las conversiones
		
		while(conversion) {
			
		
			//Las opciones de conversores (Moneda y Tiempo) 
			
			Object [] opciones = {"Moneda" , "Tiempo"};
			int seleccion = JOptionPane.showOptionDialog(null, "Selecciona el tipo de conversion", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones);
			
			if(seleccion == 0) {
				String cantidad = JOptionPane.showInputDialog("Cantidad");
				
				try {
				double valorDeEntrada = Double.parseDouble(cantidad);
					if (valorDeEntrada >= 0) {
						moneda.Monedas(valorDeEntrada);
					}else {
						JOptionPane.showMessageDialog(null, "Es un número negativo");
					}
				}catch (NumberFormatException exception) {
					JOptionPane.showMessageDialog(null, "No es una entrada valida");
					System.out.println("No es un numero");
				}	
				
				
				//Mensaje que nos aparece para realizar nuevamente una nueva conversion
				
				int seleccion2 = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversión", "Seleccionar", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
				if (seleccion2 == 0) {
					System.out.println("Continua el programa");
				} else{
					JOptionPane.showMessageDialog(null, "Hasta luego");
					conversion = false;
				}
			}
			
			if(seleccion == 1) {
				String cantidad = JOptionPane.showInputDialog("Cantidad");
				
				try {
					double valorDeEntrada = Double.parseDouble(cantidad);
					if (valorDeEntrada >= 0) {
					tiempo.Tiempo(valorDeEntrada);
				}else {
					JOptionPane.showMessageDialog(null, "Es un número negativo");
				}
				}catch (NumberFormatException exception) {
				JOptionPane.showMessageDialog(null, "No es una entrada valida");
				System.out.println("No es un numero");
				}	
				
				//Mensaje que nos aparece para realizar nuevamente una nueva conversion
				int seleccion2 = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversión", "Seleccionar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null);
				if (seleccion2 == 0) {
					System.out.println("Continua el programa");
				} else{
					JOptionPane.showMessageDialog(null, "Hasta luego");
					conversion = false;
				}
		}
		
		}
		
		
		
		
		
	}

}
