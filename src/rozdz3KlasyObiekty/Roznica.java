package rozdz3KlasyObiekty;

public class Roznica {
	public static void main(String[] args) {

	    // Operacje na zmiennych typów prostych
	    int x, y, z;
	    x = 3;
	    y = 4;
	    x = y;
	    y = 5;
	    z = 5;
	    System.out.println("x = " + x);
	    System.out.println("y = " + y);
	    System.out.println("z = " + z);
	    if (x == y) System.out.println ("x i y równe.");
	    else System.out.println ("x i y nierówne.");
	    if (y == z) System.out.println ("y i z równe.");
	    else System.out.println ("y i z nierówne."); 

	    // Podobne operacje na zmiennych typu referencyjnego
	    Para px = new Para(), py = new Para(), pz = new Para();
	    px.set( 3, 3 );
	    py.set( 4, 4 );
	    pz.set( 5, 5 );
	    px = py;
	    py.set( 5, 5 );
	    System.out.print("Para px: "); px.show();
	    System.out.print("Para py: "); py.show();
	    System.out.print("Para pz: "); pz.show();
	    if (px == py) System.out.println ("px i py równe.");
	    else System.out.println ("px i py nierówne.");
	    if (py == pz) System.out.println ("py i pz równe.");
	    else System.out.println ("py i pz nierówne.");

	  }

}
