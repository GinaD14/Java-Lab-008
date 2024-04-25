public class Homework {
}
public class RecursivePractice {

    public static void main(String[] args) {
        // Testing oddSum method
        System.out.println("Sum of odd integers from 1 to 7: " + oddSum(7));

        // Testing Ackermann method
        System.out.println("Ackermann(2, 1) = " + ack(2, 1));

        // Testing power method
        System.out.println("2^3 = " + power(2, 3));

        // Testing maxInRange method
        int[] array = {3, 5, 1, 8, 2, 7};
        System.out.println("Max value in the range [1, 4] is: " + maxInRange(array, 1, 4));
    }

    // Recursive method to find the sum of odd integers from 1 to n
    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + oddSum(n - 2);
        }
    }

    // Recursive method to compute the Ackermann function
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }

    // Recursive method to compute x raised to the power of n
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            if (n % 2 == 0) {
                double temp = power(x, n / 2);
                return temp * temp;
            } else {
                return x * power(x, n - 1);
            }
        } else { // for negative values of n
            return 1 / power(x, -n);
        }
    }

    // Recursive method to find the maximum value in the array within the specified range
    public static int maxInRange(int[] array, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return array[lowIndex];
        } else {
            int midIndex = (lowIndex + highIndex) / 2;
            int maxLeft = maxInRange(array, lowIndex, midIndex);
            int maxRight = maxInRange(array, midIndex + 1, highIndex);
            return Math.max(maxLeft, maxRight);
        }
    }
}
