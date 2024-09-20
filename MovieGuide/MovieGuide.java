import javax.swing.JOptionPane;
public class MovieGuide{
public static void main(String args[]){
double numStars, averageStars;
String numStarsString;
double totalStars = 0;
int numPatrons = 0;

 numStarsString = JOptionPane.showInputDialog("Enter star rating: ");
    numStars = Double.parseDouble(numStarsString);
// Write while loop here
while(numStars >= 0)
{
    totalStars += numStars;
    numPatrons++;
    averageStars = totalStars / numPatrons;
    
    numStarsString = JOptionPane.showInputDialog("Enter star rating: ");
    numStars = Double.parseDouble(numStarsString);

    System.out.println("Average Star Value: " + averageStars);
}
System.exit(0);
}
}
