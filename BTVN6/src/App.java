import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int luachon;
        Scanner sc = new Scanner(System.in);
        ArrayList<SachGiaoKhoa> lSachGiaoKhoas = new ArrayList<>();
        ArrayList<DoAn> lDoAns = new ArrayList<>();
        ArrayList<TaiLieuDienTu> lTaiLieuDienTus = new ArrayList<>();
        while(true)
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
             
            System.out.println("1.Khởi Tạo Sách Khoa :");
            System.out.println("2.Khởi Tạo Đồ Án :");
            System.out.println("3.Tài Liệu Điện Tử :");
            System.out.println("4.Danh sách Sách Giáo Khoa :");
            System.out.println("5.Danh sách Đồ Án :");
            System.out.println("6.Danh sách Tài Liệu Điện Tử :");
            System.out.println("0.Thoát Chương Trình");
       
            System.out.println("Nhập Lựa Chọn của Bạn :");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    int n;
                    System.out.println("Nhập số sách giáo khoa muốn khởi tạo :");
                    n=Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        SachGiaoKhoa sgk = new SachGiaoKhoa();
                        sgk.input();
                        lSachGiaoKhoas.add(sgk);
                    }
                    
                    break;
                case 2:
                    int m;
                    System.out.println("Nhập số đồ án muốn khởi tạo :");
                    m = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < m; i++) {
                        DoAn doan = new DoAn();
                        doan.input();
                        lDoAns.add(doan);
                    }
                        break;
                case 3:
                    int k;
                    System.out.println("Nhập số Tài Liệu Điện Tử :");
                    k = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < k; i++) {
                        TaiLieuDienTu taiLieuDienTu = new TaiLieuDienTu();
                        taiLieuDienTu.input();
                        lTaiLieuDienTus.add(taiLieuDienTu);
                    }
                     break;


                
                case 4:
                    for (int i = 0; i < lSachGiaoKhoas.size(); i++) {
                        System.out.println(lSachGiaoKhoas.get(i).toString());
                    }
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                        break;
                    case 5:
                        for (DoAn doAn : lDoAns) {
                            System.out.println(doAn.toString());

                        }
                        new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                        break;
                    case 6:
                        for (TaiLieuDienTu tailieuDienTu : lTaiLieuDienTus) {
                            System.out.println(tailieuDienTu.toString());
                        }
                          new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                        break; 
            
                default:
                    break;
            }
            
        }
    }
}
