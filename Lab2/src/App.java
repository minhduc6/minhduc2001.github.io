import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        //    double a = 3;
        //    double b = 4;
        //    double c = Math.sqrt(a * a + b * b);
        //   System.out.println("Canh C :" + c );

        // BMI
        //   Scanner sc = new Scanner(System.in);
        //   int weight;
        //   System.out.println("Nhap Can Nang Cua Ban : (Theo Kg)");
        //   weight = sc.nextInt();

        //   double height;
        //   System.out.println("Nhap Chieu Cao Cua Ban : (THEO M)");
        //   height = sc.nextDouble();
        //   double BMI = weight/(height*height);
        //   System.out.printf("Chi so BMI : %.2f \n", BMI);
        //   if(BMI>24.9)
        //   {
        //       System.out.println("Thua Cannn");

        //   } else if(BMI>= 18.5 && BMI<= 24.9)
        //   {
        //       System.out.println("Than Hinh Can Doi ");
        //   }
        //   else
        //   {
        //       System.out.println("Gay Go");
        //   }
        // }

        //     int Month;
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Nhap thang :");
        //     Month = sc.nextInt();
        //     switch (Month) {
        //     case 1:
        //         System.out.println(Month + "co 31 Ngay");
        //         break;
        //     case 2:
        //         System.out.println(Month + "co 28 Ngay hoac 29 Ngay");
        //         break;
        //     case 3:
        //         System.out.println(Month + "co 31 Ngay");
        //         break;
        //     case 4:
        //         System.out.println(Month + "co 30 Ngay");
        //         break;
        //     case 5:
        //         System.out.println(Month + "co 31 Ngay");
        //         break;
        //     case 6:
        //         System.out.println(Month + "co 30 Ngay");
        //         break;
        //     case 7:
        //         System.out.println(Month + "co 31 Ngay");
        //         break;
        //     case 8:
        //         System.out.println(Month + "co 30 Ngay");
        //         break;
        //     case 9:
        //         System.out.println(Month + " co 30 Ngay");
        //         break;
        //     case 10:
        //         System.out.println(Month + "co 31 Ngay");
        //         break;
        //     case 11:
        //         System.out.println(Month + "co 30 Ngay");

        //         break;
        //     case 12:
        //         System.out.println(Month + "co 31 Ngay");
        //         break;

        //     default:
        //         System.out.println("Khong co thang " + Month);
        //         break;
        //     }
        // }

        //     for (int i = 1; i <= 100; i++) {
        //         if(i%3==0)
        //         {
        //             if (i % 5 == 0) {
        //                 System.out.println("FizzBuzz");
        //             } else {
        //                 System.out.println("Fizz");
        //             }
        //         }
        //         else 
        //         {
        //             if(i%5==0)
        //             {
        //                 System.out.println("Buzz");
        //             }
        //             else System.out.println(i);
        //         }
        //     }
        // }
        int i = 0;
        while (i <= 100) {
            if (Kiemtra(i))
            {
                System.out.println(i);
            }
            i++;
        }
    }

    public  static boolean Kiemtra(int n)
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
}
