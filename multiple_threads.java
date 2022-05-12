class NewThread extends Thread
{
String name;
Thread t;
boolean suspendflag;



NewThread(String threadname)
{
name = threadname;
t=new Thread(this,name);
System.out.println(t);
suspendflag=false;
t.start();
}

public void run()
{
try
{
for(int i=0;i<50;i++)
{
System.out.println(name + " : "+i);
Thread.sleep(200);
synchronized(this)
{
while (suspendflag)
{
wait();
}
}
}
}catch(InterruptedException e){ }
System.out.println(name + " exiting");
}



void mysuspend()
{
suspendflag=true;
}
synchronized void myresume()
{
suspendflag=false;
notify();
}
}



public class multiple_threads
{
public static void main(String[] arg)
{
NewThread ob1=new NewThread("one");
NewThread ob2=new NewThread("two");
try
{
Thread.sleep(1000);
ob1.mysuspend();
System.out.println("Suspending one");
Thread.sleep(1000);
System.out.println("Resume one");
ob1.myresume();
ob2.mysuspend();
System.out.println("Suspending two");
Thread.sleep(1000);
System.out.println("Resume two");
ob2.myresume();

} catch(InterruptedException e){ }
try
{
ob1.t.join();
ob2.t.join();
} catch(InterruptedException e){ }
System.out.println("Main Exiting");
}
}