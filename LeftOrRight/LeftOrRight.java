// LeftOrRight.java - This program calculates the total number of left-handed andright-handed
// Input: L for left-handed; R for right handed; X to quit.
// Output: Prints the number of left-handed students and the number of right-handed students.
import javax.swing.JOptionPane;
public class LeftOrRight
{
public static void main(String args[])
{
String leftOrRight = ""; //
int rightTotal = 0;
int leftTotal = 0;
// This is the work done in the housekeeping() method
leftOrRight = JOptionPane.showInputDialog("Enter L if you are left-handed, R if you are right-handed or X to quit.");
// Write your loop here.
while(leftOrRight = "L" || "R")
{
    if leftOrRight = "L",  leftTotal++;
    if leftOrRight = "R",  rightTotal++;
}
// This is the work done in the endOfJob() method
// Output number of left or right-handed students.
    System.out.println("Number of left-handed students: " + leftTotal);
    System.out.println("Number of right-handed students: " + rightTotal);
System.exit(0);
} 
}
