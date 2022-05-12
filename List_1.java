import java.util.*;

class book_details{
	String book_name;
	int book_id,published_yr,book_cost;
	public book_details(int book_id, String book_name, int published_yr, int book_cost) {  
		this.book_id = book_id;  
		this.book_name = book_name;  
		this.published_yr = published_yr;  
		this.book_cost = book_cost;  
		}
	}
	public class List_1{
	public static void main(String[] args) throws Exception{  
	List<book_details> book_list = new ArrayList<book_details>(); 
	List<String> book_sorted = new ArrayList<String>();
	 book_details b1=new book_details(100,"Networks_and_Communication",2019,679);  
	 book_details b2=new book_details(101,"Computer_Architecture_and_Organisation",2016,560);
	 book_details b3=new book_details(102,"Discrete_Mathematics_and_Graph_Theory",2019,940);
	 book_details b4=new book_details(103,"Data_Structures_and_Algorithms",2018,450);
	 book_details b5=new book_details(104,"Java_Programming",2021,870);
	 book_details b6=new book_details(105,"Theory_of_Computation",2015,630);
	
	 book_list.add(b1);
	 book_list.add(b2);
	 book_list.add(b3);
	 book_list.add(b4);
	 book_list.add(b5);
	 book_list.add(b6);
	 
	 book_sorted.add("Networks and Communication");
	 book_sorted.add("Computer Architecture and Organisation");
	 book_sorted.add("Discrete Mathematics and Graph Theory");
	 book_sorted.add("Data Structures and Algorithms");
	 book_sorted.add("Java Programming");
	 book_sorted.add("Theory of Computation");
	 
	 
	 int search_published_yr;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the book published year to be searched : ");
	 search_published_yr=sc.nextInt();
	 System.out.println("List of all books published in a particular year : ");
	 System.out.println("");
	 for (book_details bd:book_list)
	 {
		 if(bd.published_yr==search_published_yr)
		 {
			 System.out.println(bd.book_name);
		 }
	 }
	 System.out.println("");
	 String find_book;
	 System.out.println("Enter the Book Name : ");
	 find_book=sc.next();
	 System.out.println("Book Details : ");
	 for (book_details bd:book_list)
	 {
		 if (bd.book_name.equals(find_book)){
			 System.out.println("Year of Publication : "+bd.published_yr+"\n"+"Book Cost : "+bd.book_cost);
		 }
	 }
	 System.out.println("");
	 System.out.println("Sorted Order of Book Names : ");
	 System.out.println("");
	 Collections.sort(book_sorted);
	 for(String book_s:book_sorted)  
		    System.out.println(book_s);
	 
	}
}
