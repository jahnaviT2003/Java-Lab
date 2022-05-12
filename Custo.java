import java.util.*;
public class Custo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String gender[] = new String[10];
		String name[] = new String[10];
		int age[] = new int[10];
		int choice[] = new int[10];
		System.out.println("Enter the no of Customers:");
		int n=sc.nextInt();
		System.out.println("1.color pencil");
		System.out.println("2.pen");
		System.out.println("3.diary");
		System.out.println("4.kettle");
		System.out.println("5.toys");
		System.out.println("6.umbrella");
		System.out.println("7.socks");
		System.out.println("8.coolers");
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the customer:");
			name[i]=sc.next();
			System.out.println("Enter the age of the customer:");
			age[i]=sc.nextInt();
			System.out.println("Enter the gender of the customer:");
			gender[i]=sc.next();
			System.out.println("Enter your Item choice:");
			choice[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			if (age[i]<=10 && gender[i]=="female")
				System.out.println("Customer like colour pencils"+"Name of the customer:"+name[i]+"Choice of the item:"+choice[i]);
		}
		for (int i=0;i<n;i++) 
		{
			if(age[i]<=10 && gender[i]=="male")
				System.out.println("Customer like toys"+"Name of the customer:"+name[i]+"Choice of the item:"+choice[i]);
		}
		for (int i=0;i<n;i++)
		{
			if(age[i]>10 && age[i]<=30 && gender[i]=="female")
				System.out.println("Customer like diary,socks"+"Name of the customer"+name[i]+"Choice of the item:"+choice[i]);
		}
		for (int i=0;i<n;i++)
		{
		 if(age[i]>10 && age[i]<=30 && gender[i]=="male")
				System.out.println("Customer like umbrella"+"Name of the customer"+name[i]+"Choice of the item:"+choice[i]);
		}
		for (int i=0;i<n;i++)
		{
			if(age[i]>30 && age[i]<=50 && gender[i]=="female")
				System.out.println("Customer like pen,kettle"+"Name of the customer"+name[i]+"Choice of the item:"+choice[i]);
		}
		for (int i=0;i<n;i++)
		{
			 if(age[i]>30 && age[i]<=50 && gender[i]=="male")
				System.out.println("Customer like coolers"+"Name of the customer"+name[i]+"Choice of the item:"+choice[i]);
		}
	}
}
	

