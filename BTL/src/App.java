import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ListSach ls = new ListSach();
        
        while (true) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("======================Menu========================");
            System.out.println("1.Thông Tin các quyển sách :");
            System.out.println("2.Hiển Thị Theo Danh Mục");
            System.out.println("3.Hiển thị Theo Danh Mục Và Sắp Xếp Giá :");
            System.out.println("4.Hiển thị thông tin theo danh mục và mức giá");
            System.out.println("5.Tìm Kiếm Sản Phẩm :");
            System.out.println("6.Xóa Sản Phẩm Theo Mã Sản Phẩm  ");
            System.out.println("7.Thêm Sản Phẩm");
            System.out.println("8.Sửa Sản Phẩm Theo Mã Sản Phẩm.");
            System.out.println("9.Ghi toàn bộ những cập nhật vào File :");
            System.out.println("10.Những Cuốn Sách Được Đánh Giá 5 Sao :");
            System.out.println("11.Doanh Thu của Một Cuốn Sách  :");
            System.out.println("12.Doanh Thu của Cửa Hàng Sách  :");
            System.out.println("13.Top 10 Quyển Sách Bán Chạy Nhất  :");
            System.out.println("14.Top 10 Quyển Sách Còn Nhiều Trong Kho :");
            System.out.println("15.Đề Xuất  5  Cuốn Sách Cho Bạn Hôm Nay :");
            System.out.println("Mời Nhập Lựa Chọn Của Bạn :");
            int luachon = 0;
            try {
                  luachon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Nhập Đúng Định Dạng");
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
            }

            while (luachon < 0 || luachon > 15) {
                System.out.println("Nhập Đúng Option mà Bạn Lựa Chọn :");
                luachon = Integer.parseInt(sc.nextLine());
            }
            switch (luachon) {
                case 1:
                ls.output();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;
            case 2:
                danhMuc();
                int luachonDanhMuc;
                System.out.println("Bạn Muốn Tìm Kiếm Danh Mục Nào :");
                luachonDanhMuc = Integer.parseInt(sc.nextLine());
                switch (luachonDanhMuc) {
                case 1:
                    String danhMuc1 = "Văn Học";
                    ls.LaySachTheoDanhMuc(danhMuc1);
                    ls.getListDM();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 2:
                    String danhMuc2 = "Kinh Tế";
                    ls.LaySachTheoDanhMuc(danhMuc2);
                    ls.getListDM();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 3:
                    String danhMuc3 = "Tâm Lý-KNS";
                    ls.LaySachTheoDanhMuc(danhMuc3);
                    ls.getListDM();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 4:
                    String danhMuc4 = "Nuôi Con";
                    ls.LaySachTheoDanhMuc(danhMuc4);
                    ls.getListDM();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 5:
                    String danhMuc5 = "Thiếu Nhi";
                    ls.LaySachTheoDanhMuc(danhMuc5);
                    ls.getListDM();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 6:
                    String danhMuc6 = "Hồi Ký";
                    ls.LaySachTheoDanhMuc(danhMuc6);
                    ls.getListDM();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 7:
                    String danhMuc7 = "SGK";
                    ls.LaySachTheoDanhMuc(danhMuc7);
                    ls.getListDM();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 8:
                    String danhMuc8 = "Ngoại Ngữ";
                    ls.LaySachTheoDanhMuc(danhMuc8);
                    ls.getListDM();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;

                default:
                    break;
                }
                break;
            case 3:
                danhMuc();
                int luachonDanhMucvaGia;
                System.out.println("Bạn Muốn Tìm Kiếm Danh Mục Sắp Xếp  Nào  :");
                luachonDanhMucvaGia = Integer.parseInt(sc.nextLine());
                switch (luachonDanhMucvaGia) {
                case 1:
                    String danhMuc1 = "Văn Học";
                    ls.LaySachTheoDanhMuc(danhMuc1);
                    ls.sapXepGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 2:
                    String danhMuc2 = "Kinh Tế";
                    ls.LaySachTheoDanhMuc(danhMuc2);
                    ls.sapXepGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 3:
                    String danhMuc3 = "Tâm Lý-KNS";
                    ls.LaySachTheoDanhMuc(danhMuc3);
                    ls.sapXepGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 4:
                    String danhMuc4 = "Nuôi Con";
                    ls.LaySachTheoDanhMuc(danhMuc4);
                    ls.sapXepGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 5:
                    String danhMuc5 = "Thiếu Nhi";
                    ls.LaySachTheoDanhMuc(danhMuc5);
                    ls.sapXepGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 6:
                    String danhMuc6 = "Hồi Ký";
                    ls.LaySachTheoDanhMuc(danhMuc6);
                    ls.sapXepGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 7:
                    String danhMuc7 = "SGK";
                    ls.LaySachTheoDanhMuc(danhMuc7);
                    ls.sapXepGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 8:
                    String danhMuc8 = "Ngoại Ngữ";
                    ls.LaySachTheoDanhMuc(danhMuc8);
                    ls.sapXepGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;

                default:
                    break;
                }
                break;
            case 4:
                danhMuc();
                int luachonDanhMucvaMucGia;
                System.out.println("Bạn Muốn Tìm Kiếm Danh Mục !!!!  Nào  :");
                luachonDanhMucvaMucGia = Integer.parseInt(sc.nextLine());
                switch (luachonDanhMucvaMucGia) {
                case 1:
                    String danhMuc1 = "Văn Học";
                    ls.LaySachTheoDanhMuc(danhMuc1);
                    mucGia();
                    ls.layTheoDanhMucvaMucGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 2:
                    String danhMuc2 = "Kinh Tế";
                    ls.LaySachTheoDanhMuc(danhMuc2);
                    mucGia();
                    ls.layTheoDanhMucvaMucGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 3:
                    String danhMuc3 = "Tâm Lý-KNS";
                    ls.LaySachTheoDanhMuc(danhMuc3);
                    mucGia();
                    ls.layTheoDanhMucvaMucGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 4:
                    String danhMuc4 = "Nuôi Con";
                    ls.LaySachTheoDanhMuc(danhMuc4);
                    mucGia();
                    ls.layTheoDanhMucvaMucGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 5:
                    String danhMuc5 = "Thiếu Nhi";
                    ls.LaySachTheoDanhMuc(danhMuc5);
                    mucGia();
                    ls.layTheoDanhMucvaMucGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 6:
                    String danhMuc6 = "Hồi Ký";
                    ls.LaySachTheoDanhMuc(danhMuc6);
                    mucGia();
                    ls.layTheoDanhMucvaMucGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 7:
                    String danhMuc7 = "SGK";
                    ls.LaySachTheoDanhMuc(danhMuc7);
                    mucGia();
                    ls.layTheoDanhMucvaMucGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;
                case 8:
                    String danhMuc8 = "Ngoại Ngữ";
                    ls.LaySachTheoDanhMuc(danhMuc8);
                    mucGia();
                    ls.layTheoDanhMucvaMucGia();
                    new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                    break;

                default:
                    break;

                }
                break;
            case 5:
                ls.timKiem();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;
            case 6:
                ls.xoa();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;
            case 7:
                ls.them();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;
            case 8:
                ls.capnhat();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;
            case 9:
                ls.vaoFile();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;
            case 10:
                ls.sach5Sao();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;
            case 11:
                ls.doanhThuCuaMotCuonSach();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;
            case 12:
                ls.doanhThuCuaHang();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;
             case 13:
                ls.sapXepSLBan();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;
             case 14:
                ls.sapXepSLKho();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;
             case 15:
                ls.deXuat();
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                break;

               }

        }
    }

    static void danhMuc()
    {
        System.out.println("1.Văn Học");
        System.out.println("2.Kinh Tế");
        System.out.println("3.Tâm Lý - Kỹ Năng Sống");
        System.out.println("4.Nuôi Con");
        System.out.println("5.Thiếu Nhi");
        System.out.println("6.Hồi Ký");
        System.out.println("7.Sách Giáo Khoa");
        System.out.println("8.Sách Ngoại Ngữ");
    }

    static void mucGia()
    {
        System.out.println("1.Dưới 30.000 VND");
        System.out.println("2.Khoảng 30.000-50.000 VND");
        System.out.println("3.Khoảng 50.000-100.000 VND");
        System.out.println("4.Trên 100.000 VND");
    }
}
