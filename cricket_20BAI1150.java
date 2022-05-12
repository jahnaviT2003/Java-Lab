import java.util.*;

public class cricket_20BAI1150 {
    public static void main(String argv[])
    {
        List<String> duckout_innings = new ArrayList<>();
        List<String> thirtyplus_innings = new ArrayList<>();
        List<String> fiftyplus_innings = new ArrayList<>();
        List<String> century_innings = new ArrayList<>();

        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of cricketers : ");
        n=sc.nextInt();
        System.out.println("---ENTER INNINGS AND CRICKET DETAILS---");
        for(int i=0;i<n;i++)
        {
            String innings_type,cricketer_name,play_type,country_belonging;
            System.out.println("Enter the cricketer name : ");
            cricketer_name=sc.next();
            System.out.println("Enter the country in which player belongs to : ");
            country_belonging=sc.next();
            System.out.println("Enter the innings type : ");
            innings_type=sc.next();
            if(innings_type.equals("duckout"))
            {
                duckout_innings.add("duckout");
            }
            if(innings_type.equals("thirtyplus"))
            {
                thirtyplus_innings.add("thirtyplus");
            }
            if(innings_type.equals("fiftyplus"))
            {
                fiftyplus_innings.add("fiftyplus");
            }
            if(innings_type.equals("century"))
            {
                century_innings.add("century");
            }

        }
        System.out.println("Number of duckout Innings scored : "+duckout_innings.size());
        System.out.println("Number of thirty plus Innings scored : "+thirtyplus_innings.size());
        System.out.println("Number of fifty plus Innings scored : "+fiftyplus_innings.size());
        System.out.println("Number of century Innings scored : "+century_innings.size());
    }
    
}