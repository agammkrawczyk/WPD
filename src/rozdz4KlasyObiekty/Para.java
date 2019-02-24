package rozdz4KlasyObiekty;

public class Para {
	public Para() {}
	
	 private int a;   // To s� "dane" (zwane polami klasy).
     // Okre�laj� one z jakich element�w sk�ada� si�
private int b;   // b�d� obiekty tej klasy.
     // a = pierwszy sk�adnik pary, b - drugi


public Para(int x, int y) { // konstruktor: nadaje warto�� parze
a = x ;                   // na podstawie przekazanych warto�ci x i y
b = y;
}


public void set(Para p) { // metoda ustalenia warto�ci pary
a = p.a;                // na podstawie sk�adnik�w przekazanej pary
b = p.b;
}


public Para add(Para p) { // metoda dodawania dw�ch par
Para wynik = new Para(a, b);
wynik.a += p.a;
wynik.b += p.b;
return wynik;
}

public Para substract(Para p,Para z) { // metoda odejmowania dw�ch par
	Para wynik= new Para(a,b);
	wynik.a = p.a-z.a;
	wynik.b =p.b- z.b;
	return wynik;
	
}
public  Para division(Para p, Para z) { // metoda dzielenia dw�ch par
	Para wynik= new Para(a,b);
	wynik.a=p.a/z.a;
	wynik.b= p.b/z.b;
return wynik;
}
public Para multiplication(Para p, Para z) { // metoda mnozenia dw�ch par
	Para wynik= new Para(a, b);
	wynik.a=p.a*z.a;
	wynik.b=p.b*z.b;
	return wynik;
}



// metoda pokazuj�ca par�
public void show(String s) {
System.out.println(s + " ( " + a + " , " + b + " )" );
}

}
