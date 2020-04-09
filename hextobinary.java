import java.io.*;
class  hextobinary
{
  public static void main(String ar[])throws IOException
 {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter hex code");
   String h = br.readLine();
   hextobinary obj = new hextobinary();
   h = obj.convert(h);
  System.out.println(h);
 }
 String convert(String m)
 {
   int j=0,c=0;
   String h="";
   for(int i=m.length()-1;i>=0;i--)
  {
     int a = Character.getNumericValue(m.charAt(i));
     c+=(int)a*Math.pow(16,j++); 
  }
  while(c>0)
  {
    h=Integer.toString(c%2)+h;
    c/=2;
  }
  j = h.length();
   if(h.length()<8)
    for(c=j;c<8;c++ )
      h= "0"+h;
  return h;
 }
}