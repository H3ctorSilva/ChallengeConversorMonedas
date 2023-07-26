package Conversor;

import javax.swing.JOptionPane;

public class ListaDeConversionesTiempo {
	
	Tiempo tiempo = new Tiempo();
	
	public void Tiempo (double valorDeEntrada) {
		//Lista de las tipos de conversiones
		Object[] Conversiones = {"Año a Horas", "Año a Minutos", "Año a Segundos", "Días a Horas", "Días a Minutos", "Días a Segundos"};
		String ListaTiempo = JOptionPane.showInputDialog(null, "Selecciona la conversión", "Divisas",
							JOptionPane.QUESTION_MESSAGE, null, Conversiones,Conversiones).toString();
		
		switch (ListaTiempo) {
		case "Año a Horas":
			tiempo.AnhoEnhoras(valorDeEntrada);
			break;
			
		case "Año a Minutos":
			tiempo.AnhoEnMinutos(valorDeEntrada);
			break;
		
		case "Año a Segundos":
			tiempo.AnhoEnSegundos(valorDeEntrada);
			break;
		
		case "Días a Horas":
			tiempo.DiasEnHoras(valorDeEntrada);
			break;
			
		case "Días a Minutos":
			tiempo.DiasEnMinutos(valorDeEntrada);
			break;
			
		case "Días a Segundos":
			tiempo.DiasEnSegundos(valorDeEntrada);
			break;
		}

	}
}
