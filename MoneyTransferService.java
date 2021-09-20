class MoneyTransferService{
	
	static double[] exchangeRates = {63.0 , 3.0 , 3.0 , 595.5, 18.0, 107.0,2.0};
	void setExchangeRates(double[] rates){
		exchangeRates = rates;
	}
	void updateExchangeRates(int arrayIndex, double newVal){
		exchangeRates[arrayIndex] = newVal;
	}
	double getExchangeRates(int arrayIndex){
		return exchangeRates[arrayIndex];
	}
	
	double computeTransferAmount(int arrayIndex, double amount){
		return amount * getExchangeRates(arrayIndex);
	}
	
	
	static void printCurrencies(){
		System.out.println("\nrupee: " + exchangeRates[0]);
		System.out.println("dirham: " + exchangeRates[1]);
		System.out.println("real: " + exchangeRates[2]);
		System.out.println("chilean_peaso: " + exchangeRates[3]);
		System.out.println("mexican_peaso: " + exchangeRates[4]);
		System.out.println("_yen: " + exchangeRates[5]);
		System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]);
	}
	
	public static void main(String[] args){
		MoneyTransferService mts = new MoneyTransferService();
		
		double[] rates = {63.0 , 3.0 , 3.0 , 595.5, 18.0, 107.0,2.0};
		mts.setExchangeRates(rates);
		mts.printCurrencies();
		
		rates =new double[] {63.0 , 5.0 , 3.0 , 595.5, 18.0, 107.0,2.0};
		mts.setExchangeRates(rates);
		mts.printCurrencies();
		
		mts.updateExchangeRates(0, 66.0);
		mts.printCurrencies();
		
		double amount = mts.computeTransferAmount(0, 1000);
		System.out.println("\nTransferred Amount:" + amount);
		
		
		
		
		
		
	}
}
