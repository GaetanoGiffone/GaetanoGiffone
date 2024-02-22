//Snowpeople class
//Guy Giffone
package nb.test.gamepackagev1;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;


public class Snowpeople 
{//start class
    //data members
private int x = 0;
private int y = 0;
 public Snowpeople (int x , int y)
 {//start Snowpeople constructor method
     this.x = x;
     this.y = y;
 }//end snowpeople method
public void show(Graphics g)
{//start show
    //ground
   // g.setColor(Color.GREEN);
  //  g.fillRect(0, 400, 500, 500);
    
    //sky
   //  g.setColor(Color.CYAN);
   // g.fillRect(0, 10, 500, 100);
    
    //make frothy
    g.setColor(Color.WHITE);
    g.fillOval(x+100,y+100,100,100); 
    g.fillOval(x+100, y+180, 100, 100);
    g.fillOval(x+100,y+250,100,100);
    g.setColor(Color.BLACK);
    //frothy's hat
    g.fillRect(x+100,y+80,100,50); 
    g.fillRect(x+130, y+40, 50, 70);
    
    
}//end show
public int getX()
{
    return x;
}//end getX
public void setX(int newX)
{
    x = newX;
}//end setX

public int getY()
{
    return y;
}

public void setY(int newY)
{
    y = newY;
}
}//end class