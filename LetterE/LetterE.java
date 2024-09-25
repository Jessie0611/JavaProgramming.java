// LetterE.java - This program prints the letter E with 3 asterisks across and 5 asterisks down.
public class LetterE
{
public static void main(String args[])
{
final int NUM_ACROSS = 3;
final int NUM_DOWN = 5;
int row;
int column;
// Write a loop to control the number of rows.
for(row = 1; row <= NUM_DOWN; row++)
{
    // Write a loop to control the number of columns
    for(column = 1; column <= NUM_ACROSS; column++)
    {
// Decide when to print an asterisk in every column.
        if (row == 1 || row == (1+NUM_DOWN)/2 || row == NUM_DOWN)
        {
                // more general representation of the middle row instead of using "3".
            System.out.print("*");
        }
        else if (column == 1)
        {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }
    } //takes care of column
    System.out.println();
} //includes prints new line, rows
System.exit(0);
}
}
