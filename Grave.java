package nb.test.gamepackagev1;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Grave
{//start class
    //data members
private int x = 0;
private int y = 0;
 public Grave (int x , int y)
 {//start Grave constructor method
     this.x = x;
     this.y = y;
 }//end Grave method
public void show(Graphics g)
{//start show
    g.setColor(Color.GRAY);
    g.fillRect(x+100, y+100, 20, 20);
    
    Font font = new Font("Serif", Font.BOLD,10);
    g.setFont(font);
    g.setColor(Color.WHITE);
    g.drawString("RIP", x+100, y+110);
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