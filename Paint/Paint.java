public class Paint{
	public static void main(String args[]){
	   double height1 = 9;
	   double height2 = 9;
	   double width1 = 19.5;
	   double width2 = 20.0;
	   double squareFeet;	   
	   double numGallons;
       
	   squareFeet = (width1 * height1 + width2 * height2) * 2;
	   numGallons = squareFeet/150;
	   System.out.println("Number of Gallons: " + numGallons);
	   System.exit(0);
	}
}