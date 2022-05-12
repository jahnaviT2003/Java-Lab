import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_2 {
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		char[] data =new char[100];
		try
		{
			File f =new File("All_Students.txt");
			File f1=new File("Even_names.txt");
			File f2=new File("Odd_names.txt");
			FileWriter fw =new FileWriter("All_Students.txt");
			FileWriter fw_1=new FileWriter("Even_names.txt");
			FileWriter fw_2=new FileWriter("Odd_names.txt");
			System.out.println("Enter the number of names : ");
			int n=sc.nextInt();
			String student_name;
			int count_1=0,count_2=0;
			System.out.println("Enter the Students Names : ");
			for(int i=0;i<n;i++)
			{
				student_name=sc.next();
				fw.write(student_name);
				fw.write("\n");
				if(student_name.length()%2==0)
				{
					fw_1.write(student_name);
					fw_1.write("\n");
					count_1++;
				}
				else
				{
					fw_2.write(student_name);
					fw_2.write("\n");
					count_2++;
				}
			}
			fw.close();
			fw_1.close();
			fw_2.close();
			FileReader fr = new FileReader("All_Students.txt");
			FileReader fr_1=new FileReader("Even_names.txt");
	        FileReader fr_2=new FileReader("Odd_names.txt");
	        BufferedReader br=new BufferedReader(fr);
	        BufferedReader br_1=new BufferedReader(fr_1);
	        BufferedReader br_2=new BufferedReader(fr_2);
	        
	        System.out.println("Display EVEN House Student Names");
	        FileReader fr1=new FileReader("Even_names.txt");
	        fr1.read(data);
	        System.out.println(data);
	        System.out.println("Number of Students in the EVEN house : "+count_1);
	        fr1.close();

	        System.out.println("\n"+"Display ODD House Student Names");
	        FileReader fr2=new FileReader("Odd_names.txt");
	        fr2.read(data);
	        System.out.println(data);
	        System.out.println("Number of Students in the ODD house : "+count_2);
	        fr2.close();
	    }catch(FileNotFoundException e)
	    {
	        
	        System.out.println("The specified file does not exist...");
	         
	    }
			
	}
}
		
		


