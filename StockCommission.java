import java.util.Scanner;


public class StockCommission {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    
    final double dblFlatRate = 0.0425;
    
    double dblSharePrice;
    int intNumberOfShares;
    double dblStockCost;
    double dblCommission;
    double dblTotal;
    
    System.out.println("Enter the share price.");
    dblSharePrice = kb.nextDouble();
    while(dblSharePrice <= 0 || dblSharePrice > 500) {
      
      System.out.println("Share price must be greater than $0 and less than or equal to $500.");
      System.out.println("Enter the share price.");
      dblSharePrice = kb.nextDouble();
      
    }
    
    System.out.println("Enter the number of shares.");
    intNumberOfShares = kb.nextInt();
    while(intNumberOfShares < 100 || intNumberOfShares > 100000) {
      
      System.out.println("Number of shares must be between 100 and 100000.");
      System.out.println("Enter the number of shares.");
      intNumberOfShares = kb.nextInt();
      
    }
    
    dblStockCost = intNumberOfShares * dblSharePrice;
    dblCommission = dblStockCost * dblFlatRate;
    dblTotal = dblCommission + dblStockCost;
    
    System.out.printf("Cost of stocks: $%.2f%n", dblStockCost);
    System.out.printf("Commission: $%.2f%n",  dblCommission);
    System.out.printf("Total: $%.2f%n", dblTotal);
    
    kb.close();

  }

}
