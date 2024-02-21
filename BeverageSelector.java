import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Select a beverage");
        System.out.println("Enter 1 for: Water");
        System.out.println("Enter 2 for: Coke");
        System.out.println("Enter 3 for: Coffee");

        System.out.print("Enter the number of the drink you want -> ");
        int choice = scanner.nextInt();

        getUserSelection(choice);


    }

    public static void getUserSelection(int choice) {
        if (choice == 1) {
            System.out.println("You have selected: Water");
        } else if (choice == 2) {
            System.out.println("You have selected: Coke");
        } else if (choice == 3) {
            System.out.println("You have selected: Coffee");
        } else {
            System.out.println("That is not an option, please try again and choose 1,2,or 3");
        }
    }
}
