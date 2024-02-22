//Gaetano Giffone
package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*;
import java.awt.*;

public class NBTestGamePackageV1 extends DrawableAdapter
{  // start class 
    static NBTestGamePackageV1 ge = new NBTestGamePackageV1(); 
    static GameBoard gb = new GameBoard(ge, "Guy's Great Game!!!");
    static Snowpeople frothy = new Snowpeople (100,100);
    
    public static void main(String[] args) 
    { // start main    
          showGameBoard(gb);
          
    }   //end main
    public void draw(Graphics g)
    {// start draw
        frothy.show(g);
        
    }// end draw
    
    ////movimento con il Button
    public void rightButton()
    {//start rightbutton
        moveRight(frothy);
    }//end right button
    
     public void leftButton()
    {//start leftbutton
        moveLeft(frothy);
    }//end leftbutton
     
    public void upButton()
    {//start rightbutton
        moveUP(frothy);
    }//end upbutton
      
     public void downButton()
    {//start downbutton
        moveDown(frothy);
    }//end downbutton
     
    
    public void moveRight(Snowpeople aSnowman)
    {//start moveright
        int currentX;
        currentX=aSnowman.getX();
        currentX = currentX + 10;
        aSnowman.setX(currentX);
    }//end moveright
    
    public void moveLeft(Snowpeople aSnowman)
    {//start moveleft
        int currentX;
        currentX=aSnowman.getX();
        currentX = currentX - 10;
        aSnowman.setX(currentX);
    }//end moveleft
    
    public void moveUP(Snowpeople aSnowman)
    {//start moveup
        int currentY;
        currentY=aSnowman.getY();
        currentY = currentY - 10;
        aSnowman.setY(currentY);
    }//end moveup
    
    public void moveDown(Snowpeople aSnowman)
    {//start movedown
        int currentY;
        currentY=aSnowman.getY();
        currentY = currentY + 10;
        aSnowman.setY(currentY);
    }//end movedown
    
    ////movimento con il chiave

    public void keyStruck(char key)
    {//start keystruck
        switch (key)
        {//start switch
            case 'D': case 'd':
            {
                moveRight(frothy);
                break;
            }
            case 'A': case 'a':
            {
                moveLeft(frothy);
                break;
            }
            case 'W': case 'w':
            {
                moveUP(frothy);
                break;
            }
            case 'S': case 's':
            {
                moveDown(frothy);
                break;
            }
            
        }//end switch
    }//end key struck
}// end class
 