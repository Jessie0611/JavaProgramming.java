import javax.swing.JOptionPane;
public class GuessNumber
{
public static void main(String args[])
{
int number;
int userNumber;
String stringNumber;
String keepGoing;
number = 1 + (int) (Math.random() * 10); // Generate random number.
// Prime the loop.
keepGoing = JOptionPane.showInputDialog("Do you want to guess a number?
Enter Y or N");
// Validate input.
// Enter loop if they want to play.
while(keepGoing.compareTo("Y") == 0)
{
stringNumber = JOptionPane.showInputDialog("I'm thinking of a number. .\n Try to guess by entering a number between 1 and 10");
userNumber = Integer.parseInt(stringNumber);
// Validate input.


// Test to see if the user guessed correctly.
if(userNumber == number)
{
keepGoing = "N";
System.out.println("You are a genius. That's correct!");
}
else
{
keepGoing = JOptionPane.showInputDialog("That's not
correct. Do you want to guess again? Enter Y or N");
// Validate input.
}
} // End of while loop.
System.exit(0);
} // End of main() method.
} // End of GuessNumber class.
