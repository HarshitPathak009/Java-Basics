import java.awt.*;
import java.applet.*;
public class helloapplet extends Applet
{
  public void init()
  {
    resize(300,300);
    setBackground(Color.red);
  }
  public void paint(Graphics g)
  {
    g.drawString("First Applet Program",150,150);
  }
}