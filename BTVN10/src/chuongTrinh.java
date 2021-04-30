import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class chuongTrinh {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        int luachon;
        while (true)
        {
            System.out.println("1. Đọc Ghi File và In ra Thông tin Sản Phẩm : ");
            System.out.println("2.In Thông Tin dựa trên danh mục ");
            System.out.println("3.In Thông Tin theo hãng");
            System.out.println("4.In Thông Tin theo Giá và danh mục ");
            System.out.println("5.Tìm kiếm SP :");
            System.out.println("6.Ghi vao File");
            System.out.println("7.Thực Hiện Thêm Sản Phẩm Và Lưu Vào File :");
            System.out.println("8.Thực Hiện Sửa Sản Phẩm Và Lưu Vào File :");
            System.out.println("9.Thực Hiện Xóa Sản Phẩm Và Lưu Vào File :");
            System.out.println("0.Thoát Chương Trình ");
            System.out.println("Nhập lựa chọn của bạn :");
            luachon = Integer.parseInt(sc.nextLine());

            switch (luachon) {
            case 1:
                ListSP listSP = new ListSP();
                listSP.getALL();
                listSP.show();
                break;
            case 2:
                ListSP listSP1 = new ListSP();
                listSP1.getALL();
                listSP1.cau2();
                break;
            case 3:
                ListSP listSP2 = new ListSP();
                listSP2.getALL();
                listSP2.cau3();

                break;
             case 4:
                ListSP listSP3 = new ListSP();
                listSP3.getALL();
                listSP3.cau4();

                break;
             case 5:
                ListSP listSP4 = new ListSP();
                listSP4.getALL();
                listSP4.cau5();

                break;
            case 6:
                ListSP listSP5 = new ListSP();
                listSP5.getALL();
                listSP5.VaoFile();
                break;
            case 7:
                ListSP listSP7 = new ListSP();
                listSP7.getALL();
                listSP7.them();
                listSP7.VaoFile();
                break;
            case 8:
                ListSP listSP8 = new ListSP();
                listSP8.getALL();
                listSP8.sua();
                listSP8.VaoFile();
                break;
            case 9:
                 ListSP listSP6 = new ListSP();
                 listSP6.getALL();
                 listSP6.xoa();
                 listSP6.VaoFile();
                break;
            case 0:
                System.exit(0);
                break;
            
            default:
                System.out.println("Không có lựa chọn này ");
                
                    break;
            }
        }
    }
}
