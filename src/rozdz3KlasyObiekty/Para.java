package rozdz3KlasyObiekty;

public class Para {
	

	 private int a;
	  private int b;
	 
	  // konstruktor bezparametrowy
	  public Para() { 
	  }
	 
	  // konstruktor z dwoma argumentami = elementami pary
	  public Para(int x, int y) { 
	    a = x;
	    b = y;
	  }
	 
	  // Metoda ustalaj�ca sk�adniki pary 
	  public void set(int x, int y) { 
	    a = x;
	    b = y;
	  }
	 
	  // Metoda pokazujaca par�
	  public void show() {
	    System.out.println("( " + a + "," + b + " )");
	  }
 
	 

}
