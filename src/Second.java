import java.util.Scanner;

public class Second{
    static Scanner in = new Scanner(System.in);
    public static void Ex(){
        double[] A = new double[200], B = new double[200];
        double sum = 0;
        int i;
        System.out.println("Завдання 2");
        System.out.print("Введіть n: ");
        int n = in.nextInt();
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
            System.out.print("B["+i+"]:"+B[i] + "  ");
        }
    }
}

