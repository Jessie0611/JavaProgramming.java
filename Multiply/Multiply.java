public class Multiply{
public static void main(String args[]){
String head1 = "Number: ";
String head2 = "Multiplied by 2: ";
String head3 = "Multiplied by 10: ";
int numberCounter;
int byTen, byTwo;
final int NUM_LOOPS = 10; // Constant used to control loop.

System.out.println("0 through 10 multiplied by 2 and by 10" + "\n");
numberCounter = 0;
while (numberCounter <= 10){
    byTwo = numberCounter * 2;
    byTen = numberCounter * 10;

System.out.println(head1 + numberCounter);
System.out.println(head2 + byTwo);
System.out.println(head3 + byTen);
numberCounter++; // Next number.
}
System.exit(0);
}
}