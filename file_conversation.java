import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_conversation {
	public static void main(String args[])throws Exception
	{
		File convo_f=new File("C:\\Users\\91630\\Downloads\\file conversation.txt");
		try
		{
			String sentence;
			File f_1 =new File("person_1.txt");
			File f_2=new File("person_2.txt");
			FileReader fr_txt=new FileReader(convo_f);
            BufferedReader br_txt=new BufferedReader(fr_txt);
			FileWriter fw =new FileWriter("person_1.txt");
			FileWriter fw_1=new FileWriter("person_2.txt");
			
			int num=0;
			while((sentence=br_txt.readLine())!=null)
			{
				if(num % 2 == 0)
                {
                    fw.write(sentence);
                    fw.write("\n");
                }
                else
                {
                    fw_1.write(sentence);
                    fw_1.write("\n");
                }
                num+=1;	
			}
			fw.close();
            fw_1.close();
            
            String str_1,str_2;
            
            System.out.println("\n"+"---DISPLAY PERSON-1 CONVERSATION---"+"\n");
            BufferedReader a = new BufferedReader(new FileReader(f_1));
            while ((str_1 = a.readLine()) != null) 
            {
            	System.out.println(str_1);
            }
            
            System.out.println("\n"+"---DISPLAY PERSON-2 CONVERSATION---"+"\n");
            BufferedReader b = new BufferedReader(new FileReader(f_2));
            while ((str_2 = b.readLine()) != null)
            {
            	System.out.println(str_2);
            }
		}
		catch(FileNotFoundException e)
	    {
	        
	        System.out.println("The specified file does not exist...");
	         
	    }
	}

}
