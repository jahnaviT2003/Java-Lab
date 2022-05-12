import java.util.*;
public class candidate_survey {
	String Candidate_name;
	String choice1,choice2,choice3,choice4;
public void get()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Candidate name:");
	Candidate_name=sc.next();
	System.out.println("Enter the choice as yes/no format...!!!");
	System.out.println("Do you like Reading?");
	choice1=sc.next();
	System.out.println("Do you like Watching Movie?");
	choice2=sc.next();
	System.out.println("Do you like Dancing?");
	choice3=sc.next();
	System.out.println("Do you like playing Sports/Games?");
	choice4=sc.next();
	
}
public void display1()
{ 
	if(choice1.equals("yes") && choice4.equals("yes")) 
	{
		System.out.println(Candidate_name);
	}
	
}
public void display2()
{
 if(choice1.equals("yes") && choice2.equals("yes"))
{
	System.out.println(Candidate_name);
}
}
public void display3()
{
if(choice2.equals("yes") && choice1.equals("no") && choice3.equals("no") && choice4.equals("no"))
{
	System.out.println(Candidate_name);
}
}
public static void main(String[] args)
{
	candidate_survey ob[]=new candidate_survey[100];
	for (int i=0;i<5;i++)
	{
		ob[i]=new candidate_survey();
		ob[i].get();
	}
	System.out.println("Students who likes to read books and play sports are:");
	for (int i=0;i<5;i++)
	{
		ob[i].display1();
	}
	System.out.println("Students who likes to read books and watch movie are:");
	for (int i=0;i<5;i++)
	{
		ob[i].display2();
	}
	System.out.println("Students who like watching movies only are:");
	for (int i=0;i<5;i++)
	{
		ob[i].display3();
	}
}
}


