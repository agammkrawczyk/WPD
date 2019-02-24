package rozdz7Tablice;

public class Tablica {
	 public static void main(String[] args) {
		    int[] a = {1, 2, 3, 4 };
		    System.out.println(a[0]);
		    System.out.println(a[3]);
		    System.out.println(a[2]);
		    System.out.println(a[1]);
		    System.out.println();
	 
	 int[] b = {1, 2, 3, 4 };
	    for (int i=3; i>=0; i--) System.out.print(b[i]);
	    System.out.println();
	  int[] c = {1, 2, 3, 4 };
	    for (int i=c.length-1; i>=0; i--) System.out.print(c[i]);
	    System.out.println();
	    int[] d = {1, 2, 3, 4 };
	    for (int i=0; i<d.length; i++) System.out.print(d[i]);
	  } 
	 
	 }
 

