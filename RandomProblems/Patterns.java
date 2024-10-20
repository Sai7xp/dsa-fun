
/*
* Created on 01 Aug 2024
* 
* @author Sai Sumanth
*/
import java.util.Scanner;

/* 
 * Steps to Solve Pattern Problems
 * 1. Run the outer loop for no. of lines (Rows)
 * 2. For Inner Loop, focus on the columns & connect them somehow to the Rows
 * 3. Observe if there's any symmetry (optional - only for few patterns)
 */
class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        // *****
        // *---*
        // *---*
        // *---*
        // *****
        //
        // for n = 5
        // Ignore the hypens(-) between stars
        printBoxPattern(n);

        // increasing letter triangle
        printIncreasingLetterTriangle(n);

        // n Star Triangle
        // *
        // ***
        // *****
        printStarTriangle(n);

        printReverseTriangle(n);

        printStarDiamond(n);

        printAlphaHill(n);

        printDiamondBox(n);

        printButterFly(n);

    }

    private static void printAlphaHill(int n) {
        System.out.println("\n----------  Alpha Hill  --------");

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int space = n - i; space >= 1; space--) {
                System.out.print(" ");
            }
            // print alphas
            for (int alpha = 1; alpha <= i; alpha++) {
                char c = (char) (alpha + 64);
                System.out.print(c);
            }

            // print final alphas
            for (int fa = 1; fa < i; fa++) {
                char c = (char) (fa + 64);
                System.out.print(c);
            }

            System.out.println();
        }
    }

    private static void printStarDiamond(int n) {
        System.out.println("\n----------  Star Diamond ♦ Triangle --------");

        int spaces = n - 1;
        int stars = 1;
        for (int i = 1; i <= n * 2; i++) {
            // spaces
            for (int space = spaces; space >= 1; space--) {
                System.out.print(" ");
            }

            // stars
            for (int star = stars; star >= 1; star--) {
                System.out.print("*");
            }

            System.out.println();

            if (i <= n) {
                spaces--;
                stars += 2;
                if (stars > n * 2 - 1) {
                    stars = n * 2 - 1;
                }
            } else {
                spaces = i - n;
                stars -= 2;
            }

        }
    }

    private static void printReverseTriangle(int n) {
        System.out.println("\n---------- Reverse Star Triangle --------");

        for (int i = n; i >= 1; i--) {
            // print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // print stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printStarTriangle(int n) {
        System.out.println("\n---------- Star Triangle --------");

        int stars = 1;
        int spaces = n - 1;
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }

            // print stars
            for (int s = 1; s <= stars; s++) {
                System.out.print("*");
            }
            stars += 2;
            spaces--;
            System.out.println();
        }
    }

    private static void printIncreasingLetterTriangle(int n) {
        System.out.println("\n---------- Increasing Letter Triangle --------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char c = (char) (j + 64);
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void printBoxPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    // System.out.print(i + " " + j);
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printDiamondBox(int n) {
        System.out.println("\n---------- Diamond Box --------");
        // first half
        for (int i = 1; i <= n; i++) {
            /// stars
            for (int s = 1; s <= n - i + 1; s++) {
                System.out.print("* ");
            }
            // spaces
            for (int sp = 1; sp <= (i - 1) * 2; sp++) {
                System.out.print("  ");
            }

            // stars
            for (int s = 1; s <= n - i + 1; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // next half
        for (int i = 1; i <= n; i++) {
            /// stars
            for (int s = 1; s <= i; s++) {
                System.out.print("* ");
            }
            // spaces
            for (int sp = 1; sp <= (n - i) * 2; sp++) {
                System.out.print("  ");
            }

            // stars
            for (int s = 1; s <= i; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printButterFly(int n) {
        System.out.println("\n------- Butterfly Pattern --------\n");

        for (int i = 1; i < n * 2; i++) {
            int stars = i <= n ? i : 2 * n - i;

            int spaces = i <= n ? (2 * (n - i)) : (n - stars) * 2;

            for (int st = 1; st <= stars; st++) {
                System.out.print("* ");
            }

            for (int sp = 1; sp <= spaces; sp++) {
                System.out.print("  ");
            }
            for (int st = 1; st <= stars; st++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
