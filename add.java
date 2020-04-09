import  java.io.*;
class Maths
{
  void add(int a, int b)
 {
    System.out.printf("%d",(a+b));
 }
}
class add extends Maths
{
  public static void main(String ar[])throws IOException 
 {
   int a,b;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  Maths obj = new Maths();	
  System.out.println("Enter first value");
  a  = Integer.parseInt(br.readLine());
  System.out.println("Enter first value");
  b  = Integer.parseInt(br.readLine());
 obj.add(a,b);
 }
}