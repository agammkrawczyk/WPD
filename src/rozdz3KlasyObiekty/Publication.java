package rozdz3KlasyObiekty;

public class Publication {
	
	 private String title;
	  private String publisher;
	  private int year;
	  private String ident;
	  private double price;
	  private int quantity;

	  
	  public Publication(String t, String pb, int y,
              String i, double pr, int q)
{
title = t;       // pole title uzyskuje warto�� parametru t
publisher = pb;  // pole publisher uzyskuje warto�� parametru pb
year = y;
ident = i;       // itd...
price = pr;
quantity = q;
}
	  public String getTitle() {
		   return title;
		 }

		 // Zwraca wydawc�

		 public String getPublisher() {
		   return publisher;
		 }

		 // Zwraca rok wydania

		 public int getYear() {
		   return year;
		 } 

		 // Zwraca numer identyfikacyjny

		 public String getIdent() {
		   return ident;
		 }

		 // Zwraca cen�

		 public double getPrice() {
		   return price;
		 }

		 // Zmienia cen�

		 public void setPrice(double p) {
		   price = p;
		 }

		 // Zwraca liczb� egzemplarzy

		 public int getQuantity() {
		   return quantity;
		 }

		 // Zakup n egzemplarzy

		 public void buy(int n) {
		   quantity += n;
		 }

		 // Sprzeda� n egzemplarzy

		 public void sell(int n) {
		   quantity -= n;
		 }

}
