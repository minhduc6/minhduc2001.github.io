import java.util.Scanner;

public class DoAn extends Sach implements IKho {
     private long soTrang;
     private String tinhTrang;
     private long namBaoVe;

    

     public DoAn() {
     }

     public DoAn(int maSach, String tenSach, String nhaXuatBan, int namXuatBan, long soTrang, String tinhTrang,
               long namBaoVe) {
          super(maSach, tenSach, nhaXuatBan, namXuatBan);
          this.soTrang = soTrang;
          this.tinhTrang = tinhTrang;
          this.namBaoVe = namBaoVe;
     }
     
     @Override
     public void input() {
          // TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          super.input();
          System.out.println("Nhập số trang của Đồ Án :" );
          soTrang = Long.parseLong(sc.nextLine());
          System.out.println("Nhập Tình Trạng của Đồ Án :");
          tinhTrang = sc.nextLine();
          System.out.println("Nhập Năm Bảo Vệ Đồ Án :");
          namBaoVe = Long.parseLong(sc.nextLine());
     }

   @Override
   public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +  " Năm Bảo Vệ = " + namBaoVe + " - Số Trang = " + soTrang + " - Tình Trạng = " + tinhTrang;
   }
    @Override
     public void viTri(String viTri) {
          // TODO Auto-generated method stub
          System.out.println("Vị Trí Của Sách :" + viTri);

     }
}







    
