package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {

	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De pesos a Dolar", "De pesos a Euro", "De pesos a Libras", "De pesos a Yen",
						"De pesos a Won Coreano", "De Dolar a Pesos", "De Euros a Pesos", "De libras a Pesos",
						"De Yen a pesos", "De Won Coreano a Pesos" },
				"Seleccion")).toString();
		switch (opcion) {
		case "De pesos a Dolar":
			monedas.ConvertirPesosArgentinosADolares(valor);
			break;

		case "De pesos a Euro":
			monedas.ConvertirPesosArgentinosAEuros(valor);
			break;

		case "De pesos a Libras":
			monedas.ConvertirPesosArgentinosALibra(valor);
			break;

		case "De pesos a Yen":
			monedas.ConvertirPesosArgentinosAYen(valor);
			break;

		case "De pesos a Won Coreano":
			monedas.ConvertirPesosArgentinosAWon(valor);
			break;

		case "De Dolar a Pesos":
			monedas.ConvertirDolaresAPesosArgentinos(valor);
			break;

		case "De Euros a Pesos":
			monedas.ConvertirEurosAPesos(valor);
			break;

		case "De libras a Pesos":
			monedas.ConvertirLibrasAPesos(valor);
			break;

		case "De Yen a pesos":
			monedas.ConvertirYenAPesos(valor);
			break;

		case "De Won Coreano a Pesos":
			monedas.ConvertirWonAPesos(valor);
			break;

		}
	}

	ConversorTemperatura temp = new ConversorTemperatura();

	public void ConversorTemperatura(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Grados a Farenheit", "De Grados a Kelvin",
						"De Farenheit a Grados", "De Farenheit a Kelvin", "De Kelvin a Farenheit", "Kelvin a Grados" },
				"Seleccion")).toString();
		switch (opcion) {
		case "De Grados a Farenheit":
			temp.ConvertirGradosAFarenheit(valor);
			break;

		case "De Grados a Kelvin":
			temp.ConvertirGradosAKelvin(valor);
			break;

		case "De Farenheit a Grados":
			temp.ConvertirFarenheitAGrados(valor);
			break;

		case "De Farenheit a Kelvin":
			temp.ConvertirFarenheitAKelvin(valor);
			break;

		case "De Kelvin a Farenheit":
			temp.ConvertirKelvinAFarenheit(valor);
			break;

		case "Kelvin a Grados":
			temp.ConvertirKelvinAGrados(valor);
			break;

		}

	}
}