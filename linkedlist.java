import java.io.*;
class  linkedlist extends Node
{
  Node head; 
  public static void main(String ar[])throws IOException
  {
    int index, n, c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    linkedlist obj = new linkedlist();
    do
    { 
     System.out.println("Welcome to linked list");
     System.out.println("Enter 1 to insert ");
     System.out.println("Enter 2 to add at a given index");
     System.out.println("Enter 3 to show ");
     System.out.println("Enter 4 to search value");
     System.out.println("Enter 5 to delete value");
     System.out.println("Enter 6 to delete a given value");
     c = Integer.parseInt(br.readLine());
     switch(c)
     {
        case 1:
          System.out.println("Enter number to be inserted");
          n = Integer.parseInt(br.readLine());
          obj.add(n);
          System.out.println("Number added to list");
          break;
        case 2:
          System.out.println("Enter number to be inserted");
          n = Integer.parseInt(br.readLine());            
          System.out.println("Enter index to be inserted at");
          index = Integer.parseInt(br.readLine());
          obj.add(index,n);
          System.out.println("Value has been added");
             break;
        case 3:
          obj.show();
           break;
         case 4:
           System.out.println("Enter the value to be searched");
           n = Integer.parseInt(br.readLine());
           obj.search(n);
           break;
         case 5:
           obj.delete();
           break;
        case 6:
           System.out.println("Enter value to be deleted");
           n = Integer.parseInt(br.readLine());
           obj.delete(n);
           System.out.println("The value has been deleted");
           break;
        default:
          System.out.println("Wrong choice");
     }
     System.out.println("Enter 1 to continue");
     c = Integer.parseInt(br.readLine());
    }while(c==1);
  }
  void add(int i)
  {
    Node n = new Node();
    n.data  = i;
    if(head==null)
      head = n;
    else
    {
       Node q = head;
        while(q.next!=null) 
        {
           q = q.next;
        }
        q.next  = n;
    } 
  }
  void add(int index, int i)
  {
     if(head==null)
        add(i);
     else
     {
       Node n = new Node();
       n.data =i;
       Node q = head ;
       for(int j =1; j<index-1;j++)
           q=q.next;
       Node r = q.next;
       q.next = n;
       n.next = r;
     }
  }
 void show()
 {
    Node n = head;
    if(head!=null)
    {
     while(n.next!=null)
     { 
        System.out.println(n.data+" "+n+" "+n.next);
        n  = n.next;
     }    
     System.out.println(n.data+" "+n+" "+n.next);
    }
    else
      System.out.println("The list is empty");
 }
 void search(int i)
 {
    boolean flg = false;
    Node n = head;
    if(head!=null)
    {
     while(n.next!=null)
     {
        if(n.data==i)
        {  
           flg  =  true;
            break;   
        }
        n = n.next;
     }
     if(n.data==i)
        flg = true;
    if(flg == true)
      System.out.println("Value found at"+n);
    else
      System.out.println("Value not found");
   }
   else
     System.out.println("List is empty");
 }
 void delete()
 { 
   Node n = head;
   Node j=head;
   if(head!=null)
   { 
     while(n.next!=null) 
    {
       j = n.next;
       if(j.next==null)
          break;
      else
        n = n.next;
    }
    n.next = null;
    System.out.println("The value deleted is "+j.data); 
  }
  else
    System.out.println("List is empty");
 }
 void delete(int i)
 {
    Node n = head;
    Node j  =head;
    if(head==null) 
      System.out.println("The list is empty");
   else
   {
      if(n.data==i)
      {
        head = n.next;
      }
      else
     {
       while(n!=null)
       {
          j = n.next;
          if(j.data==i) 
         { 
           n.next  = j.next;
           break;
         }
         n  = n.next;
       }
     }
   }
 }  
}
class Node
{
   int data;
   Node next;
}