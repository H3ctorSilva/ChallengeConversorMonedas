package Conversor;

import javax.swing.JOptionPane;

public class Tiempo {
	
	//Conversion de Tiempo
	
		static final int anhoEnDias = 365;
		static final int diaEnHora = 24;
		static final int horaEnMinutos = 60;
		static final int minutoEnSegundos = 60;
		
		//Comienza la parte de la cconversion del tiempo
		
		double anhoXhora = anhoEnDias * diaEnHora;
		double anhoXminutos = anhoXhora * horaEnMinutos; 
		double anhoXsegundos = anhoXminutos * minutoEnSegundos;
		double diaXminutos = diaEnHora * horaEnMinutos;
		double diaXsegundos = diaXminutos * minutoEnSegundos;
				
		public void AnhoEnhoras (double valor) {
			double anhoHora = valor * anhoXhora;
			anhoHora = (double) Math.round(anhoHora*100)/100;
			JOptionPane.showMessageDialog(null, anhoHora + " horas hay en " + valor + " años." );
		}
		
		public void AnhoEnMinutos (double valor) {
			double anhoMinutos = valor * anhoXminutos;
			anhoMinutos = (double) Math.round(anhoMinutos*100)/100;
			JOptionPane.showMessageDialog(null, anhoMinutos + " minutos hay en " + valor + " años." );
		}
		
		public void AnhoEnSegundos (double valor) {
			double anhoSegundos = valor * anhoXsegundos;
			anhoSegundos = (double) Math.round(anhoSegundos*100)/100;
			JOptionPane.showMessageDialog(null, anhoSegundos + " segundos hay en " + valor + " años." );
		}

		public void DiasEnHoras (double valor) {
			double diasHora = valor * diaEnHora;
			JOptionPane.showMessageDialog(null, diasHora + " horas hay en " + valor + " días.");
		}
		
		public void DiasEnMinutos (double valor) {
			double diasMinutos = valor * diaXminutos;
			diasMinutos = (double) Math.round(diasMinutos*100)/100;
			JOptionPane.showMessageDialog(null, diasMinutos + " minutos hay en " + valor + " días.");
			
		}
		
		public void DiasEnSegundos (double valor) {
			double diasSegundos = valor * diaXsegundos;
			diasSegundos = (double) Math.round(diasSegundos*100)/100;
			JOptionPane.showMessageDialog(null, diasSegundos + " segundos hay en " + valor + " días.");
		}	
}
