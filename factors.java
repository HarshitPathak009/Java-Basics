import java.util.*;
class factors
{
  public static void main(String ar[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n;i++)
    {
       if(n%i==0)
         System.out.print(i+" ");
    }
   System.out.println();
  }
}