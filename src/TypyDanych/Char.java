package TypyDanych;

public class Char {
	public static void main(String[] args) {

		 char c = 'a';
		 int kod = c;
		 System.out.println("Kod znaku " + c + " = " + kod);
		 kod = 77;
		 c = (char) kod;
		 System.out.println("Kod znaku " + c + " = " + kod);

		 // Czasem trzeba u�y� jawnej konwersji rozszerzaj�cej
		 System.out.println("Kod znaku " + '*' + " = " + (int) '*');

		 // Oczywi�cie - zaw�aj�ce zawsze trzeba podawa� jawnie
		 System.out.println("Kod znaku " + (char) 66 + " = " + 66);

		 }
}
