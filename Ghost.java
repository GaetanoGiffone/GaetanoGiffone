package nb.test.gamepackagev1;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Ghost
{//start class
    //data members
private int x = 0;
private int y = 0;
 public Ghost (int x , int y)
 {//start constructor method
     this.x = x;
     this.y = y;
 }//end method
public void show(Graphics g)
{//start show
    g.setColor(Color.WHITE);
  Polygon ghost = new Polygon();
  ghost.addPoint(x+100, y+400);
  ghost.addPoint(x+100, y+450);
  ghost.addPoint(x+110, y+440);
  ghost.addPoint(x+120, y+450);
  ghost.addPoint(x+130, y+440);
  ghost.addPoint(x+140, y+450);
  ghost.addPoint(x+140, y+400);
  g.fillPolygon(ghost);
  
  g.setColor(Color.BLACK);
  g.fillOval(x+100, y+400, 10, 10);
  g.fillOval(x+120, y+400, 10, 10);
  g.fillOval(x+110, y+420, 10, 10);
//g.drawArc ( x+120, y+110, 10, 10, 0, 180 );
}//end show
public int getY()
{
    return y;
}

public void setY(int newY)
{
    y = newY;
}
public int getX()
{
    return x;
}//end getX
public void setX(int newX)
{
    x = newX;
}//end setX
}//end class