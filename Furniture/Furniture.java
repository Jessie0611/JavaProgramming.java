public class Furniture{
	public static void main(String args[]){
		String itemName = "TV Stand";
		double retailPrice = 325.00;
		double wholesalePrice = 200.00;
		double salePrice;
		double profit;
		double saleProfit;
        
        profit = retailPrice - wholesalePrice;
        salePrice = retailPrice * (1 - 0.25);
        saleProfit = salePrice - wholesalePrice;

		System.out.println("Item Name: " + itemName);
		System.out.println("Retail Price: $" + retailPrice);
		System.out.println("Wholesale Price: $" + wholesalePrice);
		System.out.println("Profit: $" + profit);	
		System.out.println("Sale Price: $" + salePrice);
		System.out.println("Sale Profit: $" + saleProfit);
		System.exit(0);
		System.exit(0);
	}
}