
public class CashRegister {
	public double TotalAmount;
	public int noOfTransactions;
	public static int regCount = 0;
	
	CashRegister(){
		TotalAmount = 0.0;
		noOfTransactions = 0;
		++regCount;
	}
	
	void AddTransaction(double amount){
		
		TotalAmount += amount;
		++noOfTransactions;
	}
	
	int TransactionCount() {
		return noOfTransactions;
	}
	
	double Total() {
		return TotalAmount;
	}
	
	void ResetTransactions() {
		TotalAmount = 0.0;
		noOfTransactions=0;
		
	}
	
	public static int RegisterCount(){
		return regCount;
	}
	
	public static void main(String args[]) {
		
		CashRegister cOne = new CashRegister();
		CashRegister cTwo = new CashRegister();
		CashRegister cThree = new CashRegister();
		
		cOne.AddTransaction(20.0);
		cOne.AddTransaction(40.0);
		cOne.AddTransaction(60.0);
		
		cTwo.AddTransaction(10.0);
		cTwo.AddTransaction(20.0);
		cTwo.AddTransaction(30.0);
		
		cThree.AddTransaction(30.0);
		cThree.AddTransaction(60.0);
		cThree.AddTransaction(90.0);
		cThree.AddTransaction(120.0);
		
		
		System.out.println("the cash register count is " + CashRegister.RegisterCount());
		
		System.out.println("the number of transaction on cash register one is " + cOne.TransactionCount());
		System.out.println("the number of transaction on cash register two is " + cTwo.TransactionCount());
		System.out.println("the number of transactions on cash register three is " + cThree.TransactionCount());
		
		System.out.println("the total cash in register one is " + cOne.Total());
		System.out.println("the total cash in register two is " + cTwo.Total());
		System.out.println("the total cash in register three is " + cThree.Total());
		
		cTwo.ResetTransactions();
		
		System.out.println("the total cash in register two is " + cTwo.Total());
		System.out.println("the number of transaction on cash register two is " + cTwo.TransactionCount());
	
	}

}
