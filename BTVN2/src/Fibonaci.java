import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập Số Nguyên Dương N : ");
        n = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.printf("%d \t",fibonacci(i));
        }

    }
    


    static int fibonacci(int n) {
    int f0 = 0;
    int f1 = 1;
    int fn = 1;
    int i;
 
    if (n < 0) {
        return -1;
    } else if (n == 0 || n == 1) {
        return n;
    } else {
        for (i = 2; i < n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
    }
    return fn;
}
}
