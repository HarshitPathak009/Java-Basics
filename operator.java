class operator
{
  public static void main(String ar[])
  {
    String s1="Hello";
    String s2 = "java";
    System.out.println(s1+s2);
    int a=10;
    int b=20;
    System.out.println(a+b);
    System.out.println(""+a+b);
    char c[]={'N','P','T','E','L'};
    System.out.print(""+c[0]+c[c.length-1]);
    System.out.print(c[0]+c[c.length-1]);
    int[] identifier = new int[20];
    int[] malloc;
    int[][] calloc = new int[20][20];
    int[][] f = {{1,2,3},{4,5,6}}; 
    System.out.println("");
    for(int d=1; d<3;d+=3)
     {
        System.out.print(--d);
     }
  }
}