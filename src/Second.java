import java.util.InputMismatchException;
import java.util.Scanner;

public class Second{
    static Scanner in = new Scanner(System.in);
    public static void Ex(){
        double[] A = new double[200], B = new double[200];
        double sum = 0;
        int i, n;
        System.out.println("Завдання 2");
        try {
            System.out.print("Введіть n: ");
            n = in.nextInt();
            if(n<=0){
                throw new InputMismatchException();
            }
        }
        catch (InputMismatchException x) {
            System.out.println("Ви ввели неправильне число, введіть ціле число більше нуля");
            n = in.nextInt();
        }

        for (i=0; i<n; i++){
            System.out.print("Введіть A["+i+"]: ");
            A[i] = in.nextDouble();
        }
        for (i = 0; i<n;i++){
            for (int j=0;j<n;j++){
                if(j!=i){
                    sum += A[j];
                }
            }
            sum /= n-1;
            B[i] = sum;
        }
        System.out.println("Готовий масив B:");
        for(i=0; i<n; i++){
            System.out.print("B["+i+"]:"+B[i] + "  \n");
        }
    }
}

