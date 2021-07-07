import java.util.Scanner;
import java.util.HashSet;
public class Coffee2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] coffee ={ "Quit","Thai Coffee", "Latte", "Espresso", "Mocha", "Cappuchino","50", "60", "70", "80", "85"};
        HashSet<String> discountCodeCheck = new HashSet<String>();
        int discountedCoffeePrice = 0;
        do
        {
            System.out.println("===== Coffee List =====");
            for (int a = 1; a < 6; a++)
            {
                System.out.printf("[%d] %s ----- %s Baht\n", a, spaceGenerator(coffee[a], 14), coffee[a + 5]);
            }
            System.out.println("[6] Quit");
            System.out.print("Press number : ");
            int option = in.nextInt();
            in.nextLine();
            if (option == 6)
            {
              System.out.print("== Goodbye ==");
              break;
            }

            System.out.print("Discount Code (Don't have please enter N/n): ");
            String discountCode = in.nextLine();

            while (true)
            {
                if (!discountCode.matches("^A00[1-9]^A01[0]+|N$|n"))
                {
                  System.out.print("Wrong discount code, please re-enter: ");
                  discountCode = in.nextLine();
                }

                else
                {
                  break;
                }
            }
            if (discountCode.equalsIgnoreCase("N"))
            {
              discountedCoffeePrice = (int)(Integer.valueOf(coffee[option + 5]));
            }
            else if (discountCodeCheck.add(discountCode))
            {
              discountedCoffeePrice = (int)(0.9 * Integer.valueOf(coffee[option+5]));
            }

            else
            {
              discountedCoffeePrice = (int)(Integer.valueOf(coffee[option + 5]));
            }

            System.out.println("Total Price : " + discountedCoffeePrice + " Baht");
        }
        while (true);
        in.close();
    }
    private static String spaceGenerator(String word, int len)
    {
        int idealLength = len - word.length();
        String toReturn = "";
        for (int a = 0; a < idealLength; a++)
        {
          toReturn += " ";
        }
          return word + toReturn;
    }
}