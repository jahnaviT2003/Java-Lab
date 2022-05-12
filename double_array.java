import java.util.*;
public class double_array {
	public static int remove_duplicates(int arr[], int n)
	{  
        if (n==0 || n==1)
        {  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++)
        {  
            if (arr[i] != arr[i+1])
            {  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
 
        for (int i=0; i<j; i++)
        {  
            arr[i] = temp[i];  
        }  
        return j;  
    } 
	
	public static void main(String[] args)  
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);  
		
		System.out.println("Enter the size of Array 1 : ");   
		n1=sc.nextInt();  
		System.out.println("Enter the size of Array 2 : ");
		n2=sc.nextInt();
		 
		int[] array_1 = new int[n1]; 
		int[] array_2 = new int[n2];
		System.out.println("Enter the elements of the Array-1: ");  
		for(int i=0; i<n1; i++)  
		{    
			array_1[i]=sc.nextInt();  
		}  
		
		System.out.println("Enter the elements of the Array-2: ");
		for(int i=0; i<n2; i++)
		{
			array_2[i]=sc.nextInt();
		}
		n1 = remove_duplicates(array_1, n1); 
		n2 =remove_duplicates(array_2, n2);
		
		System.out.println("Array : 1");
		for (int i=0; i<n1; i++)
		{
			System.out.println(array_1[i]+"\t");
		}
		
		System.out.println("Array : 2"+"\n");
		for (int i=0; i<n2; i++)
		{
			System.out.println(array_2[i]+"\t");
		}
	}

}
