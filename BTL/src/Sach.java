import java.io.Serializable;
import java.util.Scanner;

public class Sach implements Serializable {



     private String maSach;
     private String tenSach;
     private String tacGia;
     private String nhaCungCap;
     private String nhaXuatBan;
     private long giaNhap;
     private long giaBan;
     private String danhGia;
     private int soLuongBan;
     private int soLuongKho;
     private String danhMuc;


     public Sach() {
     }


     


     public Sach(String maSach, String tenSach, String tacGia, String nhaCungCap, String nhaXuatBan, long giaNhap,
               long giaBan, String danhGia, int soLuongBan, int soLuongKho, String danhMuc) {
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





     public void setGiaNhap(long giaNhap) {
          this.giaNhap = giaNhap;
     }





     public double getGiaBan() {
          return giaBan;
     }





     public void setGiaBan(long giaBan) {
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
          System.out.println("Nh???p M?? S??ch :");
          maSach = sc.nextLine();
          System.out.println("Nh???p T??n S??ch :");
          tenSach = sc.nextLine();
          System.out.println("Nh???p T??n T??c Gi??? :");
          tacGia = sc.nextLine();
          System.out.println("Nh???p Nh?? Cung C???p :");
          nhaCungCap = sc.nextLine();
          System.out.println("Nh???p Nh?? Xu???t B???n :");
          nhaXuatBan = sc.nextLine();
          System.out.println("Nh???p Gi?? Nh???p C???a S??ch :");
          giaNhap = Long.parseLong(sc.nextLine());
          System.out.println("Nh???p Gi?? B??n C???a S??ch :");
          giaBan = Long.parseLong(sc.nextLine());
          System.out.println("Nh???p ????nh Gi?? C???a Cu???n S??ch :");
          danhGia = sc.nextLine();
          System.out.println("Nh???p S??? L?????ng B??n c???a S??ch :");
          soLuongBan = Integer.parseInt(sc.nextLine());

          while (soLuongBan < 0) {
               System.out.println("Nh???p S??? L?????ng B??n Ph???i L???n H??n 0");
               soLuongBan = Integer.parseInt(sc.nextLine());
               
          }
          System.out.println("Nh???p S??? L?????ng Trong Kho c???a S??ch :");
          soLuongKho = Integer.parseInt(sc.nextLine());

          while (soLuongKho < 0) {
               System.out.println("Nh???p S??? L?????ng Kho Ph???i L???n H??n 0");
               soLuongKho = Integer.parseInt(sc.nextLine());
               
          }

          System.out.println("Nh???p Danh M???c C???a S??ch :");
          danhMuc = sc.nextLine();
     }

     public void show()
     {
          System.out.println("M?? S??ch :" + maSach);
          System.out.println("T??n S??ch :" + tenSach);
          System.out.println("T??n T??c Gi??? :" + tacGia);
          System.out.println("Nh?? Cung C???p :" + nhaCungCap);
          System.out.println("Nh?? Xu???t B???n :" + nhaXuatBan);
          System.out.println("Gi?? Nh???p :" + giaNhap);
          System.out.println("Gi?? B??n :" + giaBan);
          System.out.println("????nh Gi?? :" + danhGia);
          System.out.println("S??? L?????ng B??n :" + soLuongBan);
          System.out.println("S??? L?????ng Trong Kho :" + soLuongKho);
          System.out.println("Danh M???c :" + danhMuc);
     }

    
     


     
     
     



     

     

     
}
