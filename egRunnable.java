public class egRunnable 
{
  public static void main(String ar[])
  {
    Thread t1 = new Thread(new Run1());
    Thread t2 = new Thread(new Run2());
     t1.start();
     t2.start();  
  }
}
class Run1 implements Runnable
{
  public void run()
  {
    for(int i=1;i<=10;i++)
    {
      System.out.println("Runnable A"+i);
    }
  }
}
class Run2 implements Runnable
{
  public void run()
  {
    for(int i=10;i>=1;i--) 
      System.out.println("Runnable B"+i); 
  }
}