package TypyDanych;

public class TermometrFahrenheitaCompareCelcjusz {
	public static void main(String args[])
	{
	  double tempInFarenheit;
	  double tempInCelcujsz= 38.5;
		tempInFarenheit = (tempInCelcujsz * 1.8) + 32;
		
		System.out.println("temperatura w skali celcjusza to : "
		+ tempInCelcujsz + " czyli "+tempInFarenheit+ "F");
	}
}
