import java.io.*;
class twoen
{ 
  public static void main(String ar[])throws IOException
  {
    String h1="",h2="",n="",m="";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter cipher text 1");
    String c1 = br.readLine();
    System.out.println("Enter cipher text 2");
    String c2 = br.readLine();
     xor ob  = new xor();
   binarytodecimal o = new binarytodecimal();
    hextobinary obj = new hextobinary();
    for(int i=0;i<=c1.length()-2;i+=2)
     h1+=obj.convert(c1.substring(i,i+2));
    for(int i=0;i<=c2.length()-2;i+=2)
      h2+=obj.convert(c2.substring(i,i+2));
    n = ob.add(h1,h2);
   for(int i=0;i<=n.length()-8;i+=8)
    m+=Character.toString((char)(o.convert(n.substring(i,i+8))));
   System.out.println(m);
  }
}