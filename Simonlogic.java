import java.util.*;
class Simonlogic
{
   Scanner sc = new Scanner(System.in);
    static int level=4,score=0;
   ArrayList<String> simon = new ArrayList<String>();
   String color[]={"Red","Yellow","Blue","Green","Orange","Purple"};
   Random r = new Random();
   void addsimon()
   { 
      simon.add(color[r.nextInt(8000)%level]);
      for(int i=0;i<simon.size();i++)
      {
         System.out.print(simon.get(i)+" ");
      }
     System.out.println();
   } 
   void checksimon()
   {
     addsimon();
     int point =0;
     String user[] = new String[simon.size()];
     for(int i=0;i<simon.size();i++)
     {
        user[i]=sc.next();
         if(user[i].equalsIgnoreCase(simon.get(i)))
           point++;
         else
         {
           score=-1;
           break;
          }
     }
     if(point==simon.size())
     {
       score++;
       if(score%20==0)
       {
          System.out.println("Level UP");
          level++;
       }
       System.out.println("Score: "+score);
       checksimon();
     }
   }
  public static void main(String ar[])throws Exception
  {
    Simonlogic s = new Simonlogic();
     s.checksimon();
     if(score==-1)
      System.out.println("You Lost");
  }
}