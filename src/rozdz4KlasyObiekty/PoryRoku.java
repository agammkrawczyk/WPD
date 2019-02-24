package rozdz4KlasyObiekty;
import javax.swing.*;
public class PoryRoku {

	  enum Pora { ZIMA, WIOSNA, LATO, JESIEÑ };
	  
	  public static String opisz(Pora p) {
	    
	    if (p == Pora.ZIMA) return p + " - pada œnieg.";
	    if (p == Pora.WIOSNA) return p + " - kwitnie bez.";
	    if (p == Pora.LATO) return p + " - jest ciep³o.";
	    if (p == Pora.JESIEÑ) return p + " - pada deszcz.";
	    return "Pora roku nie zosta³a wybrana";
	  }
	  
	  public static void main(String[] args) {
	    
	    String nazwa = JOptionPane.showInputDialog("Podaj porê roku:");
	    Pora p = Pora.valueOf(nazwa);
	    JOptionPane.showMessageDialog(null, opisz(p) );
	  }
}
