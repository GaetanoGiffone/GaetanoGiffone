package nb.test.gamepackagev1;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class House 
{//start class
    public static final Color brown = new Color(153,102,0);
    //data members
private int x = 0;
private int y = 0;
 public House (int x , int y)
 {//start House constructor method
     this.x = x;
     this.y = y;
 }//end House method
public void show(Graphics g)
{//start show
 Polygon house = new Polygon();
 house.addPoint(x+200, y+400);
 house.addPoint(x+150, y+450);
 house.addPoint(x+150,y+500);
 house.addPoint(x+250,y+500);
 house.addPoint(x+250,y+450);
    g.setColor(brown);
g.fillPolygon(house); 
g.setColor(Color.WHITE);
g.fillRect(x+220, y+450, 20, 20);
g.fillRect(x+170, y+450, 20, 20);
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