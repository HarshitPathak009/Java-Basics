import java.awt.*;
import javax.swing.*;
class line extends JFrame
{
  line()
 {
   setTitle("Graph");
   setSize(960,960);
   setVisible(true);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 public void paint(Graphics g)
 {
   g.setColor(Color.red);
   g.drawLine(0,480,960,480);
   g.setColor(Color.green);
   g.drawLine(0,0,960,960);
 }
  public static void main(String ar[])
  {  
     line obj = new line();
  }
}