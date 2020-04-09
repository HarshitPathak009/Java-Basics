import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calc extends JFrame implements ActionListener
{
   static int r1=0;
   String s="";
   static ArrayList<String>  c = new  ArrayList<String>();
  JButton num[] = new JButton[10];
  JButton display = new JButton();
  JButton operations[] = new JButton[5];  
  void setFrame()
  {
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,650);
    setLayout(new BorderLayout());
    JPanel p1 = new JPanel(new GridLayout(5,3));
    JPanel p = new JPanel(new GridLayout(1,1));
    display.setFont(new Font("Arial",Font.BOLD,72));  
    display.setText(s+" ");  
    display.setBackground(Color.GRAY);
    p.add(display);
    add(p,BorderLayout.NORTH);
    add(p1,BorderLayout.CENTER);
    String symbol[] = {"+","-","*","/","="};
    for(int i=2;i<5;i++)
   {
     operations[i] = new JButton();
     operations[i].setText(""+symbol[i]);
     operations[i].setActionCommand(symbol[i]);
     operations[i].addActionListener(this); 
     operations[i].setFont(new Font("Arial",Font.PLAIN,36));
     p1.add(operations[i]);
   }
    for(int i=9;i>=1;i--)
   {
     num[i] = new JButton();
     num[i].setText(""+i);
    num[i].setFont(new Font("Arial",Font.PLAIN,36));
     num[i].setActionCommand(""+i);
     num[i].addActionListener(this); 
     p1.add(num[i]);
   }
     operations[0] = new JButton();
     operations[0].setText(""+symbol[0]);
    operations[0].setFont(new Font("Arial",Font.PLAIN,36));
     operations[0].setActionCommand(symbol[0]);
     operations[0].addActionListener(this); 
     p1.add(operations[0]);
     num[0] = new JButton();
     num[0].setText(""+0);
    num[0].setFont(new Font("Arial",Font.PLAIN,36));
     num[0].setActionCommand(""+0);
     num[0].addActionListener(this); 
     p1.add(num[0]);
     operations[1] = new JButton();
     operations[1].setText(""+symbol[1]);
    operations[1].setFont(new Font("Arial",Font.PLAIN,36));
     operations[1].setActionCommand(symbol[1]);
     operations[1].addActionListener(this); 
     p1.add(operations[1]);
  }
  public void actionPerformed(ActionEvent e)
  { 
    int r2=0;
   if(e.getActionCommand().charAt(0)!='=')
   display.setText(s+""+e.getActionCommand());
   s+=e.getActionCommand();
    if(Character.isDigit(e.getActionCommand().charAt(0)))
       r2 = Character.getNumericValue(e.getActionCommand().charAt(0));
    else{
      char symbol = e.getActionCommand().charAt(0);
      switch(symbol)
      {
         case '+':
            r1 = r1+r2;
           break; 
         case '-':
            r1 = r1-r2;
           break;
         case '*':
            r1 = r1*r2;
           break;
         case '/':
            r1 = r1/r2;
           break;
          default:
            r1 = r2;
           break;
      }
    s=Integer.toString(r1);
   }
  }
  public static void main(String ar[])
  {
    calc obj = new calc();
    obj.setFrame();
  }
}