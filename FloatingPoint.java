class FloatingPoint{
   public static void main(String[] args){
	   
	   System.out.println(1-0.9);    //0.09999999999999998
	   
	   float price=1000;
	   float discountPercent = 0.9;
	   float discountAmount = price * discountPercent;
	   System.out.println(price-discountAmount);
	   System.out.println(price * (1 - discountAmount));
	   //float and double doesn't gives us exat answer so we move with BigDecimal for getting exact answer.
   }
}
   