package rozdz3KlasyObiekty;

public class Test {
	public static void main(String[] args) {
	    Disk.setVat(22.0);
	    Disk d1 = new Disk("Seagate Barracuda", 500, 200.0);
	    System.out.println(d1.getDescription() + " - cena "
	                       + d1.getBruttoPrice() + " z³");
	  }
}
