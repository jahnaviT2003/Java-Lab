import java.util.*;
public class electricity_bill{
	int current_units,previous_units,diff;
	String Customer_name,Customer_ID;
	double amount;
public  void get()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of units used in current month:");
	current_units=sc.nextInt();
	System.out.println("Enter the no of units used in previous month:");
	previous_units=sc.nextInt();
	System.out.println("Enter the name of the customer:");
	Customer_name=sc.next();
	System.out.println("Enter the Customer ID:");
	Customer_ID=sc.next();
}
public void display()
{
	diff=(current_units-previous_units);
	if (diff<=100) {
		System.out.println("Name of the customer:"+Customer_name+"\n"+"Customer ID:"
	+Customer_ID+"\n"+"Extra units used:"+diff+"\n"+"Amount to be paid:"+amount);
	}
    if(diff>500)
	{
		System.out.println("Name of the customer:"+Customer_name+"\n"+"Customer ID:"
	+Customer_ID+"\n"+"Extra units used:"+diff+"\n"+"Amount to be paid:"+amount);
	}
	
}
public void calc()
{
		int diff=(current_units-previous_units);
		if (diff<=100) {
			 amount= 0;
		}
		else if(diff>100 && diff<=200) {
			 amount = 1.5*(diff);
		}
		else if(diff>200 && diff<=500) {
			 amount= 3*(diff);
		}
		else {
			 amount= 6.6*(diff);
		}
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter the no of customers:");
	n=sc.nextInt();
	electricity_bill ob[]=new electricity_bill[20];
	for (int i=0;i<n;i++)
	{
		ob[i]=new electricity_bill();
		ob[i].get();
	}
	System.out.println("Display the customer details who used less than 100 units and greater than 500 units..!!!");
	for(int i=0;i<n;i++) {
		ob[i].calc();
		ob[i].display();
	}
}
	
}



