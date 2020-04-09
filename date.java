import java.util.*;
class date
{
  public static  void main(String ar[])
 {
   Date d = new Date(25,8,2010);
   String arg[] = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
  System.out.println(" "+arg[d.getDay()]); 
 }
}