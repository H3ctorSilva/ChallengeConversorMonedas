package Conversor;

import javax.swing.JOptionPane;

public class ListaDeConversiones {
	
	Monedas moneda = new Monedas();
	
	
	public void Monedas (double valorDeEntrada) {
		//Lista de las tipos de conversiones
		Object[] Conversiones = {"Peso Mx a Dolar EU", "Dolar EU a Peso Mx", "Peso Mx a Euro", "Euro a Peso Mx", "Peso Mx a Libra", "Libra a Peso Mx",
								"Peso Mx a Yen", "Yen a Peso Mx", "Peso Mx a Won", "Won a Peso Mx"};
		String ListaConversiones = JOptionPane.showInputDialog(null, "Selecciona la conversión", "Divisas",
							JOptionPane.QUESTION_MESSAGE, null, Conversiones,Conversiones).toString();
	
	
	switch (ListaConversiones){
	
	case "Peso Mx a Dolar EU":
		moneda.Mx_DolarEU(valorDeEntrada);
		break;
	
	case "Dolar EU a Peso Mx":
		moneda.DolarEU_Mx(valorDeEntrada);
		break;
	
	case "Peso Mx a Euro":
		moneda.Mx_Euro(valorDeEntrada);
		break;
		
	case "Euro a Peso Mx":
		moneda.Euro_Mx(valorDeEntrada);
		break;
		
	case "Peso Mx a Libra":
		moneda.Mx_Libra(valorDeEntrada);
		break;
	
	case "Libra a Peso Mx":
		moneda.Libra_Mx(valorDeEntrada);
		break;
	
	case "Peso Mx a Yen":
		moneda.Mx_Yen(valorDeEntrada);
		break;
		
	case "Yen a Peso Mx":
		moneda.Yen_Mx(valorDeEntrada);
		break;
		
	case "Peso Mx a Won":
		moneda.Mx_Won(valorDeEntrada);
		break;
		
	case "Won a Peso Mx":
		moneda.Won_Mx(valorDeEntrada);
		break;
	}
	
	}

}
