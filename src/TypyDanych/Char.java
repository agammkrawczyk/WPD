package TypyDanych;

public class Char {
	public static void main(String[] args) {

		 char c = 'a';
		 int kod = c;
		 System.out.println("Kod znaku " + c + " = " + kod);
		 kod = 77;
		 c = (char) kod;
		 System.out.println("Kod znaku " + c + " = " + kod);

		 // Czasem trzeba u¿yæ jawnej konwersji rozszerzaj¹cej
		 System.out.println("Kod znaku " + '*' + " = " + (int) '*');

		 // Oczywiœcie - zawê¿aj¹ce zawsze trzeba podawaæ jawnie
		 System.out.println("Kod znaku " + (char) 66 + " = " + 66);

		 }
}
