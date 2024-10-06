import javax.swing.*;
public class JumpinJive{
    public static void main(String args[]) throws Exception{
        String addIn;
        final int NUM_ITEMS = 5;
        String addIns[] = {"Cream", "Cinnamon", "Chocolate", "Amaretto", "Whiskey"};
        double addInPrices[] = {.89, .25, .59, 1.50, 1.75};
        boolean foundIt;
        double orderTotal = 2.00; // All orders start with a 2.00 charge
        String FINISH = "XXX";

        addIn = JOptionPane.showInputDialog("Enter coffee add-in or XXX to quit: ");

        while (!addIn.equals(FINISH)) { // while user does not enter "XXX" to complete order.
            foundIt = false; // initialize foundIt

            for (int x = 0; x < NUM_ITEMS; x++) { // Loop through addIns
                if (addIn.equals(addIns[x])) {
                    foundIt = true; //When user enters in a correct item, it finds it in array to add to order.
                    orderTotal += addInPrices[x]; //Combine parallel arry to add correct prices to total
                    System.out.println("The price to add in " + addIn + " is " + addInPrices[x]);
                    break;
                }
            }

            if (!foundIt) {
                System.out.println("Sorry, we do not carry that.");
            }
			//Ask for any other addIns
            addIn = JOptionPane.showInputDialog("Enter coffee add-in or XXX to quit: "); 
        }
        System.out.println("Your total order cost is: $" + orderTotal);
    }
}