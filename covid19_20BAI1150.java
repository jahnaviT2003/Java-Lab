import java.util.*;

class covid19_20BAI1150
{
    String Country_name;
    int total_cases,new_cases,total_deaths,new_deaths,total_recovered,new_recovered,active_cases,serious_critical,total_tests,population;

    covid19_20BAI1150(){
    String Country_name="****";
    int total_cases=0,new_cases=0,total_deaths=0,new_deaths=0,total_recovered=0,new_recovered=0,active_cases=0,serious_critical=0,total_tests=0,population=0;
    }

    public void display_details(){
    	System.out.println("___DISPLAY COVID-19 DETAILS___");
        System.out.println("\n"+"COUNTRY NAME : "+Country_name+"\n");
        System.out.println("\n"+"POPULATION : "+population+"\n");
        System.out.println("---TOTAL CASES DETAILS---");
        System.out.println("Total cases :     "+total_cases);
        System.out.println("Total Deaths :    "+total_deaths);
        System.out.println("Total Recovered : "+total_recovered);
        System.out.println("Total Tests :     "+total_tests);
        System.out.println("\n");
        System.out.println("---ACTIVE INFORMATION---");
        System.out.println("Active Cases:      "+active_cases);
        System.out.println("New Cases :        "+new_cases);
        System.out.println("New Deaths :       "+new_deaths);
        System.out.println("New Recovered :    "+new_recovered);
        System.out.println("Serious Critical : "+serious_critical);
        System.out.println("\n");
    }
    covid19_20BAI1150(String Country_name,int population,int active_cases,int new_cases,int new_deaths,int new_recovered,int serious_critical,int total_cases,int total_deaths,int total_recovered,int total_tests){
        this.Country_name=Country_name;
        this.population=population;
        this.active_cases=active_cases;
        this.new_cases=new_cases;
        this.new_deaths=new_deaths;
        this.new_recovered=new_recovered;
        this.serious_critical=serious_critical;
        this.total_cases=total_cases;
        this.total_deaths=total_deaths;
        this.total_recovered=total_recovered;
        this.total_tests=total_tests; 
    }
    public static void main(String argv[]) 
    {
    
    	covid19_20BAI1150 india=new covid19_20BAI1150("INDIA",1398272416,153253,42965,910,33907,72974,343549666,460787,33740926,11278853);
    	covid19_20BAI1150 france=new covid19_20BAI1150("FRANCE",65468132,119885,42965,910,33907,1049,7208937,117900,6971152,151204954);
    	covid19_20BAI1150 america=new covid19_20BAI1150("AMERICA",333617183,9226651,42965,910,33907,11346,47313412,775095,37311666,708996636);
    	System.out.println("-----COVID-19 COUNTRY WISE DETAILS---");
    	System.out.println("__AVAILABLE COUNTRIES__");
        System.out.println("1. INDIA");
        System.out.println("2. FRANCE");
        System.out.println("3. AMERICA");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice;
        Scanner sc= new Scanner(System.in);
        choice =sc.nextInt();
        switch(choice) {
        case 1:
        	india.display_details();
        	break;
        case 2:
        	france.display_details();
        	break;
        case 3:
        	america.display_details();
        	break;
        default:
        	System.out.println("Not a valid choice..!!");
        	
        }
    }

}