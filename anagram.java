import java.util.*;
class anagram
{
 public static void main(String ar[])
 {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   sc.nextLine();
   while(n>0)
   { 
     String a = sc.nextLine();
     String b = sc.nextLine();
     String s =b;
     if(a.length()<1000&&b.length()<1000)
     {
        int r=0;
       for(int i=0;i<a.length();i++)
       {
          int  hj = b.indexOf(a.charAt(i));
          if(hj==-1)
          {
            r++;
          }
          else
            b = b.substring(0,hj)+b.substring(hj+1);
       }
       for(int i=0;i<s.length();i++)
       {
          int  hj = a.indexOf(s.charAt(i));
          if(hj==-1)
          {
            r++;
          }
          else
            a = a.substring(0,hj)+a.substring(hj+1);
       }
      n--;
      System.out.println(r);
    } 
   }
 }
}