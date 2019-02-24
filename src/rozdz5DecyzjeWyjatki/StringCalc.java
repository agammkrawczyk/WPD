package rozdz5DecyzjeWyjatki;
import javax.swing.*;
public class StringCalc {
	public String sum(String s1, String s2) {
	    int sum = 0,
	        sumLen = 0;
	    try {
	      sum = Integer.parseInt(s1) + Integer.parseInt(s2);
	      sumLen = s1.length() + s2.length();
	    } catch(NullPointerException exc) {
	        return "Któryœ z napisów jest null";
	    } catch (NumberFormatException exc) {
	        return "Któryœ z napisów nie jest liczb¹";
	    } catch (Exception exc) {
	        return "Wyst¹pi³ jakis b³¹d";
	    } finally {
	        JOptionPane.showMessageDialog(null, "Jestem finally!");
	    }
	    return "Suma: " + sum + '\n' + "Suma d³ugoœci: " + sumLen;
	  }

	  public static void main(String[] args) {
	    String s1 = JOptionPane.showInputDialog("Podaj pierwsz¹ liczbê");
	    String s2 = JOptionPane.showInputDialog("Podaj drug¹ liczbê");
	    StringCalc calc = new StringCalc();
	    JOptionPane.showMessageDialog(null, calc.sum(s1, s2));
	  }
	  
}
