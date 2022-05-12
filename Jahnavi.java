
import java.util.*;
public class Jahnavi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Customers:");
		int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Purchase p = new Purchase();
            p.salesByAgeGroup();
        }
        
	}
    
}

class Purchase
{
    public String custName,custGender;
    public int custAge,choice;
    public Scanner sc = new Scanner(System.in);
    public final String[] choices = {"Color pencil","Pen","Diary","Kettle","Toys","Umbrella","Socks",
                                "Coolers"};
    public Purchase()
    {
        getCustDetails();
        displayInventory();
        getChoice();
    }
    private void displayInventory()
    {
       for(int i=0;i<choices.length;i++)
       {
           System.out.println((i+1)+"."+choices[i]);
       }
    }
    private void getCustDetails()
    {
        custName = sc.nextLine();
        custGender = sc.next();
        custAge = sc.nextInt();
    }
    private void getChoice()
    {
        choice = sc.nextInt();
    }
    public void salesByAgeGroup()
    {
            String item = choices[choice-1];
            if(custGender.equalsIgnoreCase("male"))
            {
                if(custAge<=10 && item.equals("Toys"))
                {
                    System.out.println(custName+" likes "+"Toys");
                }
                else if(custAge>10 && custAge<=30 && item.equals("Umbrella"))
                {
                    System.out.println(custName+" likes "+"Umbrella");
                }
                else if(custAge>30 && custAge<=50 && item.equals("Coolers"))
                {
                    System.out.println(custName+" likes "+"Coolers");
                }
            }
            else
            {
                if(custAge<=10 && item.equals("Color pencils"))
                {
                    System.out.println(custName+" likes "+"Color pencils");
                }
                else if(custAge>10 && custAge<=30 && item.equals("Diary") || item.equals("Socks"))
                {
                    System.out.println(custName+" likes "+"Diarys or Socks");
                }
                else if(custAge>30 && custAge<=50 && item.equals("Pen") || item.equals("Kettle"))
                {
                    System.out.println(custName+" likes "+"Pens or Kettles");
                }
            }
        
    }
}