/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challangerunner;

import com.stan.challanges.ScrabbleChallange;
import java.util.Scanner;

/**
 *
 * @author stachu
 */
public class ChallangeRunner {

    private static Scanner _input;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        _input = new Scanner(System.in);
        boolean completedEntries = false;
	while (!completedEntries)
	{
            try
            {
		int choice = printMenu();
		switch(choice)
		{
                	case 1:
                            runScrabbleChallange();
                            break;
                        case 11:
                        default:
                            //quit
                            completedEntries = true;
		}
	    }
            catch (Exception ex)
            {
		System.out.println("Error: please try again..." + ex.getMessage());
            }
        } 
    }
    public static int printMenu()
    {
        System.out.println("Enter 1 to run ScrabbleChallange");
	System.out.println("Enter 11 to quit");
	return Integer.parseInt(_input.nextLine());
    }
    private static void runScrabbleChallange()
    {
        Scanner scan = null;
        scan = new Scanner(System.in);
        System.out.println("Input in format {\"word 1\",  \"word 2\", ...}: ");
        String userInput =  scan.nextLine();
        ScrabbleChallange sc = new ScrabbleChallange(userInput);
        System.out.println("Output: " + sc.winnerWord());
    }
    
}
