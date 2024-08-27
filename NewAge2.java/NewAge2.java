public class NewAge2 {
   public static void main(String args[]) {
      int currentAge = 33;
      int newAge;
      int currentYear = 2024;

      newAge = currentAge + (2050 - currentYear);

      System.out.println("My Current Age is " + currentAge);
      System.out.println("I will be " + newAge + " in 2050.");

      System.exit(0);
   }
}