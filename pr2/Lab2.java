import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        // інформація про примітивні типи (через класи-обгортки)
        System.out.printf("%-8s %-8s %-25s %-25s%n", "Тип", "Розмір", "Мінімум", "Максимум");
        System.out.printf("%-8s %-8s %-25s %-25s%n", "byte", Byte.SIZE + " біт", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%-8s %-8s %-25s %-25s%n", "short", Short.SIZE + " біт", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%-8s %-8s %-25s %-25s%n", "int", Integer.SIZE + " біт", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%-8s %-8s %-25s %-25s%n", "long", Long.SIZE + " біт", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%-8s %-8s %-25s %-25s%n", "float", Float.SIZE + " біт", -Float.MAX_VALUE, Float.MAX_VALUE);
        System.out.printf("%-8s %-8s %-25s %-25s%n", "double", Double.SIZE + " біт", -Double.MAX_VALUE, Double.MAX_VALUE);
        System.out.printf("%-8s %-8s %-25s %-25s%n", "char", Character.SIZE + " біт", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        System.out.printf("%-8s %-8s %-25s %-25s%n", "boolean", "1 біт", false, true);
        System.out.println();

        // зчитування рядків і перетворення в потрібний тип
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть byte: ");
        byte b = Byte.parseByte(sc.nextLine());
        System.out.println("byte = " + b);

        System.out.print("Введіть short: ");
        short s = Short.parseShort(sc.nextLine());
        System.out.println("short = " + s);

        System.out.print("Введіть int: ");
        int i = Integer.parseInt(sc.nextLine());
        System.out.println("int = " + i);

        System.out.print("Введіть long: ");
        long l = Long.parseLong(sc.nextLine());
        System.out.println("long = " + l);

        System.out.print("Введіть float: ");
        float f = Float.parseFloat(sc.nextLine());
        System.out.println("float = " + f);

        System.out.print("Введіть double: ");
        double d = Double.parseDouble(sc.nextLine());
        System.out.println("double = " + d);

        System.out.print("Введіть boolean: ");
        boolean bool = Boolean.parseBoolean(sc.nextLine());
        System.out.println("boolean = " + bool);

        System.out.print("Введіть char: ");
        char c = sc.nextLine().charAt(0);
        System.out.println("char = " + c);
    }
}
