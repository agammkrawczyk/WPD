package rozdz3KlasyObiekty;

public class PubTest {
	public static void main(String[] args) {

	    // Tworzenie obiektu - publikacji

	    Publication b = new Publication("Psy", "Dog & Sons", 2002,
	                                    "ISBN6789", 21.0, 0);

	    int n = 10; // kupimy n = 10 egzemplarzy
	    b.buy(n);

	    // ³atwo policzyæ koszt zakupu
	    double koszt = n * b.getPrice();

	    System.out.println("Na zakup " + n + " publikacji:");
	    System.out.println(b.getTitle());
	    System.out.println(b.getPublisher());
	    System.out.println(b.getYear());  
	    System.out.println(b.getIdent());
	    System.out.println("---------------\nwydano: " + koszt);

	    // teraz sprzedamy 4 egzemplarze i zobaczymy ile zosta³o
	    b.sell(4);
	    System.out.println("Po sprzeda¿y zosta³o " + b.getQuantity() + " pozycji");
	  }
}
