package rozdz4KlasyObiekty;
import javax.swing.*;
public class PoryRoku {

	  enum Pora { ZIMA, WIOSNA, LATO, JESIE� };
	  
	  public static String opisz(Pora p) {
	    
	    if (p == Pora.ZIMA) return p + " - pada �nieg.";
	    if (p == Pora.WIOSNA) return p + " - kwitnie bez.";
	    if (p == Pora.LATO) return p + " - jest ciep�o.";
	    if (p == Pora.JESIE�) return p + " - pada deszcz.";
	    return "Pora roku nie zosta�a wybrana";
	  }
	  
	  public static void main(String[] args) {
	    
	    String nazwa = JOptionPane.showInputDialog("Podaj por� roku:");
	    Pora p = Pora.valueOf(nazwa);
	    JOptionPane.showMessageDialog(null, opisz(p) );
	  }
}
