import java.util.Scanner;

public class Sach {
     private int maSach;
     private String tenSach;
     private String nhaXuatBan;
     private int namXuatBan;

     public Sach() {
     }

     public Sach(int maSach, String tenSach, String nhaXuatBan, int namXuatBan) {
          this.maSach = maSach;
          this.tenSach = tenSach;
          this.nhaXuatBan = nhaXuatBan;
          this.namXuatBan = namXuatBan;
     }

     public int getMaSach() {
          return maSach;
     }

     public void setMaSach(int maSach) {
          this.maSach = maSach;
     }

     public String getTenSach() {
          return tenSach;
     }

     public void setTenSach(String tenSach) {
          this.tenSach = tenSach;
     }

     public String getNhaXuatBan() {
          return nhaXuatBan;
     }

     public void setNhaXuatBan(String nhaXuatBan) {
          this.nhaXuatBan = nhaXuatBan;
     }

     public int getNamXuatBan() {
          return namXuatBan;
     }

     public void setNamXuatBan(int namXuatBan) {
          this.namXuatBan = namXuatBan;
     }

     public void input()
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhập Mã Sách :");
          maSach = Integer.parseInt(sc.nextLine());
          System.out.println("Nhập Tên Sách :");
          tenSach = sc.nextLine();
          System.out.println("Nhập Nhà Xuất Bản :");
          nhaXuatBan = sc.nextLine();
          System.out.println("Nhập Năm Xuất Bản :");
          namXuatBan = Integer.parseInt(sc.nextLine());
     }

     @Override
     public String toString() {
          return "Mã Sách = " + maSach + " - Năm Xuất Bản = " + namXuatBan + " - Nhà Xuất Bản = " + nhaXuatBan + " - Tên Sách = "
                    + tenSach ;
     }


     

     

     

     
}
