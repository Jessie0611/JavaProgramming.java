import javax.swing.*;
public class BattingAverage{
public static void main(String args[]){
    final int ARRAY_SIZE = 8;
    Double averages[] = new double[ARRAY_SIZE];
    int loopIndex;
    double battingAverage;
    String averageString;
    double min, max;
    double total, average;

        averageString = JOptionPane.showInputDialog("Enter a batting average: ");
        battingAverage = Double.parseDouble(averageString);
        // Assign the first element in the array to be the minimum and the maximum.
    min = averages[0];
    max = averages[0];
// Start out your total with the value of the first element in the array.
    total = averages[0];
// Write a loop here to access array values starting with averages[1]
// Within the loop test for minimum and maximum batting averages.
// Also accumulate a total of all batting averages.
// Calculate the average of the 8 averages.
// Print the averages stored in the averages array.
// Print the maximum batting average, minimum batting average, and average batting average.
    System.exit(0);
    }
}