import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("***Enter your numbers in order of calculation.***");
        System.out.println("***Enter each operation after entering one number.***");
        System.out.println("***Calculations are in the way where the first number being given will be the on the left side of the calculation***");
        System.out.println("***Integers number must be used.***");
        System.out.println("***Number of inputs must be more than 1.***");

        while (true) {
            String operator;
            int total = 0;
            System.out.println("How many numbers you want to input?");
            int size = sc.nextInt();
            if (size < 2) {
                System.out.println("Unknown command.");
                continue;
            }
            int[] arr_num = new int[size];

            System.out.print("Enter your number: ");
            arr_num[0] = sc.nextInt();

            System.out.println("Enter your operation of choice (+, -, *, /): ");
            operator = sc.nextLine();

            if (operator.equals("+")) {
                total = arr_num[0] + arr_num[1];
            } else if (operator.equals("-")) {
                total = arr_num[0] - arr_num[1];
            } else if (operator.equals("*")) {
                total = arr_num[0] * arr_num[1];
            } else if (operator.equals("/")) {
                total = arr_num[0] / arr_num[1];
            } else {
                System.out.println("Unknown command.");
                continue;
            }

            System.out.print("Enter your number: ");
            arr_num[1] = sc.nextInt();

            if (size > 2) {
                for (int i = 2; i < size; i++) {

                    System.out.println("Enter your operation of choice (+, -, *, /): ");
                    operator = sc.nextLine();

                    System.out.print("Enter your number: ");
                    arr_num[i] = sc.nextInt();

                    if (operator.equals("+")) {
                        total += arr_num[0];
                    } else if (operator.equals("-")) {
                        total -= arr_num[0];
                    } else if (operator.equals("*")) {
                        total *= arr_num[0];
                    } else if (operator.equals("/")) {
                        total /= arr_num[0];
                    } else {
                        System.out.println("Unknown command.");
                        break;
                    }
                }

            }
            System.out.println("Your result is: " + total);
        }
    }
}
