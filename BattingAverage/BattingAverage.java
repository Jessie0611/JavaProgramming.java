import javax.swing.*;
public class BattingAverage{
public static void main(String args[]){
    final int ARRAY_SIZE = 8;
    double averages[] = new double[ARRAY_SIZE];
    int loopIndex;
    double battingAverage;
    String averageString;
    double min, max;
    double total = 0;
    double average;

        averageString = JOptionPane.showInputDialog("Enter a batting average: ");
        battingAverage = Double.parseDouble(averageString);
        // Assign the first element in the array to be the minimum and the maximum.
        min = battingAverage;
        max = battingAverage;
        total += battingAverage;

    for (loopIndex = 1; loopIndex < ARRAY_SIZE; loopIndex++) {
        averageString = JOptionPane.showInputDialog("Enter batting average ");
        battingAverage = Double.parseDouble(averageString);
        averages[loopIndex] = battingAverage;

        if (averages[loopIndex] < min)
        {
            min = averages[loopIndex];
        }
        if (averages[loopIndex] > max)
        {
            max = averages[loopIndex];
        }
    }

        average = total / ARRAY_SIZE;

        // Print min, max, and average
        System.out.println("Minimum Batting Average: " + min);
        System.out.println("Maximum Batting Average: " + max);
        System.out.println("Average Batting Average: " + average);

        System.exit(0);
    }
}