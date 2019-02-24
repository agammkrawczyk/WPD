package rozdz6Iteracje;

public class Account {
	 private double balance;          // stan konta
	  private double monthIncome;      // sta³e miesiêczne wp³ywy (dochód)
	  private double monthExpend;      // sta³e miesiêczne wydatki
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

	  // Metoda - zwraca liczbê miesiêcy potrzebnych
	  // by stan konta osi¹gn¹³ wartoœæ targetBalance

	   public int getMonthsToBalance(double targetBalance) {

	    int n = 0;                                // miesi¹ce
	    double diff = targetBalance - balance;    // ró¿nica miêdzy aktualnym
	                                              // i docelowym stanem
	    while (diff > 0) {         // dopóki jest TA ró¿nica -
	                               // symulujemy up³yw miesiêcy i zmiany konta
	      n++;
	      balance *= (1 + (interest/100)/12);     // doliczenie odsetek
	      balance += monthIncome - monthExpend;   // dochody, wydatki
	      double prevDiff = diff;                 // poprzednia ró¿nica
	      diff = targetBalance - balance;         // bie¿¹ca ró¿nica
	      if (prevDiff <= diff) return -1;        // je¿eli ró¿nica siê
	    }                                         // nie zmniejsza - nie ma szans
	    return n;                                 // osiagniêcia docelowego stanu
	  }


	}

