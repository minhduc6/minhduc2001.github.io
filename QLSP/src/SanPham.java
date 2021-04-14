import java.util.Scanner;

public class SanPham {
     private int maSp;
     private String name;
     private float giaBan;
     private float giaNhap;
     private String moTa;
     private long soLuongBan;
     private long soLuongTon;

     public SanPham() {
     }
     public SanPham(int maSp, String name, float giaBan, float giaNhap, String moTa, long soLuongBan, long soLuongTon) {
          this.maSp = maSp;
          this.name = name;
          this.giaBan = giaBan;
          this.giaNhap = giaNhap;
          this.moTa = moTa;
          this.soLuongBan = soLuongBan;
          this.soLuongTon = soLuongTon;
     }
     


     public void input() throws ExceptionSL 
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhập Mã Sản Phẩm :");
          maSp = Integer.parseInt(sc.nextLine());
          System.out.println("Nhập Tên Sản Phẩm :");
          name = sc.nextLine();
          System.out.println("Nhập Giá Nhập :");
          giaNhap = Float.parseFloat(sc.nextLine());
          System.out.println("Nhập Giá Bán :");
          giaBan = Float.parseFloat(sc.nextLine());
          System.out.println("Nhập Mô Tả Sản Phẩm :");
          moTa = sc.nextLine();
          System.out.println("Nhập Số Lượng Sản Phẩm Bán  :");
          soLuongBan = Long.parseLong(sc.nextLine());
          System.out.println("Nhập Số Lượng Tồn :");
          soLuongTon = Long.parseLong(sc.nextLine());
          while (soLuongTon < 5) {
           long x;
           System.out.println("một mặt hàng có số lượng tồn > 5");
          System.out.println("Nhập thêm số lượng tồn cho mặt hàng :");
           x = Long.parseLong(sc.nextLine());
           setSoLuongTon(x + soLuongTon); 
          }
             
         
               
        
     }

  

     public float loiNhuan()
     {
          return (giaBan - giaNhap)*soLuongBan;
     }

     public int getMaSp() {
          return maSp;
     }

     public void setMaSp(int maSp) {
          this.maSp = maSp;
     }

     public String getName() {
          return name;
     }


     public void setName(String name) {
          this.name = name;
     }

     public float getGiaBan() {
          return giaBan;
     }

     public void setGiaBan(float giaBan) {
          this.giaBan = giaBan;
     }

     public float getGiaNhap() {
          return giaNhap;
     }

     public void setGiaNhap(float giaNhap) {
          this.giaNhap = giaNhap;
     }

     public String getMoTa() {
          return moTa;
     }

     public void setMoTa(String moTa) {
          this.moTa = moTa;
     }

     public long getSoLuongBan() {
          return soLuongBan;
     }

     public void setSoLuongBan(long soLuongBan) {
          this.soLuongBan = soLuongBan;
     }

     public long getSoLuongTon() {
          return soLuongTon;
     }


     public void setSoLuongTon(long soLuongTon) {
          this.soLuongTon = soLuongTon;
     }

     @Override
     public String toString() {
          return "SanPham [giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", maSp=" + maSp + ", moTa=" + moTa + ", name="
                    + name + ", soLuongBan=" + soLuongBan + ", soLuongTon=" + soLuongTon + " - Loi Nhuan : " + loiNhuan() + "]";
     }



     







     

     

     
     
}
