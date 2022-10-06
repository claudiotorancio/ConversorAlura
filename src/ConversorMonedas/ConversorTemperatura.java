package ConversorMonedas;
import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
		public void ConvertirGradosAFarenheit (double valor) {
			double medidaF = valor / 33.8;
			medidaF = (double) Math.round(medidaF * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaF + "°F");
			
		}
		
		public void ConvertirGradosAKelvin (double valor) {
			double medidaK = valor / 274.15;
			medidaK = (double) Math.round(medidaK * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaK + "K");
			
		}
		
		public void ConvertirFarenheitAGrados (double valor) {
			double medidaC = valor / -17.22;
			medidaC = (double) Math.round(medidaC * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaC + "°C");
			
		}
		
		public void ConvertirFarenheitAKelvin (double valor) {
			double medidaK = valor / 255.928;
			medidaK = (double) Math.round(medidaK * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaK + "°K");
			
		}
		
		public void ConvertirKelvinAFarenheit (double valor) {
			double medidaF = valor / -457.87;
			medidaF = (double) Math.round(medidaF * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaF + "°F");
			
		}
		
		public void ConvertirKelvinAGrados (double valor) {
			double medidaC = valor / -272.15;
			medidaC = (double) Math.round(medidaC * 100d) /100;
			JOptionPane.showMessageDialog(null, "Tienes " + medidaC + "°C");
			
		}
}
