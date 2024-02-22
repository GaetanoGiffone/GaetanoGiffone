
package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.DecimalFormat;


public class NBTestGamePackageV1 extends DrawableAdapter
{  // start class 
    static NBTestGamePackageV1 ge = new NBTestGamePackageV1(); 
  static GameBoard gb = new GameBoard(ge, "Calories");
    static Scanner kb = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("##.00");
    
    
    public static void main(String[] args) 
    { // start main
        int steps;
        double calories ;
        System.out.print("Enter Your steps taken! \n");
        steps = kb.nextInt();
        calories = steps * .04;
         // showGameBoard(gb);
          JOptionPane.showMessageDialog(null,"For every " + steps + " steps you take you will burn " + df.format(calories) + " calories");
          System.out.println("calories are equal to " + (df.format(calories)));
    }   //end main
    public void draw(Graphics g)
    {// start draw
           
            
    }// end draw
    
}// end class
 
