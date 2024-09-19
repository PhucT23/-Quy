import java.util.Scanner;

public class App {
public class RecursiveFunction {

    public static int calculateX(int n) {
        if (n == 0) {
            return 1; 
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (n - i) * (n - i) * calculateX(i);
        }

        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = RecursiveFunction.calculateX(n);
        System.out.println("Giá trị của X_" + n + " là: " + result);
    }
}

}
