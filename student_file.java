import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
public class student_file {
	static int yr=0;
    static int schl=0;
    static int num=0;
    static int lgt=0;
	static String student_reg_no;
    static String student_name;
    static String student_school;
    public static  void chk_reg(String student_reg_no,String student_school)
    {
        char [] reg_arr = student_reg_no.toCharArray();
        if(reg_arr.length==9)
        {
            lgt=1;
        }
        if(reg_arr[0]=='2'&& reg_arr[1]=='0')
        {
            yr=1;
        }
        if(student_school.equals("SCOPE"))
        {
            if(reg_arr[2]=='B'&&reg_arr[3]=='A'&&reg_arr[4]=='I')
            {
                schl=1;
            }
            else if(reg_arr[2]=='B'&&reg_arr[3]=='C'&&reg_arr[4]=='E')
            {
            	schl=1;
            }
            else if(reg_arr[2]=='B'&&reg_arr[3]=='R'&&reg_arr[4]=='S')
            {
            	schl=1;
            }
        }
        else if(student_school.equals("SELECT"))
        {
            if(reg_arr[2]=='B'&&reg_arr[3]=='E'&&reg_arr[4]=='E')
            {
                schl=1;
            }
        }
        else if(student_school.equals("SENSE"))
        {
        	if(reg_arr[2]=='B'&&reg_arr[3]=='E'&&reg_arr[4]=='C')
        	{
        		schl=1;
        	}
        }
        else if(student_school.equals("SMBS"))
        {
        	if(reg_arr[2]=='B'&&reg_arr[3]=='M'&&reg_arr[4]=='E')
        	{
        		schl=1;
        	}
        }
        int x=reg_arr[5];
        int y=reg_arr[6];
        int z=reg_arr[7];
        int p=reg_arr[8];
        if(x>0 && y>=0 && z>=0 && p>=0)
        {
            num=1;
        }
    }
    public static void main(String args[])throws Exception
    {
    	Scanner sc=new Scanner(System.in);
        char[] data =new char[40];
        System.out.println("Enter the num of students to be checked : ");
        int n=sc.nextInt();
        System.out.println("---ENTER STUDENT DETAILS---");
        try
        {
         File f =new File("Valid_students.txt");
         FileWriter fw=new FileWriter("Valid_students.txt");
         for(int i=0;i<n;i++) {
         System.out.println("Enter your registration number: ");
         student_reg_no=sc.next();
         System.out.println("Enter your name");
         student_name=sc.next();
         System.out.println("Enter your School name: ");
         student_school=sc.next();
         chk_reg(student_reg_no,student_school);
         if (yr==1 && lgt==1&&num==1 &&schl==1)
         {
            System.out.println("VALID REGISTRATION DETAILS");
            fw.write("---VALID STUDENT INFO---"+"\n");
            fw.write("REGISTRATION NUMBER"+"\t"+"STUDENT NAME"+"\t"+"STUDENT SCHOOL");
            fw.write("\n");
            fw.write(student_reg_no+"\t"+"\t"+student_name+"\t"+"\t"+student_school);
            fw.write("\n");
         }
         if (yr==0)
         {
        	 System.out.println("INVALID YEAR");
         }
         if(lgt==0)
         {
        	 System.out.println("INVALID REGISTRATION NUMBER");
         }
         if(schl==0)
         {
        	 System.out.println("INVALID SCHOOL");
         }
         }
         fw.close();
     }catch(FileNotFoundException e)
     {  
         System.out.println("The specified file does not exist...");   
     }

    }
}