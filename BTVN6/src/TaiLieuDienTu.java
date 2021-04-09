import java.util.Scanner;

public class TaiLieuDienTu extends Sach implements IDownload {
     private String dungLuong;
     private int luotTai;
     private float gia;
     







     public TaiLieuDienTu() {
     }



     public TaiLieuDienTu(int maSach, String tenSach, String nhaXuatBan, int namXuatBan, String dungLuong, int luotTai,
               float gia) {
          super(maSach, tenSach, nhaXuatBan, namXuatBan);
          this.dungLuong = dungLuong;
          this.luotTai = luotTai;
          this.gia = gia;
     }

     public String getDungLuong() {
          return dungLuong;
     }

     public void setDungLuong(String dungLuong) {
          this.dungLuong = dungLuong;
     }

     public int getLuotTai() {
          return luotTai;
     }

     public void setLuotTai(int luotTai) {
          this.luotTai = luotTai;
     }



     public float getGia() {
          return gia;
     }


     public void setGia(float gia) {
          this.gia = gia;
     }


     @Override
     public void input() {
          // TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          super.input();
          System.out.println("Nhập Dung Lượng Tải :");
          dungLuong = sc.nextLine();
          System.out.println("Nhập lượt Tải :");
          luotTai = Integer.parseInt(sc.nextLine());
          System.out.println("Nhập Giá :");
          gia = Float.parseFloat(sc.nextLine());
     }







     @Override
     public String toString() {
          // TODO Auto-generated method stub
          return super.toString() + "Dung Lượng = " + dungLuong + " -Giá  = " + gia + " - Lượt Tải = " + luotTai;
     }
     
     @Override
     public long tongTien() {
          // TODO Auto-generated method stub
          return (long) (gia*luotTai);
     }




     

     

     
     
}
