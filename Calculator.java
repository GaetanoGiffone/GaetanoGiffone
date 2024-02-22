package calculator;
import java.util.Scanner;
import javax.swing.*;


public class Calculator 
{//start calculator
static Scanner kb = new Scanner(System.in);
    static int num1;
    static double num2;
    static int choice;
    static String s1;
    static int s2;
    static int x;
    static double y;
    public static void main(String[] args) 
    {//start main
        //boolean
        boolean done = false; //true when 5 or e is picked
        




       
        ////switch statement + while loop
        while(!done)
        {//start while
            ////input for choice
        s1 = JOptionPane.showInputDialog("Choose\n 1 or a to add\n 2 or s to subract\n 3 or m to multiply\n 4 or d to divide\n 5 or e to exit ");
        s1 = s1.toLowerCase();
        choice = s1.charAt(0);
        
        ////pick numbers
       System.out.println("Enter first number");
        num1 = kb.nextInt();
        System.out.println("Enter second number");
        num2 = kb.nextDouble();
        int x = num1;
        double y = num2;
        
       switch (choice)
               {///start switch
           case '1': case 'a':
           {//start case 1
           //add
          Add(x,y);
           break;
           }//end case 1
       case '2': case 's':
       {//start case 2
       //subtract
          double answer = Subtract(x,y);
          System.out.println("The difference is " + answer);
          break;
    }//end case 2
          case '3': case 'm':
          {//start case 3
             //multiply
          Multiply(x,y); 
          break;
          }//end case 3
          case '4': case 'd':
          {//start case 4
               //division
          double result = Division(x,y);
          System.out.println("The division of the numbers is " + result);
          break;
          }//end case 4
          case '5': case 'e':
          {
              done = true;
              System.out.println("Thank you for using Guy's Calculator");
              break;
          }
          default:
          {//start default
              System.out.println("Out of Bounds");
          }//end default
       }//end while
       }//end select
       
       
             ////If statement   
//        if ((choice == '1') || (choice == 'a') || (choice == 'A'))
//        {//start if
//          //add
//          Add(x,y);
//        }// end if
//        else if ((choice == '2') || (choice == 'b'))
//                {//start else if
//                    //subtract
//          double answer = Subtract(x,y);
//          System.out.println("The difference is " + answer);
//                } //end else if
//        else if ((choice == '3') || (choice == 'c'))
//        {//start else if
//             //multiply
//          Multiply(x,y);
//        }//end else if
//        else if ((choice == '4') || (choice == 'd'))
//        {//start else if
//            //division
//          double result = Division(x,y);
//          System.out.println("The division of the numbers is " + result);
//        } //end else if
//        else
//        {//start else
//            System.out.println("Out of Bounds");
//        }//end else
          

        ////pick choice of expression
        
        ////scanner type for choice
        //System.out.println("choose 1 to add, 2 to subract, 3 to multiply, 4 to divide");
        //choice = kb.nextInt();
        
        
        
        
        ////attempt to parse s1 into number
        //s2 = JOptionPane.showInputDialog("Choose the first number");
       // num1 = Integer.parseInt(s2);
        
       // s2 = JOptionPane.showInputDialog("Choose Second number");
       // num2 = Double.parseDouble(s2);
          
    }   //end main
     
    
    public static void Add(int x , double y)
    {//start Add
        double Sum;
        Sum = x+y;
        System.out.println("The Sum is " + Sum);
    }//end Add
    
    
    public static double Subtract(int x, double y)
    {//start Subtract
        
        double result;
        result = x-y;
        return result;
        
    }//end Subtract
  
    public static void Multiply(int x, double y)
    {//start multiply
        double Sum = x*y;
        System.out.println("The two numbers mutiplied are " + Sum );
    }//end multiply
    
    public static double Division(int x, double y)
    {//start division
     double result;
     result = x/y;
     return result;
            
    }//end division
}//end of Calculator
