import java.util.*;
class counter extends Thread{
    static int customer[]=new int[5];
    static int i=0;
    String name;
    int count,finalamt=0;
    Scanner sc=new Scanner(System.in);
    public counter(String name){
        this.name=name;
        for(int i=0;i<customer.length;i++){
            customer[i]=i+1;
        }
        count=0;
    }
    public void run(){
        while(i<customer.length){
            synchronized(customer){
                if(i<customer.length){
                    
                    System.out.println(name+"  serving "+customer[i]);
                    int x=sc.nextInt();
                    finalamt=finalamt+x;
                    i++;
                    count++;
                    try{
                        Thread.sleep(10);
                    }
                    catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        }
        System.out.println(name+" has served "+count+" coustomer total sales are :"+finalamt);
    }
}
public class counter_restaurant {
    public static void main(String[] args) {
        counter c1=new counter("qwe");
        counter c2=new counter("asd");
        counter c3=new counter("zxc");
        c1.start();
        c2.start();
        c3.start();
    }
}