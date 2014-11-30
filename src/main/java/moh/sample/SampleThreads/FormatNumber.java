package moh.sample.SampleThreads;

import java.text.DecimalFormat;

public class FormatNumber {

	public static void main(String[] args) {
		formatNumber(125.777);

	}
	
	public static double formatNumber(double n) {

		DecimalFormat decFormat = new DecimalFormat("000.00");
		
		double formatDecimal = new Double(decFormat.format(n));
		
		System.out.println("DecimalFormat rounded in 2nd decimal: "+formatDecimal);

		return formatDecimal;
	}

}
