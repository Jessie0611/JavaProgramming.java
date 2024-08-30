public class Payroll{
	public static void main(String args[]){
		double salary = 1250.00;
		double stateTax;
		double federalTax;
		double numDependents = 2;
		double dependentDeduction;
		double totalWithholding;
		double takeHomePay;

        stateTax = salary * 0.065;
		System.out.println("State Tax: $" + stateTax);
		
        federalTax = salary * 0.28;
		System.out.println("Federal Tax: $" + federalTax);

		dependentDeduction = salary * 0.025 * numDependents;
		System.out.println("Dependents: $" + dependentDeduction);

		totalWithholding = stateTax + federalTax;
		takeHomePay = salary - totalWithholding + dependentDeduction;
		System.out.println("Salary: $" + salary);
		System.out.println("Take Home Pay: $" + takeHomePay);
		System.exit(0);
	}
}