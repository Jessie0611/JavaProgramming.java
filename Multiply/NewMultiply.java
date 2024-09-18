public class NewMultiply{
public static void main(String args[]){
String head1 = "Number: ";
String head2 = "Multiplied by 2: ";
String head3 = "Multiplied by 10: ";
int numberCounter;
int byTen, byTwo;
final int NUM_LOOPS = 10;

System.out.println("0 through 10 multiplied by 2 and by 10" + "\n");
// Write for loop
for(numberCounter = 0; numberCounter <= NUM_LOOPS; numberCounter++){
    byTwo = numberCounter * 2;
    byTen = numberCounter * 10;
    
    System.out.println(head1 + numberCounter);
    System.out.println(head2 + byTwo);
    System.out.println(head3 + byTen);
}

System.exit(0);
}
}