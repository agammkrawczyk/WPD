package rozdz4KlasyObiekty;
import java.util.*;
import javax.swing.*;
public class ScanNumsFromString {
	 public static void main(String[] args) {
		    String in = JOptionPane.showInputDialog("Podaj dwie liczby ca³koitew rozdzielone spacjami");
		    if (in != null) {
		      Scanner scan = new Scanner(in);
		      if (scan.hasNextInt()) {
		        int n1 = scan.nextInt();
		        if (scan.hasNextInt()) {
		          int n2 = scan.nextInt();
		          JOptionPane.showMessageDialog(null, "Suma: "+  (n1 + n2));
		        }
		      }
		      scan.close();
		    }
		  }
}
