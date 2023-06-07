import java.util.Scanner;

public class givenNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=scanner.nextInt();
        int sum = 0;
        int num;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            num = scanner.nextInt();
            sum = sum + num;
        }
        System.out.println("The sum of given numbers is" + sum);
    }
}