class patt
{
  public static void main(String ar[])
  {
    int n =6;
    int x=-(n*n);
    for(int i=1; i<(3*n)+1;i++)
     {
        System.out.print(x+" ");
        x=x+2*i-1;
     }
  }
}