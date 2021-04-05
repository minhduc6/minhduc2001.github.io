import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số Nhân Viên :");
        n = sc.nextInt();
        Employee[] list = new Employee[n];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Nhập Thông Tin Sinh Viên thứ " + (i + 1));
            list[i] = new Employee();
            list[i].input();

        }
        int count = 0;
        for (Employee employee : list) {
            System.out.println("=====Thông Tin Nhân Viên " +(count+1) +" ==============");
            employee.display();
            count++;
        }
    }
}
