import javax.swing.JOptionPane;
public class BadDate{
public static void main(String args[]){
String yearString;
String monthString;
String dayString;
int year;
int month;
int day;
boolean validDate = true;
final int MIN_YEAR = 0, MIN_MONTH = 1, MAX_MONTH = 12, MIN_DAY = 1, MAX_DAY = 31;

      yearString = JOptionPane.showInputDialog("Enter a year: ");
        year = Integer.parseInt(yearString);

      monthString = JOptionPane.showInputDialog("Enter a Month: ");
        month = Integer.parseInt(monthString);

      dayString = JOptionPane.showInputDialog("Enter a day: ");
        day = Integer.parseInt(dayString);

// This is the work of the detailLoop() method, Check to be sure date is valid
if( year <= MIN_YEAR ) // invalid year
validDate = false;
else if ( month < MIN_MONTH || month > MAX_MONTH ) // invalid month
validDate = false;
else if ( day < MIN_DAY || day > MAX_DAY ) // invalid day
validDate = false;
// This is the work of the endOfJob() method, 
// Test to see if date is valid and output date and whether it is valid or not
if( validDate == true )
{
  System.out.println(month + "/" + day + "/" + year + " is a valid date.");
}
else
{
  System.out.println(month + "/" + day + "/" + year +" is an Invalid Date");
}
} // end of main() method
} // end of BadDate class
