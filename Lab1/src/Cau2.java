import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap chuoi :");
        String s = sc.nextLine();
        System.out.println("Chuoi ban vua nhap la :");
        System.err.println(s);
        System.out.println("Length :" + s.length());
    }
}
