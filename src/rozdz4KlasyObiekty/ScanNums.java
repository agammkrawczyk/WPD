package rozdz4KlasyObiekty;
import java.util.*;
public class ScanNums {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    scan.useLocale(new Locale("en"));
	    System.out.println("Wprowad� liczb� ca�kowit�:");
	    int i = scan.nextInt();
	    System.out.println("Wprowad� liczb� rzeczywist�:");
	    double d = scan.nextDouble();
	    System.out.println("Wprowadzono: " + i + " " + d);
	scan.close(); 
	}

}
