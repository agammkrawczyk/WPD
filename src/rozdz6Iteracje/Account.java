package rozdz6Iteracje;

public class Account {
	 private double balance;          // stan konta
	  private double monthIncome;      // sta�e miesi�czne wp�ywy (doch�d)
	  private double monthExpend;      // sta�e miesi�czne wydatki
	  private double interest;         // stopa oprocentowania (roczna)

	  // Konstruktor

	  public Account(double s, double wpl, double wypl, double p) {
	    balance = s;
	    monthIncome = wpl;
	    monthExpend = wypl;
	    interest = p;
	  }

	  // Metoda - zwraca aktualny stan konta

	  public double getBalance() {
	    return balance;
	  }

	  // Metoda - zwraca liczb� miesi�cy potrzebnych
	  // by stan konta osi�gn�� warto�� targetBalance

	   public int getMonthsToBalance(double targetBalance) {

	    int n = 0;                                // miesi�ce
	    double diff = targetBalance - balance;    // r�nica mi�dzy aktualnym
	                                              // i docelowym stanem
	    while (diff > 0) {         // dop�ki jest TA r�nica -
	                               // symulujemy up�yw miesi�cy i zmiany konta
	      n++;
	      balance *= (1 + (interest/100)/12);     // doliczenie odsetek
	      balance += monthIncome - monthExpend;   // dochody, wydatki
	      double prevDiff = diff;                 // poprzednia r�nica
	      diff = targetBalance - balance;         // bie��ca r�nica
	      if (prevDiff <= diff) return -1;        // je�eli r�nica si�
	    }                                         // nie zmniejsza - nie ma szans
	    return n;                                 // osiagni�cia docelowego stanu
	  }


	}

