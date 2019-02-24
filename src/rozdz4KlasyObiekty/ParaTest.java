package rozdz4KlasyObiekty;

public class ParaTest {
	public static void main(String[] args) {
	    Para para1 = new Para(2, 2);
	    Para para2 = new Para(1, 4);
	    para1.show("Para 1 =");
	    para2.show("Para 2 =");
	    Para para3= new Para(4,4);
	    Para para4= new Para (2,2);
	    para3.show("Para 3= ");
	    para4.show("Para4= ");
	    
	    
	    Para sumaPar = para1.add(para2);
	    sumaPar.show("Suma par =");
	    para1.set(para2);
	    para1.show("Teraz para 1 = ");
	    
	    Para paraSub = new Para();
	    paraSub= paraSub.substract(para4,para3);
	    paraSub.show("Ró¿nica par=");
	    
	    Para paraDivison= new Para();
	    paraDivison=paraDivison.division(para3, para4);
	    paraDivison.show("Dzielenie par =");
	    
	    Para paraMulit= new Para();
	    paraMulit=paraMulit.multiplication(para3, para4);
	    paraMulit.show("mno¿enie par =");
	    
	    
	    
	  }

}
