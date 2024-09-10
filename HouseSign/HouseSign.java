// HouseSign.java - This program calculates prices for custom house signs.
public class HouseSign{
public static void main(String args[]){
double charge = 0.00;
String color = "gold";
String wood = "oak";
int character = 8;

charge = 35.00;

if (wood.equals("oak")){
    charge += 20.00;
}
if (color.equals("gold")){
    charge += 15.00;
}
if (character > 5){
    int extraCharge = character - 5;
    charge += extraCharge * 4;
}

System.out.println("The charge for this sign is $" + charge);
System.exit(0);
}
}
