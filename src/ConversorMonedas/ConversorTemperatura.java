package ConversorMonedas;
import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
		public void ConvertirGradosAFarenheit (double valor) {
			double medidaF = valor * 1.8 + 32;
			medidaF = (double) Math.round(medidaF * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaF + "°F");
			
		}
		
		public void ConvertirGradosAKelvin (double valor) {
			double medidaK = valor + 273.15;
			medidaK = (double) Math.round(medidaK * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaK + "K");
			
		}
		
		public void ConvertirFarenheitAGrados (double valor) {
			double medidaC = (valor -32) / 1.8;
			medidaC = (double) Math.round(medidaC * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaC + "°C");
			
		}
		
		public void ConvertirFarenheitAKelvin (double valor) {
			double medidaK =  (valor - 32) * 5/9   + 273.15;
			medidaK = (double) Math.round(medidaK * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaK + "°K");
			
		}
		
		public void ConvertirKelvinAFarenheit (double valor) {
			double medidaF = 1.8 *( valor -273.15) + 32;
			medidaF = (double) Math.round(medidaF * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaF + "°F");
			
		}
		
		public void ConvertirKelvinAGrados (double valor) {
			double medidaC = valor - 273.15;
			medidaC = (double) Math.round(medidaC * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaC + "°C");
			
		}
}
