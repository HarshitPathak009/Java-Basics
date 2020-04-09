import java.io.*;
class cipher
{
  public static void main(String ar[])throws IOException
  {
    String m,c="",k="10101010";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a sentence");
    m = br.readLine();
    int l=m.length();
    tobinary obj = new tobinary();
    xor obj1 = new xor();
    binarytohex obj2 = new binarytohex(); 
    for(int i=0;i<l;i++)
    {
       int a = m.charAt(i);
      c += obj2.convert(obj1.add(obj.convert(a),k));
    } 
    System.out.println(c);
  }
}