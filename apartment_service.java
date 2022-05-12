import java.util.*;
public class apartment_service {
	String residence_name;
	int block_no,flat_no, due_amt,maintainance_amt,amt_paid;
	long mobile_number;
	public void get_resident_details()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Resident Details : ");
		System.out.println("Enter the Residence Name : ");
		residence_name=sc.next();
		System.out.println("Enter the Block number : ");
		block_no=sc.nextInt();
		System.out.println("Enter the Flat number : ");
		flat_no=sc.nextInt();
		System.out.println("Enter the Mobile number : ");
		mobile_number=sc.nextLong();
	}
	public void display1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maintainance amount : ");
		due_amt=sc.nextInt();
		System.out.println("\n"+"Residence Due Amount is : "+due_amt+"\n");
	}
	public void display2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount paid : ");
		amt_paid=sc.nextInt();
		System.out.println("Enter the maintainance amount : ");
		maintainance_amt=sc.nextInt();
		int due_amt=maintainance_amt-amt_paid;
		System.out.println("\n"+"Resident name is : "+residence_name+"\n"+"Residence flat number is : "+flat_no+"\n"+"Residence block number is : "+block_no+"\n"+"Residence mobile number is : "+mobile_number+"\n");
		System.out.println("Balance amount due is : "+due_amt+"\n");
	}
	public void calc()
	{
		int diff=amt_paid-maintainance_amt;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,choice;
		System.out.println("Enter the no of Residents : ");
		n=sc.nextInt();
		apartment_service ob[]=new apartment_service[100];	
		for (int i=0;i<n;i++) {
			System.out.println("Choice 1 : Display the due Amount");
		    System.out.println("Choice 2 : Pay the maintainance amount");
		    choice=sc.nextInt();
		    if(choice==1) {
		    	System.out.println("_____Display the choice 1 details:_____");
		    	ob[i]=new apartment_service();
		    	ob[i].get_resident_details();
		    	ob[i].display1();
		}
		    if (choice==2) {
		    	System.out.println("____Display the choice 2 details:____");
		    	ob[i]=new apartment_service();
		    	ob[i].get_resident_details();
		    	ob[i].display2();
		}
		}
		System.out.println("Thank You :)");
	}

}
