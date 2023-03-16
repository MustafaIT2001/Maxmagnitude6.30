import java.util.Scanner;

public class Main {
    /**
     * Write a method maxMagnitude() with three integer parameters that returns the largest magnitude value.
     * Use the method in the main program that takes three integer inputs and outputs the largest magnitude value.
     * <p>
     * Ex: If the inputs are:
     * <p>
     * 5 7 9
     * method maxMagnitude() returns and the main program outputs:
     * <p>
     * 9
     * Ex: If the inputs are:
     * <p>
     * -17 -8 -2
     * method maxMagnitude() returns and the main program outputs:
     * <p>
     * -17
     * Note: The method does not just return the largest value, which for -17 -8 -2 would be -2.
     * Though not necessary, you may use the absolute-value built-in math method.
     * <p>
     * Your program must define and call a method:
     * public static int maxMagnitude(int userVal1, int userVal2, int userVal3)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int userVal1 = s.nextInt();
        int userVal2 = s.nextInt();
        int userVal3 = s.nextInt();

        System.out.println(maxMagnitude(userVal1, userVal2, userVal3));
    }

    public static int maxMagnitude(int userVal1, int userVal2, int userVal3) {
        int max = 0;

        if (Math.abs(userVal1) > Math.abs(userVal2)) {
            max = userVal1;

        } else if (Math.abs(userVal2) > Math.abs(userVal3)) {
            max = userVal2;

        } else {
            max = userVal3;
        }

        return max;

    }
}