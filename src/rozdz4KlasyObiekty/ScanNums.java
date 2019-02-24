package rozdz4KlasyObiekty;
import java.util.*;
public class ScanNums {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    scan.useLocale(new Locale("en"));
	    System.out.println("Wprowad¿ liczbê ca³kowit¹:");
	    int i = scan.nextInt();
	    System.out.println("Wprowad¿ liczbê rzeczywist¹:");
	    double d = scan.nextDouble();
	    System.out.println("Wprowadzono: " + i + " " + d);
	scan.close(); 
	}

}
