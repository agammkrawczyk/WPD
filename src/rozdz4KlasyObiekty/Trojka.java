package rozdz4KlasyObiekty;
import java.util.*;
import javax.swing.*;
public class Trojka {

	 private double a, b, c;

	 public Trojka(double x, double y, double z) {
	   a = x;
	   b = y;
	   c = z;
	 }

	 public double sum() {
	   return a + b + c;
	 }

	 public double average() {
	   return (a + b + c)/3;
	 }

	 public void increase() {
	   a++;
	   b++;
	   c++;
	 }

	 public void report() {
	    System.out.println("Suma " + sum());
	    System.out.println("Srednia " + average());
	  }

public String toString() {
	  return"("+a+","+b+","+c+")";
	  }
	  public static void main(String[] args) {
	 
	    
		  String in = JOptionPane.showInputDialog("Podaj trzy liczby ca³koitew rozdzielone spacjami");
		    if (in != null) {
		      Scanner scan = new Scanner(in);
		      if (scan.hasNextInt()) {
		        int n1 = scan.nextInt();
		        if (scan.hasNextInt()) {
		          int n2 = scan.nextInt();
		          if (scan.hasNextInt()){
		        	  int n3=scan.nextInt();
		        	  scan.close();
		  
		        	  Trojka trojka= new Trojka(n1,n2,n3);
		          JOptionPane.showMessageDialog(null, "Liczby: "+  trojka);
		          JOptionPane.showMessageDialog(null, "SUMA: "+ trojka.sum());
		          JOptionPane.showMessageDialog(null, "Œrednia: "+ trojka.average());
		          }
		      } scan.close();
		      
	  } 
		    }
	  
	  }
}
