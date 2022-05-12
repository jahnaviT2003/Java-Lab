import java.util.*;
public class emp_dinner {
	String emp_name;
	int starter,main_course,dessert;
	int emp_no,n;

public void get()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee name:");
	emp_name=sc.next();
	System.out.println("Enter the Employee num:");
	emp_no=sc.nextInt();
    System.out.println("Choice 1 : Starter_Paneer tikka");
    System.out.println("Choice 2 : Starter_Bread roll recipe");
    System.out.println("Choice 3 : Starter_Veg spring rolls");
    starter=sc.nextInt();
    System.out.println("Choice 1 : Main-Course_chicken biryani");
    System.out.println("Choice 2 : Main-Course_Pizza");
    System.out.println("Choice 3 : Main-Course_Palak paneer");
    main_course=sc.nextInt();
    System.out.println("Choice 1 : Dessert_Apple pie");
    System.out.println("Choice 2 : Dessert_Black forest");
    System.out.println("Choice 3 : Dessert_Icecream");
    dessert=sc.nextInt();
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter the no of employees:");
	n=sc.nextInt();
	emp_dinner ob[]=new emp_dinner[100];
	for (int i=0;i<n;i++)
	{
		ob[i]=new emp_dinner();
		ob[i].get();
	}
	int c1=0,c2=0,c3=0;
	for (int i=0;i<n;i++)
	{
	   if (ob[i].starter==1)
		   c1++;
	   else if(ob[i].starter==2)
		   c2++;
	   else
	   		c3++;
	}
	if (c1>c2&&c1>c3)
		System.out.println("Majority of employees likes to order a Starter:Paneer tikka");
	else if (c2>c3&&c2>c1)
		System.out.println("Majority of employees likes to order a Starter:Bread roll recipe");
	else
		System.out.println("Majority of employees likes to order a Starter:Veg spring rolls");
	for (int i=0;i<n;i++)
	{
	   if (ob[i].main_course==1)
		   c1++;
	   else if(ob[i].main_course==2)
		   c2++;
	   else
	   		c3++;
	}
	if (c1>c2&&c1>c3)
		System.out.println("Majority of employees likes to order a Main-Course:chicken biryani");
	else if(c2>c3&&c2>c1)
		System.out.println("Majority of employees likes to order a Main-Course:Pizza");
	else
		System.out.println("Majority of employees likes to order a Main-Course:Palak paneer");
	for (int i=0;i<n;i++)
	{
	   if (ob[i].dessert==1)
		   c1++;
	   else if(ob[i].dessert==2)
		   c2++;
	   else
	   		c3++;
	}
	if (c1>c2&&c1>c3)
		System.out.println("Majority of employees likes to order a Dessert:Apple pie");
	else if (c2>c3&&c2>c1)
		System.out.println("Majority of employees likes to order a Dessert:Black forest");
	else
		System.out.println("Majority of employees likes to order a Dessert:Icecream");
}
}
