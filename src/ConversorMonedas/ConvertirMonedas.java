package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
		public void ConvertirPesosArgentinosADolares (double valor) {
			double monedaDolar = valor / 149.21;
			monedaDolar = (double) Math.round(monedaDolar * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares");
			
		}
		
		public void ConvertirPesosArgentinosAEuros (double valor) {
			double monedaEuro = valor / 146.27;
			monedaEuro = (double) Math.round(monedaEuro * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro + " Euro");
			
		}
		//De pesos a Libras
		public void ConvertirPesosArgentinosALibra (double valor) {
			double monedaLibra = valor / 166.40;
			monedaLibra = (double) Math.round(monedaLibra * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaLibra + " Libras");
			
		}
		
		//De pesos a Yen
		public void ConvertirPesosArgentinosAYen (double valor) {
			double monedaYen = valor / 166.40;
			monedaYen = (double) Math.round(monedaYen * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaYen + " Yenes");
			
		}
		
		//De pesos a Won Coreano
		public void ConvertirPesosArgentinosAWon (double valor) {
			double monedaWon = valor / 166.40;
			monedaWon = (double) Math.round(monedaWon * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaWon + " Wones");
			
		}
		
		//De Dolar a Pesos
		public void ConvertirDolaresAPesosArgentinos (double valor) {
			double monedaPesos = valor / 0.0067;
			monedaPesos = (double) Math.round(monedaPesos * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " pesos");
			
		}
		
		//De Euros a Pesos
		public void ConvertirEurosAPesos (double valor) {
			double monedaPesos = valor / 0.0068;
			monedaPesos = (double) Math.round(monedaPesos * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " pesos");
			
		}
		
		//De libras a Peso
		public void ConvertirLibrasAPesos (double valor) {
			double monedaPesos = valor / 0.0060;
			monedaPesos = (double) Math.round(monedaPesos * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " pesos");
			
		}
		
		//De Yen a pesos
		public void ConvertirYenAPesos (double valor) {
			double monedaPesos = valor / 1.03;
			monedaPesos = (double) Math.round(monedaPesos * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " pesos");
			
		}
		
		//De Won Coreano a Pesos
		public void ConvertirWonAPesos (double valor) {
			double monedaPesos = valor / 9.45;
			monedaPesos = (double) Math.round(monedaPesos * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " pesos");
			
		}
}

