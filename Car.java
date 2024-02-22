package nb.test.gamepackagev1;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Car 
{//start class
    //data members
private int x = 0;
private int y = 0;
 public Car (int x , int y)
 {//start Car constructor method
     this.x = x;
     this.y = y;
 }//end Car method
public void show(Graphics g)
{//start show
    //car body
    g.setColor(Color.GRAY);
   g.fillRect(x+100, y+0, 200, 100);
   g.fillRect(x+200, y+50, 150, 50);
   //car wheels
   g.setColor(Color.BLACK);
   g.fillOval(x+100, y+80, 50, 40);
   g.fillOval(x+300, y+80, 50, 40);
   //car windows
   g.setColor(Color.WHITE);
    g.fillRect(x+250, y+0, 45, 45);
}//end show
public int getX()
{
    return x;
}//end getX
public void setX(int newX)
{
    x = newX;
}//end setX
}//end class