package nb.test.gamepackagev1;
import java.awt.*;

public class ball
{//start class
    //data members
private int x = 0;
private int y = 0;
 public ball(int x , int y)
 {//start Snowpeople constructor method
     this.x = x;
     this.y = y;
 }//end snowpeople method
public void show(Graphics g)
{//start show
    
    //make ball
    g.fillOval(x+100, y+100, 30, 30);
    g.setColor(Color.GREEN);
    
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
