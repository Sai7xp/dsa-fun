import java.util.Scanner;

/*
 * Created on 16 August 2024
 *
 * @author Sai Sumanth
 */
public class CountZerosInNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 10;
        while (n-- > 0) {
            System.out.print("\nEnter n: ");
            int number = s.nextInt();
            int count = countZeroes(number);
            System.out.printf("Zeroes in %d are: %d", number, count);
        }
        s.close();
    }

    public static int countZeroes(int n) {
        if (n == 0)
            return 1;
        if (n < 10)
            return 0;
        int rem = n % 10;
        n /= 10;
        return rem != 0 ? 0 + countZeroes(n) : 1 + countZeroes(n);
    }
}
