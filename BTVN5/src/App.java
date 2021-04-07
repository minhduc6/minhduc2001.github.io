import java.util.Scanner;
import java.lang.runtime.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int luachon;
            System.out.println("=============================Menu=================");
            System.out.println("1.Khởi Tạo Lập Trình Viên");
            System.out.println("2.Khởi tạo Kiểm Chứng Viên");
            System.out.println("3.Thoát");
            
            while (true) {
                
                System.out.println("Nhập lụa chọn của bạn :");
                luachon = Integer.parseInt(sc.nextLine());

                switch (luachon) {
                case 1:
                    int n;
                    System.out.println("Nhập số Lập Trình Viên :");
                    n = Integer.parseInt(sc.nextLine());
                    LapTringVien[] listIT = new LapTringVien[n];
                    for (int i = 0; i < listIT.length; i++) {
                        listIT[i] = new LapTringVien();
                        listIT[i].input();
                    }

                    for (LapTringVien lapTringVien : listIT) {
                       System.out.println(lapTringVien.toString());
                    }
                        break;
                
                    case 2:
                    int m;
                    System.out.println("Nhập số Kiểm Chứng Viên:");
                    m = Integer.parseInt(sc.nextLine());
                    KiemChungVien[] listKCV = new KiemChungVien[m];
                    for (int i = 0; i < listKCV.length; i++) {
                        listKCV[i] = new KiemChungVien();
                        listKCV[i].input();
                    }

                    for (KiemChungVien kiemChungVien : listKCV) {
                        System.out.println(kiemChungVien.toString());
                    }
                    break;
                default:
                         break;
                }
           
   
        
            
        }
    }
}
