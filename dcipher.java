import java.io.*;
class dcipher extends hextobinary
{
  public static void main(String ar[])throws IOException
  {   
    String c,m="",k="10101010";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the hex code");
    c  = br.readLine();
    dcipher obj = new dcipher();
    xor obj1 = new xor();
    binarytodecimal obj2 = new binarytodecimal();
    for(int i=0;i<=c.length()-2;i+=2)
    {
      int a = obj2.convert(obj1.add(obj.convert(c.substring(i,(i+2))),k));
      m+=Character.toString((char)a);
    }
   System.out.println(m);
  }
}