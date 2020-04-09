import java.util.*;
class sinexpansion
{
  public static void main(String ar[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    double sum =0,sign=1;
    for(int i=1; i<25; i+=2)
    {
      int fact =1;
      for(int j=1; j<=i; j++)
         fact*=j;
      sum+=sign*(Math.pow(n,i)/fact);
      sign*=-1;
    }
   System.out.println(sum);
  }
}