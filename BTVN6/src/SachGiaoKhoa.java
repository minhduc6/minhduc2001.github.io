import java.util.Scanner;

public class SachGiaoKhoa extends Sach implements IMuon, IKho {
     private long soTrang;
     private String tinhTrang;
     private long tongSoLuong;
     private long soLuongMuon;

     public SachGiaoKhoa() {
     }

     public SachGiaoKhoa(int maSach, String tenSach, String nhaXuatBan, int namXuatBan, long soTrang, String tinhTrang,
               long tongSoLuong, long soLuongMuon) {
          super(maSach, tenSach, nhaXuatBan, namXuatBan);
          this.soTrang = soTrang;
          this.tinhTrang = tinhTrang;
          this.tongSoLuong = tongSoLuong;
          this.soLuongMuon = soLuongMuon;
     }

     public long getSoTrang() {
          return soTrang;
     }

     public void setSoTrang(long soTrang) {
          this.soTrang = soTrang;
     }

     public String getTinhTrang() {
          return tinhTrang;
     }

     public void setTinhTrang(String tinhTrang) {
          this.tinhTrang = tinhTrang;
     }

     public long getTongSoLuong() {
          return tongSoLuong;
     }

     public void setTongSoLuong(long tongSoLuong) {
          this.tongSoLuong = tongSoLuong;
     }

     public long getSoLuongMuon() {
          return soLuongMuon;
     }

     public void setSoLuongMuon(long soLuongMuon) {
          this.soLuongMuon = soLuongMuon;
     }

     @Override
     public void input() {
          // TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          super.input();
          System.out.println("Nhập Số Trang của Sách :");
          soTrang = Long.parseLong(sc.nextLine());
          System.out.println("Nhập Tình Trạng của Sách :");
          tinhTrang = sc.nextLine();
          System.out.println("Nhập Tổng Số Lượng Sách :");
          tongSoLuong = Long.parseLong(sc.nextLine());
          System.out.println("Nhập Số Lượng Mượn :");
          soLuongMuon = Long.parseLong(sc.nextLine());
     }
      @Override
     public void viTri(String viTri) {
          // TODO Auto-generated method stub
          System.out.println("Vị Trí Của Sách :" +viTri);
          
     }

     @Override
     public long tonKho() {
          // TODO Auto-generated method stub
          return tongSoLuong - soLuongMuon;
     }

    @Override
    public String toString() {
         // TODO Auto-generated method stub
         return super.toString() + " Số Lượng Mượn = " + soLuongMuon + " - Số Trang = " + soTrang + " - Tình Trạng = " + tinhTrang
                    + " - Tổng Số Lượng = " + tongSoLuong ;
    }



  
      
}
