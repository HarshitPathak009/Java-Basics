import java.util.*;
class hp
{
  public static void main(String ar[])
  {
    Scanner s = new Scanner(System.in);
    int t,a,b,c;
    double area,r,pi=3.1415,sp;
    t  = s.nextInt();
     while(t>0)
     {
         a = s.nextInt();
         b = s.nextInt();
         c = s.nextInt();
         sp = (a+b+c)/2;
         r = (a*b*c)/(4*(Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c))));
         area  = pi*r*r; 
         --t;
        System.out.println(area);
     }
  }
}