import java.util.*;
public class service{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the no of Customers : ");
		n=sc.nextInt();
		service ob[]=new service[100];
		for (int i=0;i<n;i++)
		{
			service_S s = new service_S();
			s.service_details();
			s.bill_amt();
            s.display_customer_history();
            s.service_req();
		}
		
	}
}
class service_S {
	int service_reqno;
	String customer_name,AMC_details,service_type;
	int date,month,year;
	public void service_details()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("____Enter Service Request Details____");
		System.out.println("Enter the service request number : ");
		service_reqno=sc.nextInt();
		System.out.println("Enter the customer name : ");
		customer_name=sc.next();
		System.out.println("Enter AMC details Y/N : ");
		AMC_details=sc.next();
		System.out.println("Enter type of service u want : ");
		System.out.println("GS for general service"+"\n"+"PR for parts replacement");
		service_type=sc.next();
		System.out.println("Enter the date : ");
		date=sc.nextInt();
		System.out.println("Enter the month : ");
		month=sc.nextInt();
		System.out.println("Enter the year : ");
		year=sc.nextInt();
	}
	public void bill_amt()
	{
		if(AMC_details.equals("Y"))
		{
			if(service_type.equals("GS"))
				System.out.println("Bill amount is 0");
			else if(service_type.equals("PR"))
				System.out.println("Bill amount is 1000");
		}
		else if(AMC_details.equals("N"))
		{
			if(service_type.equals("GS"))
				System.out.println("Bill amount is 500");
			else if(service_type.equals("PR"))
				System.out.println("Bill amount is 2000");
		}
	}
	public void display_customer_history()
	{
		System.out.println("___Display Customer Details___");
		System.out.println("Service Request number : "+service_reqno+"\n"+"Customer name : "+customer_name+"\n"+"Service Type : "+service_type+"\n");
		System.out.println("Date of Birth : ");
		System.out.println(date+"/"+month+"/"+year);
		bill_amt();
	}
	public void service_req()
	{
		int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0,c11=0,c12=0;
		if(month==1)
			c1++;
		else if(month==2)
			c2++;
		else if(month==3)
			c3++;
		else if(month==4)
			c4++;
		else if(month==5)
			c5++;
		else if(month==6)
			c6++;
		else if(month==7)
			c7++;
		else if(month==8)
			c8++;
		else if(month==9)
			c9++;
		else if(month==10)
			c10++;
		else if(month==11)
			c11++;
		else if(month==12)
			c12++;	
		System.out.println("Request raised according to monthly order : "+c1+"\t"+c2+"\t"+c3+"\t"+c4+"\t"+c5+"\t"+c6+"\t"+c7+"\t"+c8+"\t"+c9+"\t"+c10+"\t"+c11+"\t"+c12+"\t");
		
	}

}
