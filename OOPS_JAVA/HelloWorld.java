import java.util.Arrays;
import java.util.Scanner;

/*
 * Created on 24 June 2024
 *
 * @author Sai Sumanth
 */
public class HelloWorld {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        // this count++ changes will reflect in StaticKeyword.java
        System.out.println(Counter.count);
        Counter.count++;
        StaticKeyword.main(args);

        System.out.println("Command Line Args: " + Arrays.toString(args));
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int dataFromUser = sc.nextInt();
        System.out.println(dataFromUser);
        sc.nextLine();

        System.out.print("Enter some string value : ");
        String line = sc.nextLine();
        System.out.println(line);

        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is Prime Number ");
            }
        }

        for (int i = 1; i <= 1000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i + " is Armstrong Number");
            }
        }

        String refString = null;
        System.out.println(refString.length()); // NullPointerException
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isArmstrongNumber(int n) {
        int original = n;
        int cubeSum = 0;
        while (n > 0) {
            int rem = n % 10;
            cubeSum += rem * rem * rem;
            n /= 10;
        }
        return cubeSum == original;
    }
}
