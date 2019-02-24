package rozdz6Iteracje;
import java.util.*;

import java.io.*;
public class GetLines {
	 public static void main(String[] args) {
		    String fname = "tekst.txt";
		    Scanner scan = null;
		    try {
		      scan = new Scanner(new File(fname));
		    } catch (FileNotFoundException exc) {
		       System.out.println("Plik " + fname + " nie istnieje");;
		    }
		    int lcount = 0;
		    int strLength  = 0;
		    while (scan.hasNextLine()) {
		      String line = scan.nextLine();
		      lcount++;
		      strLength += line.length();
		    }
		    System.out.println("Liczba wierszy pliku: " + lcount + 
		                       "\nIch ³¹czna d³ugoœæ: " + strLength );
		  }

}
