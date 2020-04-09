import java.io.*;
public class egThread
{
  public static void main(String ar[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    thread1 obj = new thread1();
    thread2 obj2 = new thread2();
    obj.start();//thread functions
    obj2.start();
    int a;
    System.out.println("Enter a number");
    a = Integer.parseInt(br.readLine());
    //obj.start(a);
    obj.run(a); //normal call to method
    //obj2.start(a);
   obj2.run(a);
  }
}
class thread1 extends Thread
{
  public void run()
  {
     for(int i=1;i<=10;i++)
     {
         System.out.println("Thread A"+(2*i));
     }
  }
   public void run(int n)
   {
      for(int i=1;i<=n;i++)
     {
         System.out.println("Thread A"+(-2*i));
     }
   }
}
class thread2 extends Thread
{
    public void run()
    {
     for(int i=1;i<=10;i++)
     {
         System.out.println("Thread B"+(-2*i));
     }
   }
   public void run(int n)
   {
      for(int i=1;i<=n;i++)
     {
         System.out.println("Thread B"+(-2*i));
     }
   }
}