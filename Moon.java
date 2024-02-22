
package nb.test.gamepackagev1;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Moon
{//start class
    //data members
private int x = 0;
private int y = 0;
 public Moon (int x , int y)
 {//start Moon constructor method
     this.x = x;
     this.y = y;
 }//end Moon method
public void show(Graphics g)
{//start show
    //Moon
    g.setColor(Color.white);
    g.fillOval(x+1,y+1,100,100); 

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