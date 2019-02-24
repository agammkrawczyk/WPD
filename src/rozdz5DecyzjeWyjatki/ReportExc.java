package rozdz5DecyzjeWyjatki;

public class ReportExc {
	 public ReportExc() {
		    wykonaj();
		  }

		  public void wykonaj() {
		    try {
		      int num = Integer.parseInt("1aaa");
		    } catch (NumberFormatException exc) {
		        System.out.println("Co podaje getMessage()");
		        System.out.println( exc.getMessage());
		        System.out.println("Co podaje toString()");
		        System.out.println(exc);
		        System.out.println("Wydruk œladu stosu (kolejnoœæ wywo³añ metod)");
		        exc.printStackTrace();
		        System.exit(1);
		    }
		  }

		  public static void main(String[] args) {
		    new ReportExc();
		  }

}
