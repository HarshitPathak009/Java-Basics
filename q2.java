class q2
{
   static int i=-1,c=0;
  void count()
   {
      int arr[] = {2,1,4,5,8,3,5,7,6,9};
      int a[] = new int[5];
      while(i<arr.length-1)
      {
         try
         {
            ++i;
            a[(arr[i]%5)-1]++;
         }
         catch (Exception e)
          {
              c++;
               count();
          }
       }
   }
  public static void main(String args[])
  {
     q2 obj = new q2();
     obj.count();
     System.out.println(c);
  }
}