package rozdz3KlasyObiekty;

public class Disk {
	 private static double vat;

	  private String model;
	  private int capacity;
	  private double price;

	  public Disk(String m, int c, double p) {
	    model = m;
	    capacity = c;
	    price = p;
	  }

	  public String getDescription() {
	    return model + ", " + capacity + " GB";
	  }

	  public double getBruttoPrice() {
	    return price * (1 + vat / 100);
	  }

	  public static void setVat(double v) {
	    vat = v;
	  }

	}

