import java.util.*;
abstract class Customer {
    abstract void getCustomer();
    abstract void setCustomer();
    void m1()
    {
    	int customer_ID,customer_age;
    	String Customer_name,Customer_gender;
    	double bank_balance;
    	Scanner sc = new Scanner (System.in);
    	customer_ID=sc.nextInt();
    	customer_age=sc.nextInt();
    	Customer_name=sc.next();
    	Customer_gender=sc.next();
    	bank_balance=sc.nextDouble();
    	}
}
interface LoanInterface{  

     public void getLoan();
     public void setLoan();
}  
public class CustomerLoan
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		String loantype;
		System.out.println("Enter the loan type : ");
		loantype=sc.next();
		int loanamt;
		System.out.println("Enter the loanamt : ");
		loanamt=sc.nextInt();
		
	}
}