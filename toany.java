import java.io.*;
class toany
{
  public static void main(String ar[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a decimal value");
    int a = Integer.parseInt(br.readLine());
    System.out.println("Enter the base to be converted in");
    int b = Integer.parseInt(br.readLine());
    toany obj = new toany();
    String s = obj.convert(a,b);
    System.out.println(s);
  }
  String convert(int n, int b)
  {
    String s="";
    String c[]={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
    do
     {
        s=c[n%b]+s;
        n/=b;
     }while(n!=0);
     return s;
  }
}