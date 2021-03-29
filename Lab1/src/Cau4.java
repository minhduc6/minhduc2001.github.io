import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.println("Moi Ban Nhap Chuoi Thu 1:");
        s1 = sc.nextLine();
        String s2;
        System.out.println("Moi ban nhap chuoi thu 2:");
        s2 = sc.nextLine();

        System.out.println("Chuoi ban vua nhap la :");
        System.out.println(s1);
        System.out.println(s2);
        boolean s = s1.equalsIgnoreCase(s2);
        if(s)
        {
            System.out.println("Hai chuoi bang nhau");
        }
        else
        {
            System.out.println("Hai chuoi khac nhau");
        }
    }
    
}
