//Gaetano Giffone
package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*;
import java.awt.*;

public class NBTestGamePackageV1 extends DrawableAdapter
{  // start class 
    static NBTestGamePackageV1 ge = new NBTestGamePackageV1(); 
    static GameBoard gb = new GameBoard(ge, "Guy's Great Game!!!");
    static blocker left = new blocker(-100,100);
    static blocker right = new blocker(380,100);
    static ball gameBall = new ball(300,150);
    static boolean ballLeft = false;
    static boolean ballUP = false;
    static boolean ballDown = false;
    static boolean ballRight = false;
    static boolean gameStart = false;
    static int count = 0;
    static int wallCount = 0;
    static int ballSpeed = 5;
        
    public static void main(String[] args) 
    { // start main    
          showGameBoard(gb);
          
          
          
    }   //end main
    public void draw(Graphics g)
    {// start draw
        
        gb.setBackground(Color.cyan);
        //borders
        g.fillRect(0, 0, 500, 100);
        g.fillRect(0, 400, 500, 100);
        
        //the blockers and ball
          left.show(g,Color.BLUE);
          right.show(g,Color.RED);
          gameBall.show(g);
          

          ///top and bottom collisions
        int yl;
        int yr;
        int xl;
        int xr;
        yl = left.getY();
        yr = right.getY();
        xl = left.getX();
        xr = right.getX();
        
        ///left and right blocker's top coll
        if (yl <= 0)
        {
            moveDown(left);
        }
     if (yr <= 0)
        {
            moveDown(right);
            
        }
    //left and right blockers bottom coll
     if (yl >= 240)
        {
            moveUP(left);
            
        }
     if (yr >= 240)
        {
            moveUP(right);
            
        }//end of coll
     
         
     //ball y and x value checker
     int yb = gameBall.getY();
     int xb = gameBall.getX();
//     ////test
//     System.out.println(yb);
//     System.out.println(xb);
     //when the game is started movement
     if (count==1)
     {
         gameStart = true;
     }
     ///count how many times a wall is hit and turns off gameStart
     if (wallCount ==1)
     {
         gameStart = false;
     }
      if (gameStart)
    {
        ballLeft = true;
        ballUP = true;
    }
     ////coll for the ball bottom
     if (yb>=270)
     {
         ballUP = true;
         ballDown = false;    
         wallCount++;
         }
     ///coll for the ball top
     if (yb<=1)
     {
         ballDown = true;
         ballUP = false;
         wallCount++;
     }
     ///coll for blockers
     if (yl==yb && xl==xb || xl+30==xb && yl+30==yb || xl+25==xb && yl+25==yb || xl+20==xb && yl+20==yb || xl+15==xb && yl+15==yb  || xl+10==xb && yl+10==yb || xl+5==xb && yl+5==yb )
     {
         wallCount++;
         ballLeft = false;
         ballRight = true;
     }
     
     if (yr==yb && xr==xb || xr-30==xb && yr+30==yb || xr-25==xb && yr+25==yb || xr-20==xb && yr+20==yb || xr-15==xb && yr+15==yb  || xr-10==xb && yr+10==yb || xr-5==xb && yr+5==yb ) 
     {
         wallCount++;
         ballLeft = true;
         ballRight = false;
     }
          //boolean movement
     
     if (ballRight)
     {
         moveballRight(gameBall);
     }
     
          if (ballLeft)
     {
         moveballLeft(gameBall);
     }
     
         if (ballUP)
     {
         moveballUP(gameBall);
     }
         
         if (ballDown)
     {
         moveballDown(gameBall);
     }
     
     ///ends the game
     if (xb<=-100)
     {
     Font myFont2 = new Font ("Courier New", 1, 60);
     g.setFont (myFont2);
     g.drawString("Right Wins!!",70, 200);
    ballRight = false;
     }
     else if (xb>=600)
     {
     Font myFont2 = new Font ("Courier New", 1, 60);
     g.setFont (myFont2);
     g.drawString("Left Wins!!",70, 200);
    ballLeft = false;
     }
     
     ////the text for the count and for the controls
     Font myFont = new Font ("Courier New", 1, 30);
     g.setFont (myFont);
     String s=String.valueOf(count);
     g.drawString(s, 250, 70);
     Font myFont2 = new Font ("Courier New", 1, 15);
     g.setFont (myFont2);
     g.drawString("Press W for UP", 50, 450);
     g.drawString("Press S for Down", 50, 480);
     g.drawString("Press I for UP", 350, 450);
     g.drawString("Press K for Down", 350, 480);
    }// end draw
     
    public void upButton()
    {//start rightbutton
        moveUP(left);
        moveUP(right);
    }//end upbutton
      
     public void downButton()
    {//start downbutton
        moveDown(left);
        moveDown(right);
    }//end downbutton
     
     ////start of ball movement
    public void moveballRight(ball aBall)
    {//start moveright
        int currentX;
        currentX=aBall.getX();
        currentX = currentX + ballSpeed;
        aBall.setX(currentX);
    }//end moveright
     
   public void moveballLeft(ball aBall)
    {//start moveright
        int currentX;
        currentX=aBall.getX();
        currentX = currentX - ballSpeed;
        aBall.setX(currentX);
    }//end moveright
   
    public void moveballUP(ball aBall)
    {//start moveup
        int currentY;
        currentY=aBall.getY();
        currentY = currentY - ballSpeed;
        aBall.setY(currentY);
    }//end moveup
    
    public void moveballDown(ball aBall)
    {//start moveup
        int currentY;
        currentY=aBall.getY();
        currentY = currentY + ballSpeed;
        aBall.setY(currentY);
    }//end moveup
    ////end of ball movement
    
    public void moveRight(blocker aSide)
    {//start moveright
        int currentX;
        currentX=aSide.getX();
        currentX = currentX + 10;
        aSide.setX(currentX);
    }//end moveright

    
    public void moveLeft(blocker aSide)
    {//start moveleft
        int currentX;
        currentX=aSide.getX();
        currentX = currentX - 10;
        aSide.setX(currentX);
    }//end moveleft
    
    public void moveUP(blocker aSide)
    {//start moveup
        int currentY;
        currentY=aSide.getY();
        currentY = currentY - 10;
        aSide.setY(currentY);
    }//end moveup
    
    public void moveDown(blocker aSide)
    {//start movedown
        int currentY;
        currentY=aSide.getY();
        currentY = currentY + 10;
        aSide.setY(currentY);
    }//end movedown
    
    ////movimento con il chiave

    public void keyStruck(char key)
    {//start keystruck
        switch (key)
        {//start switch
            case 'W': case 'w':
            {
                moveUP(left);
                break;
            }
            case 'I': case 'i':
            {
                moveUP(right);
                break;
            }
            case 'K': case 'k':
            {
                moveDown(right);
                break;
            }
            case 'S': case 's':
            {
                moveDown(left);
                break;
            }
            
        }//end switch
    }//end key struck
    
    ////timer for the game plus game starts
    public void timer1()
    {
        count++;
        if (count>=30)
        {
        ballSpeed = 10;
        }
        if (count>=90)
        {
        ballSpeed = 12;
        }
    }
}// end class
 