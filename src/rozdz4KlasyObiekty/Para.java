package rozdz4KlasyObiekty;

public class Para {
	public Para() {}
	
	 private int a;   // To s¹ "dane" (zwane polami klasy).
     // Okreœlaj¹ one z jakich elementów sk³adaæ siê
private int b;   // bêd¹ obiekty tej klasy.
     // a = pierwszy sk³adnik pary, b - drugi


public Para(int x, int y) { // konstruktor: nadaje wartoœæ parze
a = x ;                   // na podstawie przekazanych wartoœci x i y
b = y;
}


public void set(Para p) { // metoda ustalenia wartoœci pary
a = p.a;                // na podstawie sk³adników przekazanej pary
b = p.b;
}


public Para add(Para p) { // metoda dodawania dwóch par
Para wynik = new Para(a, b);
wynik.a += p.a;
wynik.b += p.b;
return wynik;
}

public Para substract(Para p,Para z) { // metoda odejmowania dwóch par
	Para wynik= new Para(a,b);
	wynik.a = p.a-z.a;
	wynik.b =p.b- z.b;
	return wynik;
	
}
public  Para division(Para p, Para z) { // metoda dzielenia dwóch par
	Para wynik= new Para(a,b);
	wynik.a=p.a/z.a;
	wynik.b= p.b/z.b;
return wynik;
}
public Para multiplication(Para p, Para z) { // metoda mnozenia dwóch par
	Para wynik= new Para(a, b);
	wynik.a=p.a*z.a;
	wynik.b=p.b*z.b;
	return wynik;
}



// metoda pokazuj¹ca parê
public void show(String s) {
System.out.println(s + " ( " + a + " , " + b + " )" );
}

}
