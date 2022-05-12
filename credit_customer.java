import java.util.*;
public class credit_customer {
	String customer_name,email_id;
	int expiry_date_month,expiry_date_year;
	long mobile_no,credit_card_no;
	int credit_limit;
	public void credit_card()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("____Enter the Credit Card Details____");
		System.out.println("Enter credit card no : ");
		credit_card_no=sc.nextLong();
		System.out.println("Enter the Customer name : ");
		customer_name=sc.next();
		System.out.println("Enter Mobile number : ");
		mobile_no=sc.nextLong();
		System.out.println("Enter expiry date month : ");
		expiry_date_month=sc.nextInt();
		System.out.println("Enter expiry date year : ");
		expiry_date_year=sc.nextInt();
		System.out.println("Expiry Date : "+expiry_date_month+"/"+expiry_date_year);
		System.out.println("Enter Customer Email-id : ");
		email_id=sc.next();
		System.out.println("Enter credit limit : ");
		credit_limit=sc.nextInt();
		credit_method();
	}
	public void credit_method()
	{
		if(expiry_date_year == 2021)
		{
			System.out.println("____Display Details____");
			System.out.println("Customer Name : "+customer_name+"\n"+"Email-Id : "+email_id);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the no of Customers : ");
		n=sc.nextInt();
		credit_customer ob[]=new credit_customer[100];
		for (int i=0;i<n;i++)
		{
			ob[i]=new credit_customer();
			ob[i].credit_card();
		}
		
	}

}
