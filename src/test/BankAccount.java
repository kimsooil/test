/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance;
   
   

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
      
      
      
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
	  //assert initialBalance >=0;
	   if (initialBalance <0) throw new AssertionError();
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
  {  
	   //assert amount>=0;
	   if (amount <0) throw new AssertionError();
	    	double newBalance = balance + amount;
	        balance = newBalance;
	   
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
	   //assert amount<=balance;
	   if (amount > balance) throw new AssertionError();
		   double newBalance = balance - amount;
		      balance = newBalance;
	    
   }
   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
     
	   return balance;
   }
}