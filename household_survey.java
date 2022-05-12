import java.util.*;
public class household_survey {
	int household_id,m,povertylevel_income;
    float household_income;

    public void get_household_surveydetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the house hold survey details : ");
        System.out.print("Enter the house hold identification number : "+"\n");
        household_id=sc.nextInt();
        System.out.print("Enter House hold Income : "+"\n");
        household_income=sc.nextFloat();
        System.out.println("Enter the no of members in each households : ");
        m=sc.nextInt();
        povertylevel_income=7500 + 950*(m-2);
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        household_survey ob[]=new household_survey[100];
        int n;
        int c=0;
        float percentage,total_income=0,average_income=0;
        System.out.println("Enter the no of Households : ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ob[i]=new household_survey();
            ob[i].get_household_surveydetails();
        }
        for(int i=0;i<n;i++)
        {
            total_income=total_income+ob[i].household_income;
        }
        average_income=total_income/n;
        System.out.println("Average household income is : $ "+average_income);
        System.out.println("List of id's whose household income greater than avg income..!!"+"\n");
        for(int i=0;i<n;i++)
        {
            if(ob[i].household_income>=average_income)
            {
                System.out.println(ob[i].household_id+"\t"+ob[i].household_income+"\n");
            }
            if(ob[i].household_income<ob[i].povertylevel_income)
            {
                c++;
            }
        }
        System.out.println("Number of House hold id's below Poverty Line : "+c);
        percentage= (c*100/(n));
        System.out.println("Percentage of households having income below the poverty level : "+percentage+"%");
    }
}
