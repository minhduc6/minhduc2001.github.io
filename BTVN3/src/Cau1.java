import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số phần tử của mảng :");
        n = sc.nextInt();

        int[] a;
        a = new int[n];
        input(a, n);
        output(a, n);
        System.out.println();
        timMax(a, n);
        timMin(a, n);
        System.out.println("Các số nguyên tố trong mảng :");
        int sum = 0;
        for(int i=0 ;i<n;i++)
        {
            if (isChecked(a[i])) {
                sum += a[i];
                System.out.printf("%d\t", a[i]);
            }
        }
        System.out.println();
        System.out.println("Tổng Các Số Nguyên Tố :" + sum);
        

        int k;
        System.out.println("Thay đổi Tại Vị Trí :");
        k = sc.nextInt();
        suaTaiViTriK(a, n, k);
        output(a, n);

    }

    public static void input(int[] a ,int n)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử a[" + i + "]");
            a[i] = sc.nextInt();
        }
    }

    public static void output(int[] a ,int n)
    {
        System.out.println("Mảng vửa nhập :");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", a[i]);
        }
    }

    public static void timMax(int[] a ,int n)
    {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max của mảng :" + max);
    }
    public static void timMin(int[] a ,int n)
    {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Min của mảng :" + min);
    }




    public  static boolean isChecked(int n)
    {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    

    public static void suaTaiViTriK(int[] a,int n,int k)
    {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Giá trị thay đổi :");
        x = sc.nextInt();
        for(int i=0 ;i<n;i++)
        {
            if(i==k)
            {
                a[i] = x;
            }
        }
    }
    











}
