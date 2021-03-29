import java.util.Scanner;



public class Ptb2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("Nhap he so a :");
        a = sc.nextInt();
        double b;
        System.out.println("Nhap he so b :");
        b = sc.nextInt();
        double c;
        System.out.println("Nhap he so c :");
        c = sc.nextInt();

        if(a==0)
        {
             if(b==0)
             {
                 System.out.println("Phuong Trinh Vo Nghiem");
             }
             else if(c==0)
             {
                 System.out.println("Phuong Tring vo so nghiem");
             }
             else
             {
                 System.out.println("Phuong trinh co nghiem :" + (-1.0*c)/b);
             }
        }
    }
}
    

