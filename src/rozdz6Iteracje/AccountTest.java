package rozdz6Iteracje;

public class AccountTest {
	public static void main(String[] args) {

	    Account ac = new Account(2000, 2400, 1800, 10);
	    double cel = 10000;
	    int m =  ac.getMonthsToBalance(cel);
	    System.out.println("Miesiace do osiagniecia co najmniej " + cel + ":");
	    System.out.println(m + " --- stan konta " + ac.getBalance());
	  }
}
