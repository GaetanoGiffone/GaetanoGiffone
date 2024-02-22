
package nb.test.gamepackagev1;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class JackO
{//start class
    //data members
private int x = 0;
private int y = 0;
 public JackO (int x , int y)
 {//start Jack constructor method
     this.x = x;
     this.y = y;
 }//end Jack method
public void show(Graphics g)
{//start show
    g.setColor(Color.ORANGE);
    g.fillOval(x+100, y+100, 20, 20);
    g.setColor(Color.BLACK);
    g.fillOval(x+102, y+105, 5, 5);
    g.fillOval(x+110, y+105, 5, 5);
    g.drawArc ( x+105, y+110, 6, 6, 0, -180 );
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