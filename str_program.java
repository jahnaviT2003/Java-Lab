import java.util.*;
public class str_program {
	public static void main(String args[])
    {
		String str_name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String name : ");
		str_name=sc.next();
        String a = "sha";
        String b = "na na";
        
        //CONCATENATION AT THE BEGINNING OF THE STRING
        String str2 = a + str_name;
        String str3 = str2 + b;
        
        System.out.println("Variation-1 : "+str3);
        
        str_name = str_name.substring(1) + str_name.charAt(0);
        String str4 = str_name + "ava";
        
        System.out.println("Variation-2 : "+str4);

    }

}
