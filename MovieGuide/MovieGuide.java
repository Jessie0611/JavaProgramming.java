import javax.swing.JOptionPane;
public class MovieGuide{
public static void main(String args[]){
double numStars, averageStars;
String numStarsString;
double totalStars = 0;
int numPatrons = 0;
// This is the work done in the detailLoop() method
// Convert to double.
// Write while loop here
numStars = JOptionPane.showInputDialog("Enter star rating:");

while(numStars >= 0; numStars <= 5){
    totalStars += numStars;
    numPatrons++;
}

averageStars = totalStars / numPatrons;

System.out.println("Average Star Value: " + averageStars);
System.exit(0);
}
}
