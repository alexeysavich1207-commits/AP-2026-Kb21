import java.text.MessageFormat;
import java.util.Scanner;

public class Lab3_Savych_Kb21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int n = sc.nextInt();
        System.out.print("Введіть дробове число: ");
        double x = sc.nextDouble();
        sc.nextLine();
        System.out.print("Введіть рядок: ");
        String str = sc.nextLine();
        System.out.print("Введіть логічне значення: ");
        boolean flag = sc.nextBoolean();
        System.out.println();

        // 1 спосіб - println
        System.out.println("1. " + n + " " + x + " " + str + " " + flag);
        System.out.println("2. " + Integer.toBinaryString(n) + " " + Integer.toOctalString(n) + " " + Integer.toHexString(n));

        // 2 спосіб - MessageFormat
        System.out.println(MessageFormat.format("3. {2} {0} {3} {1}", String.valueOf(n), String.valueOf(x), str, flag));
        System.out.println(MessageFormat.format("4. {0,number,percent} {1,number,integer}", x, n));
        System.out.println(MessageFormat.format("5. {0,number,#.##}", x));

        // 3 спосіб - printf / format
        System.out.printf("6. [%10d] [%-10d]%n", n, n);
        System.out.printf("7. %08d %+d %X %o%n", n, n, n, n);
        System.out.printf("8. %.2f %.5f %e%n", x, x, x);
        System.out.printf("9. [%15s] [%-15s] [%.3s]%n", str, str, str);
        System.out.format("10. %b %B [%8b]%n", flag, flag, flag);
    }
}
