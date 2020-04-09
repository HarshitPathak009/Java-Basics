import java.io.*;
class pat
{
 public static void main(String ar[])
 {
   try
   {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int m;
     char M[][];
     System.out.println("Enter the size of matrix");
     m = Integer.parseInt(br.readLine());
     M= new char[m][m];
     for(int i=0;i<m;i++)
     {
        for(int j=0;j<m;j++)
        {  
             if(i==j||i+j==m-1)
                 M[i][j] = '@';
            else if((i>j&&i+j<m-1)||(i<j&&i+j>m-1))
                  M[i][j]='!';
            else
                   M[i][j]='$';
        }
     }
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<m;j++)
        System.out.print(M[i][j]+" ");
     System.out.println();
    }
   }
  catch(Exception e)
  {
    System.out.println(e);
  }
 }
}