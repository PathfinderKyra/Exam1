import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Below you can enter numbers to sum");
        System.out.println("Enter 0 to finish");
        System.out.println("Enter Number:");
        while (true) {
            System.out.print("-> ");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }

        System.out.println("Sum of numbers entered: " + sum);
    }
}