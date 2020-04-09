import java.util.*;
class pass
{
  public static void main(String ar[])
  {
    Scanner sc = new Scanner(System.in);
    pass obj = new pass();
    System.out.println("Enter length of new password");
    int  l = sc.nextInt();
   System.out.println(obj.newpass(l));
  }
  String newpass(int len)
  {
    String c="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*+-/?abcdefghijklmnopqrstuvwxyz0123456789";
    String s="";
     Random r = new Random();
    for(int i=0;i<len;i++)
    {
       s+=c.charAt(r.nextInt(c.length()));
    }
   return s;
  }
}