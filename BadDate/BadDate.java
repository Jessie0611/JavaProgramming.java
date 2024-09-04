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

     if( year <= MIN_YEAR )
		validDate = false;
     else if ( month < MIN_MONTH || month > MAX_MONTH )
		validDate = false;
     else if ( day < MIN_DAY || day > MAX_DAY )
		validDate = false; 
     
     if( validDate == true )
     { 

     }
     else
     {
     System.out.println(month + "/" + day + "/" + year);
     }
   }
}
   	
