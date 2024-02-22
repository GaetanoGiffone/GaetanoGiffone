package nb.test.gamepackagev1;
import java.awt.*;

public class blocker
{//start class
    //data members
private int x = 0;
private int y = 0;
 public blocker(int x , int y)
 {//start Snowpeople constructor method
     this.x = x;
     this.y = y;
 }//end snowpeople method
public void show(Graphics g)
{//start show
    
    //make blocker
    g.fillRect(x+100, y+100, 30, 60);
    
}//end show

public void show(Graphics g, Color cc)
{//start show
    
    //make blocker
    g.fillRect(x+100, y+100, 30, 60);
    g.setColor(cc);
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
