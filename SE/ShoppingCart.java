import java.util.Scanner;
import java.util.Vector;

class ShoppingCart {
    public static void main(String[] args) {
        Vector<String> ShoppingList = new Vector<>();
        Scanner s = new Scanner(System.in);
        int choice;
        String item;
        System.out.println("1. Add item\n2. Delete item\n3. Show contents of cart\n4. Exit\n");
        do {
            System.out.println("Enter your choice:");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:{
                    System.out.println("Enter item to add: ");
                    item = s.nextLine();
                    ShoppingList.add(item);
                    break;
                }
                case 2:{
                    System.out.println("Enter item to delete: ");
                    item = s.nextLine();
                    if (ShoppingList.contains(item)) {
                        ShoppingList.remove(item);
                        System.out.println("Item " + item + " removed from cart.");
                    } else {
                        System.out.println("Item " + item + " not found in cart.");
                    }
                    break;
                }
                case 3:
                    System.out.println("Contents of cart: " + ShoppingList);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
    }
}