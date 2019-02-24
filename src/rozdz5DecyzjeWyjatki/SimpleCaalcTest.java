package rozdz5DecyzjeWyjatki;

public class SimpleCaalcTest {
	 public static void main(String[] args) {

		    SimpleCalc sc = new SimpleCalc(1.2, 3.7);
		    System.out.println( sc.makeOp('+'));
		    System.out.println( sc.makeOp('-'));
		    System.out.println( sc.makeOp('*'));
		    System.out.println( sc.makeOp('/'));
		    System.out.println( sc.makeOp('z'));
		  }
}
