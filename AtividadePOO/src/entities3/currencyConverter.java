package entities3;

public class currencyConverter {

		public static double IOF = 0.06;
		
		public static double converterMoeda(double dolar, double qtdDolar) {
			return dolar * qtdDolar * (IOF + 1);
		} 
		
	}
	
