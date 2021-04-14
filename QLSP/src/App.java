import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> listSP = new ArrayList<>();
        int luachon;
        while (true) {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("1.Khởi Tạo Danh Sách Sản Phẩm :");
            System.out.println("2.Thêm 1 sản phẩm vào danh sách :");
            System.out.println("3.Xóa 1 sản phẩm theo mã sản phẩm");
            System.out.println("4.Cập nhật 1 sản phẩm theo mã sản phẩm ");
            System.out.println("5.Danh Sách Sản Phẩm ");
            System.out.println("6.Thoát");
            System.out.println("Nhập lựa chọn của bạn :");
            luachon = sc.nextInt();
            switch (luachon) {
    case 1:
        int n=0;
        System.out.println("Nhập Số Lượng Sản Phẩm :");
        try {
            n = sc.nextInt();
            checkSL(n);
        } catch (Exception e) {
            System.out.println("Nhập Đúng Định Dạng Của N ");
            e.printStackTrace();
            new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
            //TODO: handle exception

        }
        finally
        {
            
        }
        for(int i =0 ;i<n;i++)
        {
            SanPham p1 = new SanPham();
            p1.input();
            listSP.add(p1);
        }
                    
        break;
    case 2:
        SanPham sanPham = new SanPham();
        sanPham.input();
        listSP.add(sanPham);
        break;
    case 3:
        int maSP;
        System.out.println("Nhập Mã Sẩn Phẩm mà bạn cần xóa :");
        maSP = sc.nextInt();
        for (int i = 0; i < listSP.size(); i++) {
            if (listSP.get(i).getMaSp() == maSP) {
                listSP.remove(i);
            }
        }
        break;
    case 4:
        int maSP1;
        System.out.println("Nhập Mã Sẩn Phẩm mà bạn cần cập nhật:");
        maSP1 = sc.nextInt();
        for (int i = 0; i < listSP.size(); i++) {
            if (listSP.get(i).getMaSp() == maSP1) {
                SanPham sp1 = new SanPham();
                sp1.input();
                listSP.set(i,sp1);
            }
        }
        break;
    case 5:
      
        for (SanPham sanPham1 : listSP) {
            System.out.println(sanPham1.toString());
        }
        new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
     break;
            
                default:
                    break;
            }
            
        }
    }
    public static void checkSL(int x) throws ExceptionSL {
        if (x < 0 || x > 100) {
            throw new ExceptionSL("Nhập Số Lượng phải lớn hơn 0 và nhỏ hơn 100");
        }
    }

}


