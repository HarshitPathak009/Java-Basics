import java.io.*;
class valley
{
  public static void main(String ar[])throws IOException
  {
    int sea=0,c=0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a =Integer.parseInt(br.readLine());
    if(a<2||a>1000000)
   {
     System.out.println("Steps Error");
   }
   String s = br.readLine();
   for(int i=0; i<s.length()-1;i++)
   { 
     if(s.charAt(i)=='U')
      ++sea;
    else if(s.charAt(i)=='D')
      --sea;
      if(s.charAt(i)=='D'&&sea==-1)
       c++;  
   }
   System.out.println(c);   
  }
}