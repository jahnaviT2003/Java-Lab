import java.util.*;
public class patient_symptoms{
	String symptom_1,symptom_2,hospital_loc;
	public void get_symptom_details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Symptom Details:");
		System.out.println("Enter the Symptom1:");
		symptom_1=sc.next();
		System.out.println("Enter the Symptom2:");
		symptom_2=sc.next();
	}
	public void Medicine_suggestion()
	{
		if((symptom_1.equals("Fever") && symptom_2.equals("Headache")) || (symptom_1.equals("Headache") && symptom_2.equals("Fever")))
		{
			System.out.println("Recomennded Medicine for Fever&Headache is:");
			System.out.println("Dolo650 for 3days (1-1-1)");
		}
		else if((symptom_1.equals("Cold") && symptom_2.equals("Cough")) || (symptom_1.equals("Cough") && symptom_2.equals("Cold")))
		{
			System.out.println("Recomennded Medicine for Cold&Cough is:");
			System.out.println("CofStop Z Syrup 5ml 3 times a day");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Symptoms provided doesn't match :(");
			System.out.println("Please enter the location to find best hospitals available:");
			hospital_loc=sc.next();
			if (hospital_loc.equals("Hyderabad"))
			{
				System.out.println("Please visit APPOLLO HOSPITALS..!!");
			}
			else if(hospital_loc.equals("Chennai"))
			{
				System.out.println("Please visit FORTIS MALAR HOSPITALS..!!");
			}
			else if(hospital_loc.equals("Delhi"))
			{
				System.out.println("Please visit JEEVAN MALAR HOSPITALS..!!");
			}
			else if(hospital_loc.equals("Assam"))
			{
				System.out.println("Please visit GNRC HOSPITALS..!!");
			}
			else if(hospital_loc.equals("Kolkata"))
			{
				System.out.println("Please visit DESUN HOSPITALS..!!");
			}
			else if(hospital_loc.equals("Mumbai"))
			{
				System.out.println("Please visit JASLOK HOSPITALS..!!");
			}
			else
			{
				System.out.println("Please visit to your nearest hospital..!!");
				System.out.println("Entered location is not found :(");
			}
		}
		System.out.println("Thank you !!");
		System.out.println("Take Care and Get well soon");
	}
	public void patient_health()
	{
		get_symptom_details();
		Medicine_suggestion();
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the no of Patients:");
		n=sc.nextInt();
		patient_symptoms ob[]=new patient_symptoms[100];
		for (int i=0;i<n;i++)
		{
			ob[i]=new patient_symptoms();
			ob[i].patient_health();
		}
	}

}

