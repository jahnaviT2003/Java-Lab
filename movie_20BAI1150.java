import java.util.*;

class movie_type{
    String city_name,theatre_name,movie_name,seat_mode;
    int no_tickets;
    int ticket_cost=0;
    int entry_fee=100;

    void print_details()
    {
    	System.out.println("---DISPLAY MOVIE DETAILS---");
    	System.out.println("Display Theatre Name : "+theatre_name);
    	System.out.println("Display Movie Name : "+movie_name);
    	System.out.println("Number of Tickets booked : "+no_tickets);
    	System.out.println("Amount to be paid : "+ticket_cost); 
    }
    void get_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter City Name : ");
        city_name=sc.next();
        System.out.println("Enter Theatre Name : ");
        theatre_name=sc.next();
        System.out.println("Enter Movie Name : ");
        movie_name=sc.next();
        System.out.println("Enter Seat Mode : ");
        seat_mode=sc.next();
        System.out.println("Enter the no of tickets required : ");
        no_tickets=sc.nextInt();
    }
    public void Amount()
    {
        ticket_cost=entry_fee;
    }
}
class morning_show extends movie_type
{
   
    public void Amount()
    {
    	switch(seat_mode) {
    	case "stalls_seats":
    		ticket_cost=entry_fee+(no_tickets*200);
    		break;
    	case "premium_seats":
    		ticket_cost=entry_fee+(no_tickets*950);
    		break;
    	case "upper_circle":
    		ticket_cost=entry_fee+(no_tickets*639);
    		break;
    	case "gallery":
    		ticket_cost=entry_fee+(no_tickets*678);
    		break;
    	case "restricted_view_seats":
    		ticket_cost=entry_fee+(no_tickets*890);
    		break;
    	case "box_seats":
    		ticket_cost=entry_fee+(no_tickets*560);
    		break;
    	default:
    		System.out.println("INVALID ENTRY TYPE");	
    		break;
    		
    	}
        
    }
}
class matinee extends movie_type
{
    public void Amount()
    {
    	switch(seat_mode) {
    	case "stalls_seats":
    		ticket_cost=entry_fee+(no_tickets*250);
    		break;
    	case "premium_seats":
    		ticket_cost=entry_fee+(no_tickets*1000);
    		break;
    	case "upper_circle":
    		ticket_cost=entry_fee+(no_tickets*750);
    		break;
    	case "gallery":
    		ticket_cost=entry_fee+(no_tickets*700);
    		break;
    	case "restricted_view_seats":
    		ticket_cost=entry_fee+(no_tickets*950);
    		break;
    	case "box_seats":
    		ticket_cost=entry_fee+(no_tickets*1200);
    		break;
    	default:
    		System.out.println("INVALID ENTRY TYPE");	
    		break;
    		
    	}
    }

}
class first_show extends movie_type
{
    public void Amount()
    {
    	switch(seat_mode) {
    	case "stalls_seats":
    		ticket_cost=entry_fee+(no_tickets*300);
    		break;
    	case "premium_seats":
    		ticket_cost=entry_fee+(no_tickets*1050);
    		break;
    	case "upper_circle":
    		ticket_cost=entry_fee+(no_tickets*739);
    		break;
    	case "gallery":
    		ticket_cost=entry_fee+(no_tickets*778);
    		break;
    	case "restricted_view_seats":
    		ticket_cost=entry_fee+(no_tickets*990);
    		break;
    	case "box_seats":
    		ticket_cost=entry_fee+(no_tickets*660);
    		break;
    	default:
    		System.out.println("INVALID ENTRY TYPE");	
    		break;
    		
    	}

    }

}
class second_show extends movie_type
{
    public void Amount()
    {
    	switch(seat_mode) {
    	case "stalls_seats":
    		ticket_cost=entry_fee+(no_tickets*100);
    		break;
    	case "premium_seats":
    		ticket_cost=entry_fee+(no_tickets*750);
    		break;
    	case "upper_circle":
    		ticket_cost=entry_fee+(no_tickets*539);
    		break;
    	case "gallery":
    		ticket_cost=entry_fee+(no_tickets*478);
    		break;
    	case "restricted_view_seats":
    		ticket_cost=entry_fee+(no_tickets*690);
    		break;
    	case "box_seats":
    		ticket_cost=entry_fee+(no_tickets*360);
    		break;
    	default:
    		System.out.println("INVALID ENTRY TYPE");	
    		break;
    		
    	}
    }
}
public class movie_20BAI1150
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        int movie_type_choice;
        System.out.println("--AVAILABLE MOVIE SHOW TYPES---");
        System.out.println("1. Morning Show");
        System.out.println("2. Matinee");
        System.out.println("3. First Show");
        System.out.println("4. Second Show");
        System.out.println("Enter any choice : ");
        movie_type_choice=sc.nextInt();
        if(movie_type_choice==1)
        {
            movie_type m = new morning_show();
            m.get_details();
            m.Amount();
            m.print_details();
        }
        else if(movie_type_choice==2)
        {
            movie_type m_t = new matinee();
            m_t.get_details();
            m_t.Amount();
            m_t.print_details();
        }
        else if(movie_type_choice==3)
        {
            movie_type f = new first_show();
            f.get_details();
            f.Amount();
            f.print_details();
        }
        else if(movie_type_choice==4)
        {
            movie_type s = new second_show();
            s.get_details();
            s.Amount();
            s.print_details();
        }
        else
        {
            System.out.println("ENTER A VALID CHOICE");
        }
        
    }  
}
