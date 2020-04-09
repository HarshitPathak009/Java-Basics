import java.io.*;
class binarytodecimal
{
  public static void main(String ar[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a binary number");
    String s = br.readLine();
    binarytodecimal  obj = new binarytodecimal();
    int c = obj.convert(s);
   System.out.println(c);
  }
  int convert(String s)
  {
    int c=0,j=0;
    for(int i=s.length()-1;i>=0;i--)
    {
      int a = Character.getNumericValue(s.charAt(i));
      c+=(int)a*Math.pow(2,j++);
    }
  return c;
  }
}