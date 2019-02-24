package TypyDanych;

public class Klocki {
public static void main(String[] args) {

int iloscPojemnik;
int s ;
int iloscKlockow; 
 
iloscKlockow=101;
 s=20;


if (iloscKlockow%s==0) {
	iloscPojemnik= iloscKlockow/s;
	}
else {
	iloscPojemnik= iloscKlockow/s +1;
	
}
System.out.print("Ilos potrzebnych pojemników "+ iloscPojemnik);
}
}