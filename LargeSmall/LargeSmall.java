public class LargeSmall{
public static void main(String args[]){
    int num1 = -50;
    int num2 = 53;
    int num3 = 78;
    int largest;
    int smallest;

    largest = num1;
    smallest = num1;
    
if (num2 > largest){
    largest = num2;
}
if (num3 > largest){
    largest = num3;
}
else largest = num1;

if (num2 < smallest){
    smallest = num2;
}
if (num3 < smallest){
    smallest = num3;
}
else smallest = num1;

System.out.println("The largest value is " + largest);
System.out.println("The smallest value is " + smallest);
}
}
