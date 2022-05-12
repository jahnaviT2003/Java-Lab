import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class eng_piglatin {
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		char[] data =new char[100];
		try
		{
			File f =new File("English_words.txt");
			File f1=new File("PigLatin_words.txt");
			FileWriter fw =new FileWriter("English_words.txt");
			FileWriter fw_1=new FileWriter("PigLatin_words.txt");
			System.out.println("Enter the number of English Words : ");
			int n=sc.nextInt();
			String English_word;
			System.out.println("Enter the English Words : ");
			for(int i=0;i<n;i++)
			{
				English_word=sc.next();
				fw.write(English_word);
				fw.write("\n");
				char [] ch=English_word.toCharArray();
				if((ch[0]=='a'||ch[0]=='e'||ch[0]=='i'||ch[0]=='o'||ch[0]=='u') && (ch[1]=='a'||ch[1]=='e'||ch[1]=='i'||ch[1]=='o'||ch[1]=='u'))
				{
					String new_pigLatin = English_word+"ay";
					fw_1.write(new_pigLatin);
					fw_1.write("\n");
				}
				else if(ch[0]=='a'||ch[0]=='e'||ch[0]=='i'||ch[0]=='o'||ch[0]=='u')
				{
					String new_pigLatin = English_word+"way";
					fw_1.write(new_pigLatin);
					fw_1.write("\n");
				}
				else if((ch[0]!='a'||ch[0]!='e'||ch[0]!='i'||ch[0]!='o'||ch[0]!='u') && (ch[1]=='a'||ch[1]=='e'||ch[1]=='i'||ch[1]=='o'||ch[1]=='u'))
				{
					int l=English_word.length();
					String new_word = "";
					for(int j = 1; j<l; j++)
					{
						 new_word = new_word + English_word.charAt(j);
					}
					new_word = new_word + English_word.charAt(0);
					String new_pigLatin = new_word + "ay";
					fw_1.write(new_pigLatin);
					fw_1.write("\n");
				}
				else if((ch[0]!='a'||ch[0]!='e'||ch[0]!='i'||ch[0]!='o'||ch[0]!='u') && (ch[1]!='a'||ch[1]!='e'||ch[1]!='i'||ch[1]!='o'||ch[1]!='u'))
				{
					int l=English_word.length();
					String new_word = "";
					for(int j = 2; j<l; j++)
					{
						 new_word = new_word + English_word.charAt(j);
					}
					new_word = new_word + English_word.charAt(0) + English_word.charAt(1);
					String new_pigLatin = new_word + "ay";
					fw_1.write(new_pigLatin);
					fw_1.write("\n");
				}
			}
			fw.close();
			fw_1.close();
			
			FileReader fr = new FileReader("English_words.txt");
			FileReader fr_1=new FileReader("PigLatin_words.txt");
			
	        BufferedReader br=new BufferedReader(fr);
	        BufferedReader br_1=new BufferedReader(fr_1);
	        
	        System.out.println("---Display ENGLISH Words---");
	        FileReader fr1=new FileReader("English_words.txt");
	        fr1.read(data);
	        System.out.println(data);
	        fr1.close();

	        System.out.println("\n"+"---Display PIGLATIN Words---");
	        FileReader fr2=new FileReader("PigLatin_words.txt");
	        fr2.read(data);
	        System.out.println(data);
	        fr2.close();
		}
		catch(FileNotFoundException e)
	    {
	        
	        System.out.println("The specified file does not exist...");
	         
	    }
	}
}
	
