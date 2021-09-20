import java.util.*;
class CurrencyConverter{
int rupee=63;
int dirham=3;
int real=3;

int chilean_peso=595;
int _yen=107;
int mexican_peso=18;
int dollar;
int Rupee=63;


 public void printCurrencies(){
    System.out.println("rupee:" + rupee);
	System.out.println("dihram:" + dirham);
	System.out.println("real:" + real);
	System.out.println("chilean_peso:" + chilean_peso);
	System.out.println("_yen:" + _yen);
    System.out.println("mexican_peso:" + mexican_peso);
	//System.out.println("$australian:" + $australian);
	System.out.println("dollar:" + dollar);
	System.out.println("Rupee:" + Rupee);
}
	
   public static void main(String[] args){
       CurrencyConverter cc = new CurrencyConverter();
	   cc.printCurrencies();
}
}
		
		
		
		
