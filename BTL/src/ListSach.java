import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListSach {
     private List<Sach> SachList;
     private List<Sach> listDanhMuc;

     public List<Sach> getSachList() {
          return SachList;
     }

     public void setSachList(List<Sach> sachList) {
          SachList = sachList;
     }

     public List<Sach> getListDanhMuc() {
          return listDanhMuc;
     }

     public void setListDanhMuc(List<Sach> listDanhMuc) {
          this.listDanhMuc = listDanhMuc;
     }

     public ListSach() {
          SachList = new ArrayList<>();
          try {
               File myObj = new File("data.txt");

               if (myObj.length() != 0) {
                    Scanner myReader = new Scanner(myObj);
                    // myReader.useDelimiter(",");
                    while (myReader.hasNextLine()) {
                         Sach sach = new Sach();
                         String str = myReader.nextLine();
                         String[] splitString = str.split(",");
                         sach.setMaSach(splitString[0].trim());
                         sach.setTenSach(splitString[1].trim());
                         sach.setTacGia(splitString[2].trim());
                         sach.setNhaCungCap(splitString[3].trim());
                         sach.setNhaXuatBan(splitString[4].trim());
                         sach.setGiaNhap(Long.parseLong(splitString[5].trim()));
                         sach.setGiaBan(Long.parseLong(splitString[6].trim()));
                         sach.setDanhGia(splitString[7]);
                         sach.setSoLuongBan(Integer.parseInt(splitString[8].trim()));
                         sach.setSoLuongKho(Integer.parseInt(splitString[9].trim()));
                         sach.setDanhMuc(splitString[10].trim());
                         SachList.add(sach);

                    }
                    myReader.close();
               }
          } catch (Exception e) {
               //TODO: handle exception
               e.printStackTrace();
          }

     }

     public void output() {
          int i = 0;
          System.out.println(SachList.size());
          for (Sach sach : SachList) {
               System.out.println(
                         "==============================Quyển Sách Thứ " + (i + 1) + "============================");
               sach.show();
               i++;
          }
     }

     public List<Sach> LaySachTheoDanhMuc(String danhMucString) {
          listDanhMuc = new ArrayList<>();
          for (int i = 0; i < SachList.size(); i++) {
               if (SachList.get(i).getDanhMuc().equalsIgnoreCase(danhMucString)) {
                    listDanhMuc.add(SachList.get(i));
               }

          }
          return listDanhMuc;
     }

     public void getListDM() {
          int i = 0;

          for (Sach sach : listDanhMuc) {
               System.out.println(
                         "==============================Quyển Sách Thứ " + (i + 1) + "============================");
               sach.show();
               i++;
          }
     }

     public void sapXepGia() {
          Collections.sort(listDanhMuc, new Comparator<Sach>() {

               @Override
               public int compare(Sach o1, Sach o2) {
                    // TODO Auto-generated method stub
                    return o1.getGiaBan() > o2.getGiaBan() ? 1 : -1;
               }

          });
          getListDM();
     }

     public void layTheoDanhMucvaMucGia() {
          Scanner sc = new Scanner(System.in);
          int luachon;
          System.out.println("Nhập Lựa Chọn Của Bạn :");
          luachon = Integer.parseInt(sc.nextLine());
          int dem = 0;
          switch (luachon) {
               case 1:
                    for (int i = 0; i < listDanhMuc.size(); i++) {
                         if (listDanhMuc.get(i).getGiaBan() < 30000) {
                              System.out.println("================================= Quyển Sách Thứ " + (i + 1)
                                        + "===========================");
                              listDanhMuc.get(i).show();
                              dem++;
                         }
                    }
                    if (dem == 0) {
                         System.out.println("Không có Cuốn Sách Nào");
                    }
                    break;
               case 2:
                    for (int i = 0; i < listDanhMuc.size(); i++) {
                         if (listDanhMuc.get(i).getGiaBan() >= 30000 && listDanhMuc.get(i).getGiaBan() < 50000) {
                              System.out.println("================================= Quyển Sách Thứ " + (i + 1)
                                        + "===========================");
                              listDanhMuc.get(i).show();
                         }
                    }
                    if (dem == 0) {
                         System.out.println("Không có Cuốn Sách Nào");
                    }
                    break;
               case 3:
                    for (int i = 0; i < listDanhMuc.size(); i++) {
                         if (listDanhMuc.get(i).getGiaBan() >= 50000 && listDanhMuc.get(i).getGiaBan() < 100000) {
                              System.out.println("================================= Quyển Sách Thứ " + (i + 1)
                                        + "===========================");
                              listDanhMuc.get(i).show();
                         }
                    }
                    if (dem == 0) {
                         System.out.println("Không có Cuốn Sách Nào");
                    }
                    break;
               case 4:
                    for (int i = 0; i < listDanhMuc.size(); i++) {
                         if (listDanhMuc.get(i).getGiaBan() >= 100000) {
                              System.out.println("================================= Quyển Sách Thứ " + (i + 1)
                                        + "===========================");
                              listDanhMuc.get(i).show();
                         }
                    }

                    if (dem == 0) {
                         System.out.println("Không có Cuốn Sách Nào");
                    }

                    break;

               default:
                    break;
          }
     }

     public void timKiem() {
          Scanner sc = new Scanner(System.in);
          String x;
          System.out.println("Nhập Cuốn Sách Mà Bạn Tìm Kiếm :");
          x = sc.nextLine();
          boolean z;
          int dem = 0;

          for (int i = 0; i < SachList.size(); i++) {
             if(z = SachList.get(i).getMaSach().contains(x))
             {
                  SachList.get(i).show();
             }
             if(z == false)
             {
                  dem++;
             }
          }
          if (dem == SachList.size()) {
               System.out.println("Không tìm thấy Sản Phẩm ");

          }
     }

     public void xoa() {
          Scanner sc = new Scanner(System.in);
          String x;
          System.out.println("Nhập Mã mà Cuốn Sách Bạn Tìm Kiếm :");
          x = sc.nextLine();
          boolean z;
          int dem = 0;

          for (int i = 0; i < SachList.size(); i++) {
               if (z = SachList.get(i).getMaSach().contains(x)) {
                    SachList.get(i).show();
                    int luachon;
                    System.out.println("Bạn Có Muốn Xóa Sản Phẩm Không :");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    luachon = Integer.parseInt(sc.nextLine());
                    switch (luachon) {
                         case 1:
                              SachList.remove(i);
                              System.out.println("Chúc Mừng Bạn Đã Xóa Thành Công");
                              break;

                         default:
                              break;
                    }
               }
               if (z == false) {
                    dem++;
               }
          }
           if (dem == SachList.size()) {
               System.out.println("Không tìm thấy Sản Phẩm ");

          }

     }

     public void capnhat() {
          Scanner sc = new Scanner(System.in);
          String x;
          System.out.println("Nhập Mã mà Cuốn Sách Bạn Muốn Sửa :");
          x = sc.nextLine();
          boolean z;
          int dem = 0;

          for (int i = 0; i < SachList.size(); i++) {
               if (z = SachList.get(i).getMaSach().equals(x)) {
                    SachList.get(i).show();
                    int luachon;
                    System.out.println("Bạn Có Muốn Sửa Sản Phẩm Không :");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    luachon = Integer.parseInt(sc.nextLine());
                    Sach book = new Sach();
                    book.input();

                    switch (luachon) {
                         case 1:
                              SachList.set(i, book);
                              System.out.println("Chúc Mừng Bạn Đã Sửa Thành Công");
                              SachList.get(i).show();
                              break;

                         default:
                              break;
                    }
               }
               if (z == false) {
                    dem++;
               }
          }
          if (dem == SachList.size()) {
               System.out.println("Không tìm thấy Sản Phẩm ");

          }

     }

     public void them()
     {
          Sach book = new Sach();
          book.input();
          SachList.add(book);
          book.show();
     }

     public void vaoFile()
     {
          try {
               FileOutputStream fos = new FileOutputStream("list_book.txt", true);
               PrintWriter pw = new PrintWriter(fos);
               for (int i = 0; i < SachList.size(); i++) {

                    pw.print(SachList.get(i).getMaSach());
                    pw.print(",");
                    pw.print(SachList.get(i).getTenSach());
                    pw.print(",");
                    pw.print(SachList.get(i).getTacGia());
                    pw.print(",");
                    pw.print(SachList.get(i).getNhaCungCap());
                    pw.print(",");
                    pw.print(SachList.get(i).getNhaXuatBan());
                    pw.print(",");
                    pw.print(SachList.get(i).getGiaNhap());
                    pw.print(",");
                    pw.print(SachList.get(i).getGiaBan());
                    pw.print(",");
                    pw.print(SachList.get(i).getDanhGia());
                    pw.print(",");
                    pw.print(SachList.get(i).getSoLuongBan());
                    pw.print(",");
                    pw.print(SachList.get(i).getSoLuongKho());
                    pw.print(",");
                    pw.print(SachList.get(i).getDanhMuc());
                    pw.println();

               }
               pw.close();
               fos.close();

          } catch (Exception e) {
               //TODO: handle exception
               System.err.println("Xuat Hien Loi :" + e.getMessage());
          } finally {
               System.out.println("Đã lưu thành công vào file list_book.txt.............!!!!!!!");
          }
     }

     
     public void sach5Sao()
     {
          for (int i = 0; i < SachList.size(); i++) {
               if (SachList.get(i).getDanhGia().equals("5 Sao")) {
                    System.out.println("===========================================");
                    SachList.get(i).show();
               }
          }
     }

     public void doanhThuCuaMotCuonSach()
     {
          Scanner sc = new Scanner(System.in);
          String x;
          System.out.println("Nhập Cuốn Sách Mà Bạn Tìm Kiếm :");
          x = sc.nextLine();
          boolean z;
          int dem = 0;

          for (int i = 0; i < SachList.size(); i++) {
               if (z = SachList.get(i).getMaSach().contains(x)) {
                    SachList.get(i).show();
                    System.out.println("===========================================");
                    System.out.println("Doanh Thu Của Cuốn Sách Là :"
                              + ((SachList.get(i).getGiaBan() - SachList.get(i).getGiaNhap())
                                        * SachList.get(i).getSoLuongBan()));
               }
               if (z == false) {
                    dem++;
               }
          }
          if (dem == SachList.size()) {
               System.out.println("Không Có Sản Phẩm ");

          }
     }
     
     public void doanhThuCuaHang()
     {
          long sum = 0;
          for (int i = 0; i < SachList.size(); i++) {
               sum += ((SachList.get(i).getGiaBan() - SachList.get(i).getGiaNhap()) * SachList.get(i).getSoLuongBan());
          }

          System.out.println("Doanh Thu Của Cửa Hàng : " + sum);
     }
     
     public void sapXepSLBan()
     {
          Collections.sort(SachList, new Comparator<Sach>() {

               @Override
               public int compare(Sach o1, Sach o2) {
                    // TODO Auto-generated method stub
                    return o1.getSoLuongBan() < o2.getSoLuongBan() ? 1 : -1;
               }

          });

          int dem = 0;

          for (int i = 0; i < SachList.size(); i++) {
               System.out.println("==============Quyển Sách " + (i + 1) + "==================================");
               SachList.get(i).show();
               dem++;
               if (dem == 10) {
                    break;
               }
          }
     }
     


      public void sapXepSLKho()
      {
           Collections.sort(SachList, new Comparator<Sach>() {

                @Override
                public int compare(Sach o1, Sach o2) {
                     // TODO Auto-generated method stub
                     return o1.getSoLuongKho() < o2.getSoLuongKho() ? 1 : -1;
                }

           });

           int dem = 0;

           for (int i = 0; i < SachList.size(); i++) {
                System.out.println("==============Quyển Sách " + (i + 1) + "==================================");
                SachList.get(i).show();
                dem++;
                if (dem == 10) {
                     break;
                }
           }
      }
     
     public void deXuat()
     {
          int min = 0;
          int max = SachList.size();

          int k;


          for (int i = 0; i < 5; i++) {
               k = (int) (Math.random() * (max - min + 1) + min);
               System.out.println("================================");
               SachList.get(k).show();
          }



     }









}





    


     

