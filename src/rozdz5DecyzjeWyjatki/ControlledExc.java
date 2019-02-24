package rozdz5DecyzjeWyjatki;

public class ControlledExc {
	public void printWaitAndPrint() throws InterruptedException {
	    System.out.println("Za 2 sekundy wypisz� nast�pny tekst");
	    Thread.sleep(2000);
	    System.out.println("Nast�pny tekst");
	  }
	  
	  public static void main(String[] args)  {
		  try {
		      new ControlledExc().printWaitAndPrint();
		    } catch (InterruptedException exc) {
		        exc.printStackTrace();
		    }
		  
	  }

}
