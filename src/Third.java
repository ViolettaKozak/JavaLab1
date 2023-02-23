import java.util.Random;
import java.util.Scanner;
public class Third {
    static Scanner in = new Scanner(System.in);
    static void Ex(){
        double[][] A = new double[15][15], B = new double[15][15];
        double[] C = new double[15];
        System.out.println("Завдання 3");
        System.out.print("Введіть розмір масивів: ");
        int n = in.nextInt();
        System.out.println("Введіть масив А");
        Input(A, n);
        System.out.println("Введіть масив В");
        Input(B, n);
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                if(A[i][j]<=B[i][j]){
                    C[i] = 0;
                    break;
                }
                else {
                    C[i] = 1;
                }
            }
        }
        System.out.println("Результат:");
        for (int i=0; i<n; i++){
            System.out.print("C["+i+"]: "+ C[i]+"  ");
        }
    }
    static double[][] Input(double[][] a, int n){
        System.out.println("Числа у масиві");
        Random rand = new Random();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j] = Math.round(rand.nextDouble(20) * 100.0)/100.0;
                System.out.print("Array["+i+"]["+j+"]: "+a[i][j]+"\n");
            }
        }
        return a;
    }
}
