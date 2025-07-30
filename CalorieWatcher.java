import java.util.Scanner;

public class CalorieWatcher {

  public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    
    final byte bytMaxCookies = 40;
    final byte bytServings = 10;
    final short shtCaloriesInServe = 300;
    
    byte bytCookiesEaten;
    float fltServesConsumed;
    float fltTotalCalories;
    
    System.out.println("How many cookies have you eaten?");
    bytCookiesEaten = kb.nextByte();
    while (bytCookiesEaten > bytMaxCookies) {
      
      System.out.println("There are only 40 cookies in the bag.");
      System.out.println("How many cookies have you eaten?");
      bytCookiesEaten = kb.nextByte();
      
    }
    
    fltServesConsumed = (float)bytCookiesEaten / bytMaxCookies * bytServings;
    fltTotalCalories = fltServesConsumed * shtCaloriesInServe;
    System.out.println("You consumed " + fltTotalCalories + " calories when you ate " + bytCookiesEaten + " cookies.");
    
    kb.close();
    
  }

}
