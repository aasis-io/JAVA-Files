import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int n1 = input.nextInt();
        System.out.println("Enter the number 2: ");
        int n2 = input.nextInt();
        int res = n1 > n2 ? 1 : 0;
        switch (res) {
            case 0:
                res = n1 == n2 ? 1 : 0;
                switch (res) {
                    case 0:
                        System.out.printf("Maximum number is" + n2);
                        break;
                    case 1:
                        System.out.printf("Both are Equals");
                        break;
                }
                break;

            case 1:
                System.out.printf("Maximum number is" + n1);
                break;                                                                                                                                  1
        }
    }

}