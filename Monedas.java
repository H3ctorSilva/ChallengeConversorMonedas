package Conversor;

import javax.swing.JOptionPane;

public class Monedas {
	
	private static final String DolarAPeso = null;
	//Divisas del peso Mexicano
	
	double dolar = 16.90;
	double euro = 18.67;
	double yen = 0.119;
	double libra = 21.71;
	double won  = 75.44; 
	
	// Peso Mexicano a Dolar
	
	public void Mx_DolarEU(double valor) {
		double PesoADolar = (valor/dolar);
		//Siguiendo los ejemplos de https://www.aluracursos.com/blog/redondeo-de-numeros-en-java
		
		PesoADolar = (double) Math.round(PesoADolar *100)/100;
		JOptionPane.showMessageDialog(null, "Al día de hoy "+ valor + " pesos mexicanos equivalen a: " + PesoADolar +  " Dolares EU");
	}
	
	//Dolar a Peso Mexicano
	
	public void DolarEU_Mx(double valor) {
		double DolarAPeso = valor*dolar;
		DolarAPeso = (double)Math.round(DolarAPeso*100)/100;
		JOptionPane.showMessageDialog(null, "Al día de hoy " + valor + " equivalen a " + DolarAPeso +  " Pesos Mexicanos");
	}
	
	// Peso Mexicano a Euro
	
		public void Mx_Euro(double valor) {
			double PesoAEuro = valor/euro;
			PesoAEuro = (double) Math.round(PesoAEuro*100)/100;
			JOptionPane.showMessageDialog(null,"Al día de hoy " + valor + " equivalen a  " + PesoAEuro +  " Euros");
		}
		
		//Euro a Peso Mexicano
		
		public void Euro_Mx(double valor) {
			double EuroAPeso = valor*euro;
			EuroAPeso = (double) Math.round(EuroAPeso*100)/100;
			JOptionPane.showMessageDialog(null,"Al día de hoy " + valor + " equivalen a " +  EuroAPeso +  " Pesos Mexicanos");
		}
		
		// Peso Mexicano a Libra
		
		public void Mx_Libra(double valor) {
			double PesoALibra = valor/libra;
			PesoALibra = (double) Math.round(PesoALibra*100)/100;
			JOptionPane.showMessageDialog(null,"Al día de hoy " + valor + " equivalen a " + PesoALibra +  " Libras");
		}
			
		//Libra a Peso Mexicano
			
		public void Libra_Mx(double valor) {
			double LibraAPeso = valor*libra;
			LibraAPeso = (double) Math.round(LibraAPeso*100)/100;
			JOptionPane.showMessageDialog(null,"Al día de hoy " + valor + " equivalen a " +  LibraAPeso +  " Pesos Mexicanos");
		}
		
		// Peso Mexicano a Yen
		
		public void Mx_Yen(double valor) {
			double PesoAYen = valor/yen;
			PesoAYen = (double) Math.round(PesoAYen*100)/100;
			JOptionPane.showMessageDialog(null,"Al día de hoy " + valor + " equivalen a " + PesoAYen +  " Yenes");
		}
					
		//Yen a Peso Mexicano
					
		public void Yen_Mx(double valor) {
			double YenAPeso = valor * yen;
			YenAPeso = (double) Math.round(YenAPeso*100)/100;
			JOptionPane.showMessageDialog(null,"Al día de hoy " + valor + " equivalen a " +  YenAPeso +  " Pesos Mexicanos");
		}
		
		// Peso Mexicano a Won Sur Coreano
		
		public void Mx_Won(double valor) {
			double PesoAWon = valor/won;
			PesoAWon = (double) Math.round(PesoAWon*100)/100;
			JOptionPane.showMessageDialog(null,"Al día de hoy "+ valor + " equivalen a " + PesoAWon +  " Wones SC");
		}
					
		//Won Sur Corea a Peso Mexicano
					
		public void Won_Mx(double valor) {
			double WonAPeso = valor * won;
			WonAPeso = (double) Math.round(WonAPeso*100)/100;
			JOptionPane.showMessageDialog(null,"Al día de hoy " + valor + " equivalen a " +  WonAPeso +  " Pesos Mexicanos");
		}
		
}
