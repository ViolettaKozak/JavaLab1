import java.util.Scanner;

public class First {
    static Scanner in = new Scanner(System.in);
    public static void Ex() {

        System.out.println("Перше завдання");
        System.out.println("Введіть х та у: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double res = x*y + (Math.pow((x+y), 3)/(Math.pow(x, 2)+Math.pow(y, 2)))*(x-y);
        System.out.println(res);
    }
}
