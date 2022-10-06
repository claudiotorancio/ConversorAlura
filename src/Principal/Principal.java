package Principal;

import javax.swing.*;

import ConversorMonedas.OpcionesConversion;

public class Principal {
	public static void main(String[] args) {

		OpcionesConversion conversion = new OpcionesConversion();

		while (true) {
			String opciones = JOptionPane.showInputDialog(null, "Seelccione una opcion de conversion", "Menu", JOptionPane.PLAIN_MESSAGE,
							null, new Object[] { "Conversor de moneda", "Conversor de Temperatura" }, "Elegir")
					.toString();
			switch (opciones) {
			case "Conversor de moneda":
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
			}
			switch (opciones) {
			case "Conversor de Temperatura":
				String input2 = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido2 = Double.parseDouble(input2);
				conversion.ConversorTemperatura(valorRecibido2);
			}
			int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra Conversion?");
			if (JOptionPane.OK_OPTION != respuesta) {
							
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			}
		
		}
	
	}

}
