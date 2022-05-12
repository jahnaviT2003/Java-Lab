import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ticket_booking
{
	int ticket1_price=450,ticket2_price=300,ticket3_price=200,ticket4_price=630;
	int ticket_choice,insert_amt;
	
	public void get_ticket_choice()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ticket choice type:");
		ticket_choice=sc.nextInt();
	}
	public void get_ticket_price() {
		if(ticket_choice==1)
		{
			System.out.println("The price of the choosen ticket is Rs.450");
		}
		else if(ticket_choice==2)
		{
			System.out.println("The price of the choosen ticket is Rs.300");
		}
		else if(ticket_choice==3)
		{
			System.out.println("The price of the choosen ticket is Rs.200");
		}
		else if(ticket_choice==4)
		{
			System.out.println("The price of the choosen ticket is Rs.630");
		}
	}
	public void insert_money()
	{
		System.out.println("Enter the amount to be inserted by you:");
		Scanner sc=new Scanner(System.in);
		insert_amt=sc.nextInt();
		if(ticket_choice==1)
		{
			int bal_amt=0;
			if(insert_amt<ticket1_price)
			{
				System.out.println("Insufficient amount :(");
				System.out.println("Enter the correct amount again:");
				insert_amt=sc.nextInt();
				if(insert_amt<ticket1_price)
				{
					System.out.println("Transaction timed out..!!");
				}
				else if(insert_amt==ticket1_price)
				{
					System.out.println("Payment successful..!!"+"\n"+"Your ticket is generated with 0 balance amount");
				}
				else if(insert_amt>ticket1_price)
				{
					bal_amt=insert_amt-ticket1_price;
					System.out.println("Your balance amount is:"+bal_amt);
				}
			}
			else if(insert_amt==ticket1_price)
			{
				System.out.println("Payment successful..!!"+"\n"+"Your ticket is generated with 0 balance amount");
			}
			else if(insert_amt>ticket1_price)
			{
				bal_amt=insert_amt-ticket1_price;
				System.out.println("Your balance amount is:"+bal_amt);
			}
		}
		if(ticket_choice==2)
		{
			int bal_amt=0;
			if(insert_amt<ticket2_price)
			{
				System.out.println("Insufficient amount :(");
				System.out.println("Enter the correct amount again:");
				insert_amt=sc.nextInt();
				if(insert_amt<ticket2_price)
				{
					System.out.println("Transaction timed out..!!");
				}
				else if(insert_amt==ticket2_price)
				{
					System.out.println("Payment successful..!!"+"\n"+"Your ticket is generated with 0 balance amount");
				}
				else if(insert_amt>ticket2_price)
				{
					bal_amt=insert_amt-ticket2_price;
					System.out.println("Your balance amount is:"+bal_amt);
				}
			}
			else if(insert_amt==ticket2_price)
			{
				System.out.println("Payment successful..!!"+"\n"+"Your ticket is generated with 0 balance amount");
			}
			else if(insert_amt>ticket2_price)
			{
				bal_amt=insert_amt-ticket2_price;
				System.out.println("Your balance amount is:"+bal_amt);
			}
		}
		if(ticket_choice==3)
		{
			int bal_amt=0;
			if(insert_amt<ticket3_price)
			{
				System.out.println("Insufficient amount :(");
				System.out.println("Enter the correct amount again:");
				insert_amt=sc.nextInt();
				if(insert_amt<ticket3_price)
				{
					System.out.println("Transaction timed out..!!");
				}
				else if(insert_amt==ticket3_price)
				{
					System.out.println("Payment successful..!!"+"\n"+"Your ticket is generated with 0 balance amount");
				}
				else if(insert_amt>ticket3_price)
				{
					bal_amt=insert_amt-ticket3_price;
					System.out.println("Your balance amount is:"+bal_amt);
				}
			}
			else if(insert_amt==ticket3_price)
			{
				System.out.println("Payment successful..!!"+"\n"+"Your ticket is generated with 0 balance amount");
			}
			else if(insert_amt>ticket3_price)
			{
				bal_amt=insert_amt-ticket3_price;
				System.out.println("Your balance amount is:"+bal_amt);
			}
		}
		if(ticket_choice==4)
		{
			int bal_amt=0;
			if(insert_amt<ticket4_price)
			{
				System.out.println("Insufficient amount :(");
				System.out.println("Enter the correct amount again:");
				insert_amt=sc.nextInt();
				if(insert_amt<ticket4_price)
				{
					System.out.println("Transaction timed out..!!");
				}
				else if(insert_amt==ticket4_price)
				{
					System.out.println("Payment successful..!!"+"\n"+"Your ticket is generated with 0 balance amount");
				}
				else if(insert_amt>ticket4_price)
				{
					bal_amt=insert_amt-ticket4_price;
					System.out.println("Your balance amount is:"+bal_amt);
				}
			}
			else if(insert_amt==ticket4_price)
			{
				System.out.println("Payment successful..!!"+"\n"+"Your ticket is generated with 0 balance amount");
			}
			else if(insert_amt>ticket4_price)
			{
				bal_amt=insert_amt-ticket4_price;
				System.out.println("Your balance amount is:"+bal_amt);
			}
		}
		
	}
	public void get_details()
	{
		System.out.println("____TICKET DETAILS___");
		System.out.println("Ticket number choosen:"+ticket_choice);
		System.out.println("Inserted amount:"+insert_amt);
	}

	public static void main(String[] args)
	{
		ticket_booking ob[]=new ticket_booking[100];
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the no of tickets:");
		n=sc.nextInt();
		for (int i=0;i<n;i++)
		{
			ob[i]=new ticket_booking();
			ob[i].get_ticket_choice();
			ob[i].get_ticket_price();
			ob[i].insert_money();
			ob[i].get_details();
		}
	}
	
}

