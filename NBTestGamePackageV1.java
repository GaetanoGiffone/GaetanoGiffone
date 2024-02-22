//Gaetano Giffone's Project 1
package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*;
import java.awt.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class NBTestGamePackageV1 extends DrawableAdapter
{  // start class 
    static NBTestGamePackageV1 ge = new NBTestGamePackageV1(); 
    static GameBoard gb = new GameBoard(ge, "Guy's Amazing Not Tilted Octagon");
    static Scanner kb = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("##.000"); 
    
    public static void main(String[] args) 
    { // start main    
          showGameBoard(gb);
          //promt the user
        System.out.println("Enter the length of the sides");
        //the number for person to enter side length
    int side = kb.nextInt();
    //The area formula
    double area = 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2); 
    System.out.println("The Area of the octagon is " + df.format(area));
    }   //end main
    public void draw(Graphics g)
    {// start draw
        //extra color for fun
        Graphics2D g2d = (Graphics2D)g;
        Color color1 = Color.GREEN;
        Color color2 = Color.BLACK;
        GradientPaint gp = new GradientPaint(0,100,color1,0,300,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, 500, 500);
                //the Polygon connect the dots game
    Polygon octa = new Polygon();
octa.addPoint(200,150); 
octa.addPoint(300,200);
octa.addPoint(350,300);  
octa.addPoint(300,400);  
octa.addPoint(200, 450);  
octa.addPoint(100,400);  
octa.addPoint(70,300);  
octa.addPoint(100,200);  
//some extra color 
g.setColor(Color.BLUE);
g.fillPolygon(octa); 
     
    
    
    }// end draw
    
}// end class
 
