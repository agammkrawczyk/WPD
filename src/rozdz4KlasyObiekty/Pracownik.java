package rozdz4KlasyObiekty;

public class Pracownik {
String imie;
String nazwisko;
int pensja;
public Pracownik(String imie, String nazwisko,int pensja) {
	this.imie=imie;
	this.nazwisko=nazwisko;
	this.pensja=pensja;
	
}
public int podwyzka() {
	pensja=pensja+ 100;
	return pensja;
}

public int podwyzkaMax() {
	pensja=pensja*2;
	return pensja;
}
public String toString() {
	return  imie + " "+ nazwisko+ " "+ " "+ pensja+ "zL ";
}
}
