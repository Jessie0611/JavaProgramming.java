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
    for(loopIndex = 1; loopIndex < ARRAY_SIZE; loopIndex++)
    {
        if (averages[loopIndex] < min)
        {
            min = averages[loopIndex];
        }
        if (averages[loopIndex] > max)
        {
            max = averages[loopIndex];
        }
        //accumlate total of all batting averages
    }
// Calculate the average of the 8 averages.

// Print the averages stored in the averages array. --need a loop to do this
// Print the maximum batting average, minimum batting average, and average batting average.
    System.exit(0);
    }
}