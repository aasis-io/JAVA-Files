import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int f = fact(n);
        System.out.println(f);

    }
    public static int fact(int n) {
        if(n == 0){
            return 1;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
        
    }
}

