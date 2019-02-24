package rozdz5DecyzjeWyjatki;

public class SimpleCalc2 {
	 private static enum Op { PLUS, MINUS, MULT, DIV };

	  private double a;
	  private double b;

	  public SimpleCalc2(double x, double y) {
	    a = x;
	    b = y;
	  }

	  public double makeOp(Op op) {

	    double r = 0;

	    switch(op) {
	       case PLUS : r = a + b; break;
	       case MINUS : r = a - b; break;
	       case MULT : r = a * b; break;
	       case DIV : r = a / b; break;
	       default  : System.out.println("Nieznany kod operacji");
	    }

	    return r;
	  }
	  
	  public static void main(String[] args) {

	    SimpleCalc2 sc = new SimpleCalc2(1.2, 3.7);
	    System.out.println( sc.makeOp(Op.PLUS));
	    System.out.println( sc.makeOp(Op.MINUS));
	    System.out.println( sc.makeOp(Op.MULT));
	    System.out.println( sc.makeOp(Op.DIV));
	  }

}
