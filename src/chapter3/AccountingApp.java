package chapter3;

class Account {
	public double valueOfSupply;
	
	public static double vatRate = 0.1;
	
	public Account(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}


public class AccountingApp {
	
	public static void main(String[] args) {
		
		Account a1 = new Account(10000.0);
		Account a2 = new Account(20000.0);
		
		System.out.println("Value Of Supplay : " + a1.valueOfSupply);
		System.out.println("Value Of Supplay : " + a2.valueOfSupply);
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());
		
	}

}
