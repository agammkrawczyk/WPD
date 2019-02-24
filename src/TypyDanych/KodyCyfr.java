package TypyDanych;

public class KodyCyfr {
public static void main(String args[]) {
	int kod=15;
	char c =(char) kod;
	for(int i=1;i<11;i++) {
		System.out.println("KOd cyfry "+kod+ " to "+ c);
kod++;
c++;
	}
	
}
}
