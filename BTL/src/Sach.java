import java.io.Serializable;
import java.util.Scanner;

public class Sach implements Serializable {



     private String maSach;
     private String tenSach;
     private String tacGia;
     private String nhaCungCap;
     private String nhaXuatBan;
     private double giaNhap;
     private double giaBan;
     private String danhGia;
     private int soLuongBan;
     private int soLuongKho;
     private String danhMuc;


     public Sach() {
     }


     


     public Sach(String maSach, String tenSach, String tacGia, String nhaCungCap, String nhaXuatBan, double giaNhap,
               double giaBan, String danhGia, int soLuongBan, int soLuongKho, String danhMuc) {
          this.maSach = maSach;
          this.tenSach = tenSach;
          this.tacGia = tacGia;
          this.nhaCungCap = nhaCungCap;
          this.nhaXuatBan = nhaXuatBan;
          this.giaNhap = giaNhap;
          this.giaBan = giaBan;
          this.danhGia = danhGia;
          this.soLuongBan = soLuongBan;
          this.soLuongKho = soLuongKho;
          this.danhMuc = danhMuc;
     }





    


     public String getMaSach() {
          return maSach;
     }





     public void setMaSach(String maSach) {
          this.maSach = maSach;
     }





     public String getTenSach() {
          return tenSach;
     }





     public void setTenSach(String tenSach) {
          this.tenSach = tenSach;
     }





     public String getTacGia() {
          return tacGia;
     }





     public void setTacGia(String tacGia) {
          this.tacGia = tacGia;
     }





     public String getNhaCungCap() {
          return nhaCungCap;
     }





     public void setNhaCungCap(String nhaCungCap) {
          this.nhaCungCap = nhaCungCap;
     }





     public String getNhaXuatBan() {
          return nhaXuatBan;
     }





     public void setNhaXuatBan(String nhaXuatBan) {
          this.nhaXuatBan = nhaXuatBan;
     }





     public double getGiaNhap() {
          return giaNhap;
     }





     public void setGiaNhap(double giaNhap) {
          this.giaNhap = giaNhap;
     }





     public double getGiaBan() {
          return giaBan;
     }





     public void setGiaBan(double giaBan) {
          this.giaBan = giaBan;
     }





     public String getDanhGia() {
          return danhGia;
     }





     public void setDanhGia(String danhGia) {
          this.danhGia = danhGia;
     }





     public int getSoLuongBan() {
          return soLuongBan;
     }





     public void setSoLuongBan(int soLuongBan) {
          this.soLuongBan = soLuongBan;
     }





     public int getSoLuongKho() {
          return soLuongKho;
     }





     public void setSoLuongKho(int soLuongKho) {
          this.soLuongKho = soLuongKho;
     }





     public String getDanhMuc() {
          return danhMuc;
     }





     public void setDanhMuc(String danhMuc) {
          this.danhMuc = danhMuc;
     }





     public void input()
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhập Mã Sách :");
          maSach = sc.nextLine();
          System.out.println("Nhập Tên Sách :");
          tenSach = sc.nextLine();
          System.out.println("Nhập Tên Tác Giả :");
          tacGia = sc.nextLine();
          System.out.println("Nhập Nhà Cung Cấp :");
          nhaCungCap = sc.nextLine();
          System.out.println("Nhập Nhà Xuất Bản :");
          nhaXuatBan = sc.nextLine();
          System.out.println("Nhập Giá Nhập Của Sách :");
          giaNhap = Double.parseDouble(sc.nextLine());
          System.out.println("Nhập Giá Bán Của Sách :");
          giaBan = Double.parseDouble(sc.nextLine());
          System.out.println("Nhập Đánh Giá Của Cuốn Sách :");
          danhGia = sc.nextLine();
          System.out.println("Nhập Số Lượng Bán của Sách :");
          soLuongBan = Integer.parseInt(sc.nextLine());

          while (soLuongBan < 0) {
               System.out.println("Nhập Số Lượng Bán Phải Lớn Hơn 0");
               soLuongBan = Integer.parseInt(sc.nextLine());
               
          }
          System.out.println("Nhập Số Lượng Trong Kho của Sách :");
          soLuongKho = Integer.parseInt(sc.nextLine());

          while (soLuongKho < 0) {
               System.out.println("Nhập Số Lượng Kho Phải Lớn Hơn 0");
               soLuongKho = Integer.parseInt(sc.nextLine());
               
          }

          System.out.println("Nhập Danh Mục Của Sách :");
          danhMuc = sc.nextLine();
     }

     public void show()
     {
          System.out.println("Mã Sách :" + maSach);
          System.out.println("Tên Sách :" + tenSach);
          System.out.println("Tên Tác Giả :" + tacGia);
          System.out.println("Nhà Cung Cấp :" + nhaCungCap);
          System.out.println("Nhà Xuất Bản :" + nhaXuatBan);
          System.out.println("Giá Nhập :" + giaNhap);
          System.out.println("Giá Bán :" + giaBan);
          System.out.println("Đánh Giá :" + danhGia);
          System.out.println("Số Lượng Bán :" + soLuongBan);
          System.out.println("Số Lượng Trong Kho :" + soLuongKho);
          System.out.println("Danh Mục :" + danhMuc);
     }

    
     


     
     
     



     

     

     
}
