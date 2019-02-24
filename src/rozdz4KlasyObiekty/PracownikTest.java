package rozdz4KlasyObiekty;

public class PracownikTest {
public static void main(String args[] ) {
	Pracownik pracownik1= new Pracownik("Jan","Kowalski",1500);
	System.out.println(pracownik1);
	pracownik1.podwyzka();
	System.out.println(pracownik1);
	
	Pracownik pracownik2= new Pracownik("Piotr","Kowalczyk", 2000);
	System.out.println(pracownik2);
	pracownik2.podwyzkaMax();
	System.out.println(pracownik2);
	
}
}
