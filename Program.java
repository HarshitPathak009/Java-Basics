class base
{
  base()
  {
    System.out.println("A");
  }
  base(int a)
  { 
    System.out.println("B");
  }
}
class derived extends base
{
  derived()
   {
     //by default the default constructor of base class is invoked from here too
     System.out.println("C");
   }
   derived(int a)
   {
     //super(a);//without super the default constructor of base class will be called
     System.out.println("D");
   }
}
class Program
{
  public static void main(String ar[])
  {
    derived obj = new derived();
    derived obj2 = new derived(10);
  }
}