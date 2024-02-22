/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb.test.gamepackagev1;
import java.awt.*;

public class House2 {
     private int x=0;
     private int y=0;
     private boolean visible = true;

  public House2(int x, int y)
  {// start House constructor method
      this.x = x;
      this.y = y;
}
  public void show(Graphics g)
  {// start show
     g.setColor(Color.blue);
      g.fillRect(x+300,y+100,300,360);
  }// end show
   public int getX()
 {
 return x;
 }
 public void setX(int newX)
 {
 x = newX;
 }
 
    public boolean getVisible()
    {
    return visible;
    }

 public void setVisible(boolean newVisible)
    {
    visible = newVisible;
    }

}// end class