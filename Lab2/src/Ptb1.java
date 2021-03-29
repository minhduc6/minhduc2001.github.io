import java.util.Scanner;

public class Ptb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0)
        {
            if (b == 0) {
                System.out.println("Phuong Trinh Vo So Nghiem ");
            }
            else
            {
                 System.out.println("Phuong trinh vo nghiem ");
            }
            
           
        }
        else
        {
            System.out.println("Phuong Trinh Co Nghiem :" +(float)(-1.0*b/a));
        }
    }
}
