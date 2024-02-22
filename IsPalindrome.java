package ispalindrome;
import java.util.*;

public class IsPalindrome 
{//start class

    public static void main(String[] args) 
    {//start main
        long startTime = System.nanoTime();
        //scanner input
        //Scanner scanner = new Scanner(System.in);
        
        //user prompt
        //System.out.print("Enter a Word or set of Numbers:   ");
        //String userInput = scanner.nextLine();
        //String s = userInput;
String s = "p".repeat(10001);
        
        
        
        //If statment for displaying the result
if (paladromeCheck(s)) 
        {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
long endTime   = System.nanoTime();
long totalTime = endTime - startTime;
System.out.println(totalTime);
    }//end main
    
    public static boolean paladromeCheck(String s)
    {//start check
        //the start and end of the string
        int i = 0;
        int j = s.length() - 1;

        int x = s.length() % 2;
        
        //the while statment that checks each character until it reaches the middle
        if (x == 0)
        {
            return false;
        }
        else
        {
        while (i<j)
        {
                
            
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
             
    }//end check
    }    
}//end class
