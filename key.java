import java.io.*;
class key
{
  public static void main(String ar[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String m,c,k,m1="",c1="";
    System.out.println("Enter the message");
    m = br.readLine();
    System.out.println("Enter the cipher code");
    c = br.readLine();
    tobinary obj = new tobinary();
    hextobinary obj1  =new hextobinary();
    xor obj2 = new xor(); 
    for(int i=0;i<m.length();i++)
       m1+=obj.convert(m.charAt(i));
    for(int i=0;i<=c.length()-2;i+=2)
        c1+=obj1.convert(c.substring(i,i+2));
    k  = obj2.add(m1,c1);
    System.out.println(k);
  }
}