//Gaetano Giffone
package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class NBTestGamePackageV1 extends DrawableAdapter
{  // start class 
    static NBTestGamePackageV1 ge = new NBTestGamePackageV1(); 
    static GameBoard gb = new GameBoard(ge, "Guy's Happy Town");
    static Sun sole = new Sun(1,1);
    static Sun sole2 = new Sun(1,1);
    static Moon luna = new Moon(1,1);
    static House home = new House(1,1);
    static JackO jack = new JackO(5,360);
    static JackO jill = new JackO(-90,360);
    static JackO jen = new JackO(-50,340);
    static Car honk = new Car(100,200);
    static Grave grave1 = new Grave(350,300);
    static Grave grave2 = new Grave(300,370);
    static Grave grave3 = new Grave(240,350);
    static Grave grave4 = new Grave(200,300);
    static Ghost boo1 = new Ghost(300,300);
    static Ghost boo2 = new Ghost(200,300);
    static Ghost boo3 = new Ghost(100,300);
    static Ghost boo4 = new Ghost(1,350);
    public static void main(String[] args) 
    { // start main    
          showGameBoard(gb);
          
    }   //end main
    public void draw(Graphics g)
    {// start draw
         int y;
         int x;
    //ground
    g.setColor(Color.GREEN);
    g.fillRect(0, 300, 500, 500);
    
    //sky
     g.setColor(Color.CYAN);
    g.fillRect(0, 10, 500, 200);
    
    //House
    home.show(g); 
    
    
    
    //Sole
    x=sole.getX();
    x=x+1;
    sole.setX(x);
    sole.show(g);
    
    //Road
    g.setColor(Color.BLACK);
    g.fillRect(0, 200, 500, 100);
    g.setColor(Color.YELLOW);
    g.fillRect(10, 230, 70, 40);
    g.fillRect(100, 230, 70, 40);
    g.fillRect(200, 230, 70, 40);
    g.fillRect(300, 230, 70, 40);
    g.fillRect(400, 230, 70, 40);
    //Car
    honk.getX();
    x=x+1;
    honk.setX(x);
    honk.show(g); 
    if (sole.getX() >= 500) //start if
            {
                //sky at night
     g.setColor(Color.DARK_GRAY);
    g.fillRect(0, 10, 500, 200);
    //moon comes out
    x=luna.getX();
    x=x+1;
    luna.setX(x);
    luna.show(g);
    
    //Ghost
 boo1.getY();
    y = 1 - x;
    boo1.setY(y);
    boo1.show(g);
    
     boo2.getY();
    y = 1 - x;
    boo2.setY(y);
    boo2.show(g);
    
     boo3.getY();
    y = 1 - x;
    boo3.setY(y);
    boo3.show(g);
    
     boo4.getY();
    y = 1 - x;
    boo4.setY(y);
    boo4.show(g);
    
 if (luna.getX() >= 800)
 {g.setColor(Color.CYAN);
    g.fillRect(0, 10, 500, 200);
     x=sole2.getX();
    x=x+1;
    sole2.setX(x);
    sole2.show(g);
    //Car
    honk.getX();
    x=x+1;
    honk.setX(x);
    honk.show(g); 
 }
    }//End if
    
   //JackO
    jack.show(g); 
    jill.show(g);
    jen.show(g);
    
    //Grave
    grave1.show(g);
    grave2.show(g);
    grave3.show(g);
    grave4.show(g);
    
    }// end draw
    
}// end class
 
