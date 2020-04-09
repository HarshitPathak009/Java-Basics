public class ThreadA extends Thread
{
  static String s="";
  public void run()
  {
    synchronized(s)
   {
    for(int i=1;i<=10;i++)
     s=s+i;
   }
  }
  public static void main(String ar[])throws Exception
  {
    ThreadA t = new ThreadA();
    ThreadA t1 = new ThreadA();
     t.start();
     t1.start();
     t.join();//wait till the thread is complete
      t1.join();
     System.out.println(s);  
  }
}