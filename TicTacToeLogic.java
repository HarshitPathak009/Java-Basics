//improve the logic
import java.io.*;
class TicTacToeLogic
{
  String board[][]={{" "," "," "},{" "," "," "},{" "," "," "}};
  char player[]={'X','O'};
  int start=0;
  boolean full()
  {
    boolean flg = true;
    for(int i=0;i<3;i++)
      for(int j=0;j<3;j++)
      if(board[i][j].equalsIgnoreCase(" "))
      {
        return false;
      }
     return true; 
  }
  boolean check(int i, int j)
  {
    if(board[i][j].equals(board[i][(j+1)%3])&&board[i][j].equals(board[i][(j+2)%3])||
board[i][j].equals(board[(i+2)%3][j])&&board[i][j].equals(board[(i+1)%3][j])||
board[i][j].equals(board[(i+1)%3][(j+1)%3])&&board[i][j].equals(board[(i+2)%3][(j+2)%3]))
      return true;
    else
      return false;
  }
  void add()
  {
    try
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter a the position");
     int i = Integer.parseInt(br.readLine());
     int j = Integer.parseInt(br.readLine());
     if(board[i][j].equalsIgnoreCase(" "))
       board[i][j] = Character.toString(player[(start++)%2]);
     else
       System.out.println("Enter again");
     display();
     if(check(i,j)&&start!=0)
     {
       System.out.println(player[(--start)%2]+" Wins");
     }
     else
     {
     if(full())
     {
       System.out.println("It's a Draw");
     }
     else
     add();
    }
    }
    catch(Exception e){}
  }
  void display()
  {
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
         System.out.print("| "+board[i][j]+" |");
      }
      System.out.println("\n --    --   -- ");
    }
  }
  public static void main(String ar[])throws IOException
  {
    TicTacToeLogic obj = new TicTacToeLogic();
     obj.add();
  }
}