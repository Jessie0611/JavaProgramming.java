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

    keepGoing = JOptionPane.showInputDialog("Do you want to guess a number? Enter Y or N");
    if (keepGoing.compareTo("Y") != 0) {
        keepGoing = JOptionPane.showInputDialog("Invalid Response. Please enter Y or N.");
    }

    while(keepGoing.compareTo("Y") == 0)
    {
    stringNumber = JOptionPane.showInputDialog("I'm thinking of a number. \n Try to guess by entering a number between 1 and 10");
    userNumber = Integer.parseInt(stringNumber);

    if(userNumber < 1 || userNumber > 10){
        stringNumber = JOptionPane.showInputDialog("Invalid Response. \n Try to guess by entering a number between 1 and 10");
        userNumber = Integer.parseInt(stringNumber);
    }
    if(userNumber == number){
        keepGoing = "N";
        System.out.println("You are a genius. That's correct!");
    }
    else{
        keepGoing = JOptionPane.showInputDialog("That's not correct. Do you want to guess again? Enter Y or N");
        if(keepGoing.compareTo("Y") != 0){
            keepGoing = JOptionPane.showInputDialog("Invalid Response. Please enter Y or N.");
        }
    }
}
System.exit(0);
} 
}
