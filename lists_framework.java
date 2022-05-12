import java.util.*;

public class lists_framework {
 
 static List<String> account_No = new ArrayList<String>();
 static List<String> account_type = new ArrayList<String>();
 static List<String> name = new ArrayList<String>();
 static List<Double> account_balance = new ArrayList<Double>();
 
 public void getData()
 {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter account number: ");
 String acn = sc.next();
 account_No.add(acn);
 
 System.out.print("Enter type of account: ");
 String t = sc.next();
 account_type.add(t);
 
 System.out.print("Enter Name: ");
 String Name = sc.next();
 name.add(Name);
 
 System.out.print("Enter balance amount: ");
 Double bal = sc.nextDouble();
 account_balance.add(bal);
 }
 public void less_Balance(int n)
 {
 for(int i=0;i<n;i++)
 {
 if(account_balance.get(i) < 1000.00)
 { 
 System.out.println("Name : "+name.get(i)+"\n"+"Account Number : "+account_No.get(i));
 System.out.println("Type : "+account_type.get(i)+"\n"+"Balance : "+account_balance.get(i));
 System.out.println("");
 }
 }
 }
 public int checkVowel(String s)
 {
 int flag = 0;
 if((s.charAt(0) == 'A')||(s.charAt(0) == 'E')||(s.charAt(0) == 'I')||(s.charAt(0) == 'O')||(s.charAt(0) == 'U'))
 {
 flag = 1;
 }
 return flag;
 }
 public void vowelName(int n)
 {
 for(int i=0;i<n;i++)
 {
 if(checkVowel(name.get(i)) == 1)
 { 
 System.out.println("Name : "+name.get(i)+"\n"+"Account Number : "+account_No.get(i));
 System.out.println("Type : "+account_type.get(i)+"\n"+"Balance : "+account_balance.get(i));
 System.out.println("");
 }
 }
 }
 public void withCurrent(int n)
 {
 for(int i=0;i<n;i++)
 {
 if(account_type.get(i).equals("current"))
 {
 System.out.println("Name : "+name.get(i)+"\n"+"Account Number : "+account_No.get(i));
 System.out.println("Type : "+account_type.get(i)+"\n"+"Balance : "+account_balance.get(i));
 System.out.println("");
 }
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number of customers");
 int n = sc.nextInt();
 lists_framework customers[] = new lists_framework[n];
 for(int i=0;i<n;i++)
 {
 System.out.println("");
 System.out.println("Enter details for customer "+(i+1)+":");
 customers[i] = new lists_framework();
 customers[i].getData();
 }
 System.out.println("");
 lists_framework b = new lists_framework();
 
 System.out.println("Customers with balance less than 1000:");
 b.less_Balance(n);
 System.out.println("");
 System.out.println("Customers names start with a vowel:");
 b.vowelName(n);
 System.out.println(""); 
 System.out.println("Customers holding current account:");
 b.withCurrent(n);
 System.out.println("");
 } 
}