import java.io.*;
class binarytohex
{
 public static void main(String ar[])throws IOException
 { 
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the binary code");
   String s =  br.readLine();
   binarytohex obj = new binarytohex();
   s = obj.convert(s); 
  System.out.println(s);
 }
 String  convert(String s)
 {
   int j=0,num=0;
   for(int i =s.length()-1; i>=0;i-- )
   {
     int a = Character.getNumericValue(s.charAt(i));
     num+=(int)a*Math.pow(2,j++);
   }
   String c="";
   String a[]  = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
  while(num>0)
  {
    c=a[num%16]+c;
    num/=16;
  }
  return c;
 }
}