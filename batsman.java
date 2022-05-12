import java.util.*;
public class batsman {
	int batsman_code,runs_scored,innings_played,notout_count;
	String batsman_name;
	float bat_avg;
	public void read_data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Cricket batsmen Details: ");
		System.out.println("Enter the Batsman code: ");
		batsman_code=sc.nextInt();
		System.out.println("Enter the Batsman Name: ");
		batsman_name=sc.next();
		System.out.println("Enter the Total innings played: ");
		innings_played=sc.nextInt();
		System.out.println("Enter the Not-out Innings played: ");
		notout_count=sc.nextInt();
		System.out.println("Enter the total runs scored: ");
		runs_scored=sc.nextInt();
		calc_avg();
	}
	public void display_data()
	{
		System.out.println("\n"+"  Batsman Name : "+batsman_name+"\n");
		System.out.println("Batsman Code : "+batsman_code+"\n"+"Total Runs Scored by him : "+runs_scored+"\n"+"Total Innings played by him : "+innings_played+"\n"+"Not-out Innings played by him : "+notout_count+"\n"+"Batsman Batting Average : "+bat_avg);
	}
	public void calc_avg()
	{
		bat_avg=runs_scored/(innings_played-notout_count);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the no of batsmen : ");
		n=sc.nextInt();
		batsman ob[]=new batsman[100];
		for (int i=0;i<n;i++)
		{
			ob[i]=new batsman();
			ob[i].read_data();
		}
		System.out.println("____Display Batsmen Details____");
		for (int i=0;i<n;i++)
		{
			ob[i].calc_avg();
			ob[i].display_data();
		}
	}
}

;