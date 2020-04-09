import java.io.*;
class binarytree
{ 
   static nodes head;
  public static void main(String ar[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n;
    binarytree obj = new binarytree();
   do
   {
     System.out.println("Welcome to Binary Tree");
     System.out.println("Enter 1 to input");
     System.out.println("Enter 2 to display");
     n  = Integer.parseInt(br.readLine());
     switch(n)
     {
       case 1:
          System.out.println("Enter number to be inserted");
          n = Integer.parseInt(br.readLine());
          obj.input(n);
          break;
        case 2:
          obj.display(head);
          System.out.println();
          break;
       default:
         System.out.println("Wrong choice");
     }
     System.out.println("\nEnter 1 to continue");
     n = Integer.parseInt(br.readLine());
   }while(n==1);
  }
  void input(int n)
  {
    if(head == null)
    {
      nodes a = new nodes();
      a.data = n;
      head = a;
    }
    else
    {
       nodes a  = head;
       nodes parent;
       while(true)
        {
           parent =a;
           if(a.data<n)
           {
              a = a.right;
              if(a==null)
              {     
                 nodes nw = new nodes();
                 nw.data = n;
                 parent.right = nw;
                 break;
              }
           }
           else if(a.data>n)
           {
              a = a.left;
              if(a==null)
              {     
                 nodes nw = new nodes();
                 nw.data = n;
                 parent.left = nw;
                 break;
              }
           }
        }       
    }
  }
  void display(nodes d)
  {
    if(d!=null)
    {
        display(d.left);
        System.out.print(d.data+" ");
        display(d.right);
    }      
  }
}
class nodes
{
  nodes left, right;
  int data;
} 