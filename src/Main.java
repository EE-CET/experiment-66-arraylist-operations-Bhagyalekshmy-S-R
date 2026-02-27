import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of items
        int N = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        // Read items
        String[] itemsInput = scanner.nextLine().split(" ");
        ArrayList<String> cart = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            cart.add(itemsInput[i]);
        }

        // Sort items alphabetically
        Collections.sort(cart);

        // Read search item
        String searchItem = scanner.nextLine();

        // Print sorted list
        System.out.println("Sorted Items: " + cart);

        // Check if item exists
        if (cart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
