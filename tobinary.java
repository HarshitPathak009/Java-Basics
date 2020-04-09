import java.io.*;
class tobinary
{
  public static void main(String ar[])throws IOException
 {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter a number");
   int n = Integer.parseInt(br.readLine());
  tobinary obj = new tobinary();
  String s = obj.convert(n);
  System.out.println(s);
 }
 String convert(int n)
 {
  String s ="";
  while(n>0)
  {
    s  = Integer.toString(n%2)+s;
    n/=2;
  }
 int l = s.length();
  if(l<8)
  {
     for(int i=0;i<8-l;i++)
       s= "0"+s;
  }
  return s;
 }
}