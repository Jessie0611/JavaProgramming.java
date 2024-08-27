
import javax.swing.JOptionPane;
public class Temperature{
	public static void main(String args[]){
	     String fahrenheitString;
	     double fahrenheit;
	     double celsius;

	     fahrenheitString = JOptionPane.showInputDialog(
		"Enter Fahrenheit temperature: ");
	         fahrenheit = Double.parseDouble(fahrenheitString);
	     celsius = (fahrenheit - 32.0) * (5.0/9.0);
	     System.out.println("Fahrenheit temperature:" + 
                                fahrenheit);
	     System.out.println("Celsius temperature:" + celsius);
	     System.exit(0);
	}
}
	     
