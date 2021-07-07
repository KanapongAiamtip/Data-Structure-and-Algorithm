import static java.lang.System.out;
import java.util.Scanner;
import java.util.HashSet;

public class Coffee {
  public static void main(String[] args) {
    int price[] = { 0, 50, 60, 70, 85 };
    HashSet<String> coupon = new HashSet<String>();
    coupon.add("A001");
    coupon.add("A002");
    coupon.add("A003");
    coupon.add("A004");
    coupon.add("A005");
    coupon.add("A006");
    coupon.add("A007");
    coupon.add("A008");
    coupon.add("A009");
    coupon.add("A010");
    menu();
    int choice = inputChoice();
    while (choice != 6) {
      String data = "";
      if (choice >= 1 && choice <= 5) {
        data = (String) input();
        if (data.equalsIgnoreCase("N")) {
          out.println("Totals : " + price[choice] + " bath");
        } else if (coupon.contains(data)) {
          out.println("Totals : " + price[choice] * 0.9 + " bath");
          coupon.remove(data);
        } else {
          out.println("Totals : " + price[choice] + " bath");
        }
      } else {
        out.println("== Wrong choice ==");
      }
      menu();
      choice = inputChoice();
    }
    out.println("=== Good Bye ===");
  }

  private static void menu() {
    out.println("----- Coffee List -----");
    out.println("1 Thai Coffee ---- 50 Bath");
    out.println("2 Latte       ---- 60 Bath");
    out.println("3 Espresso    ---- 70 Bath");
    out.println("4 Mocha       ---- 80 Bath");
    out.println("5 Cappuccino  ---- 85 Bath");
    out.println("[6] Quit");
  }

  private static int inputChoice() {
    Scanner in = new Scanner(System.in);
    out.print("Press number: ");
    int x = in.nextInt();
    return x;
  }

  private static Object input() {
    Scanner in = new Scanner(System.in);
    out.print("Discount Code (Don't have please enter N/n): ");
    String s = in.next();
    return s;
  }
}
