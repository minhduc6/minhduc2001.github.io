import java.util.Scanner;

public class SanPham {
     private String maSP;
     private String ten;
     private String moTa;
     private long giaNhap;
     private long giaBan;
     private int soLuongTon;
     private int soLuongBan;
     private String hang;
     private String danhMuc;



     



     public SanPham() {
     }


     public SanPham(String maSP, String ten, String moTa, long giaNhap, long giaBan, int soLuongTon, int soLuongBan,
               String hang, String danhMuc) {
          this.maSP = maSP;
          this.ten = ten;
          this.moTa = moTa;
          this.giaNhap = giaNhap;
          this.giaBan = giaBan;
          this.soLuongTon = soLuongTon;
          this.soLuongBan = soLuongBan;
          this.hang = hang;
          this.danhMuc = danhMuc;
     }


     public String getMaSP() {
          return maSP;
     }


     public void setMaSP(String maSP) {
          this.maSP = maSP;
     }


     public String getTen() {
          return ten;
     }


     public void setTen(String ten) {
          this.ten = ten;
     }


     public String getMoTa() {
          return moTa;
     }


     public void setMoTa(String moTa) {
          this.moTa = moTa;
     }


     public long getGiaNhap() {
          return giaNhap;
     }


     public void setGiaNhap(long giaNhap) {
          this.giaNhap = giaNhap;
     }


     public long getGiaBan() {
          return giaBan;
     }


     public void setGiaBan(long giaBan) {
          this.giaBan = giaBan;
     }


     public int getSoLuongTon() {
          return soLuongTon;
     }


     public void setSoLuongTon(int soLuongTon) {
          this.soLuongTon = soLuongTon;
     }


     public int getSoLuongBan() {
          return soLuongBan;
     }


     public void setSoLuongBan(int soLuongBan) {
          this.soLuongBan = soLuongBan;
     }


     public String getHang() {
          return hang;
     }


     public void setHang(String hang) {
          this.hang = hang;
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
          System.out.println("Nh???p M?? S???n Ph???m :");
          maSP = sc.nextLine();
          System.out.println("Nh???p T??n S???n Ph???m :");
          ten = sc.nextLine();
          System.out.println("Nh???p M?? T??? S???n Ph???m :");
          moTa = sc.nextLine();
          System.out.println("Nh???p Gi?? Nh???p S???n Ph???m :");
          giaNhap = Long.parseLong(sc.nextLine());
          System.out.println("Nh???p Gi?? B??n S???n Ph???m :");
          giaBan = Long.parseLong(sc.nextLine());
          System.out.println("Nh???p S??? L?????ng T???n :");
          soLuongTon = Integer.parseInt(sc.nextLine());
          System.out.println("Nh???p S??? L?????ng B??n :");
          soLuongBan = Integer.parseInt(sc.nextLine());
          System.out.println("Nh???p H??ng c???a S???n Ph???m :");
          hang = sc.nextLine();
          System.out.println("Nh???p danh m???c c???a s???n ph???m :");
          danhMuc = sc.nextLine();
     }


     @Override
     public String toString() {
          return "SanPham [danhMuc=" + danhMuc + ", giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", hang=" + hang
                    + ", maSP=" + maSP + ", moTa=" + moTa + ", soLuongBan=" + soLuongBan + ", soLuongTon=" + soLuongTon
                    + ", ten=" + ten + "]";
     }



     


     

    
     



     







     
}
