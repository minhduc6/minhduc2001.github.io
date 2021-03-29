import java.util.Scanner;

public class Ptb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("Mời Bạn Nhập Hệ Số a :(Lưu ý a != 0)");
        do {
           
            a = sc.nextDouble();
            
        } while (a == 0);
        double b;
        System.out.println("Mời bạn nhập hệ số b :");
        b = sc.nextDouble();
        double c;
        System.out.println("Mời bạn nhập hệ số c :");
        c = sc.nextDouble();

        double delta = b*b - 4*a*c;
        double x1;
        double x2;
         
         if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }

    }
    
}
