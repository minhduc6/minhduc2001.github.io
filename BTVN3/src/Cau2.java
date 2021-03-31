import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Nhập Số Hàng , Cột Của Ma Trận Vuông :");
        m = sc.nextInt();
        int[][] a;
        a = new int[m][m];
        input(a, m);
        System.out.println("Ma Trận Bạn Vừa Nhập :");
        output(a, m);
        System.out.println("Các Phần Tử Đường Chéo Chính :");
        duongCheoChinh(a, m);
        System.out.println();
        System.out.println("Tổng Đường Chéo Chính :"+tongDuongCheoChinh(a, m));

        
       
    }

    public static void input(int[][] a , int m)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập phần tử a[" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void output(int[][] a ,int m)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void duongCheoChinh(int[][] a ,int m)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    System.out.printf("%d\t", a[i][j]);
                }
            }

        }
    }
    public static int tongDuongCheoChinh(int[][] a ,int m)
    {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
            }

        }
        return sum;
    }
}
