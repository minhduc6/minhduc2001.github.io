import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSP {
     ArrayList<SanPham> listSP = new ArrayList<>();
     Scanner sc = new Scanner(System.in);

     public List<SanPham> getALL() throws FileNotFoundException {

          // SanPham sp1 = new SanPham("MSP01", "SamSung A5", "Đẹp", 5000000L, 6000000L, 10, 5, "SamSung", "Điện Thoại");
          // SanPham sp2 = new SanPham("MSP02", "SamSung A4", "Đẹp", 1000000L, 1500000L, 10, 5, "SamSung", "Điện Thoại");
          // SanPham sp3 = new SanPham("MSP03", "SamSung A3", "Đẹp", 2000000L, 6000000L, 10, 5, "SamSung", "Điện Thoại");
          // SanPham sp4 = new SanPham("MSP04", "SamSung A2", "Đẹp", 3000000L, 6000000L, 10, 5, "SamSung", "Điện Thoại");
          // SanPham sp5 = new SanPham("MSP05", "SamSung A1", "Đẹp", 10000000L, 14000000L, 10, 5, "SamSung", "Điện Thoại");

          // SanPham sp6 = new SanPham("MSP06", "DELL", "Đẹp", 4000000L, 6000000L, 10, 5, "DELL", "Laptop");
          // SanPham sp7 = new SanPham("MSP07", "ASUS", "Đẹp", 4000000L, 6000000L, 10, 5, "ASUS", "Laptop");

          // SanPham sp8 = new SanPham("MSP08", "Macbook m1", "Đẹp", 24000000L, 26000000L, 10, 5, "APPLE", "APPLE");
          // SanPham sp9 = new SanPham("MSP09", "IP12", "Đẹp", 24000000L, 26000000L, 10, 5, "APPLE", "APPLE");

          // SanPham sp10 = new SanPham("MSP10", "Tai Nghe", "Đẹp", 400000L, 600000L, 10, 5, "LG", "Phụ Kiện");
          // SanPham sp11 = new SanPham("MSP10", "Sạc", "Đẹp", 400000L, 600000L, 10, 5, "Redmid", "Phụ Kiện");

          // listSP.add(sp1);
          // listSP.add(sp2);
          // listSP.add(sp3);
          // listSP.add(sp4);
          // listSP.add(sp5);
          // listSP.add(sp6);
          // listSP.add(sp7);
          // listSP.add(sp8);
          // listSP.add(sp9);
          // listSP.add(sp10);
          // listSP.add(sp11);
          docGhiFile();

          return listSP;
     }

     public void show() {
          for (int i = 0; i < listSP.size(); i++) {
               System.out.println(listSP.get(i).toString());
          }
     }

     public void cau2() {
          System.out.println("1.Điện Thoại :");
          System.out.println("2.Laptop :");
          System.out.println("3.Apple :");
          System.out.println("4.Phụ Kiện :");
          int luachon;
          System.out.println("Nhập lựa chọn :");
          luachon = sc.nextInt();
          switch (luachon) {
               case 1:
                    for (int i = 0; i < listSP.size(); i++) {
                         if (listSP.get(i).getDanhMuc().equals("Điện thoại")) {
                              System.out.println(listSP.get(i).toString());
                         }

                    }
                    break;
               case 2:
                    for (int i = 0; i < listSP.size(); i++) {
                         if (listSP.get(i).getDanhMuc().equals("Laptop")) {
                              System.out.println(listSP.get(i).toString());
                         }
                    }
                    break;
               case 3:
                    for (int i = 0; i < listSP.size(); i++) {
                         if (listSP.get(i).getDanhMuc().equals("APPLE")) {
                              System.out.println(listSP.get(i).toString());
                         }
                    }
                    break;
               case 4:
                    for (int i = 0; i < listSP.size(); i++) {
                         if (listSP.get(i).getDanhMuc().equals("Phụ kiện")) {
                              System.out.println(listSP.get(i).toString());
                         }
                    }
                    break;

               default:
                    break;
          }

     }

     public void cau3() {
          String x;
          System.out.println("Nhập Hãng Cần Tìm Kiếm :");
          x = sc.nextLine();
          int dem = 0;

          for (int i = 0; i < listSP.size(); i++) {
               if (listSP.get(i).getHang().equalsIgnoreCase(x)) {
                    System.out.println(listSP.get(i).toString());
               }
               dem++;

          }
          if (dem == listSP.size()) {
               System.out.println("Không Có Sản Phẩm ");
          }

     }

     public void cau4() {
          System.out.println("1.Điện Thoại :");
          System.out.println("2.Laptop :");
          System.out.println("3.Apple :");
          System.out.println("4.Phụ Kiện :");
          int luachon;
          System.out.println("Nhập lựa chọn :");
          luachon = sc.nextInt();
          switch (luachon) {
               case 1:
                    System.out.println("1.Dưới 2 Triệu :");
                    System.out.println("2.Từ 2 - 4 Triệu :");
                    System.out.println("3.Từ 4 - 7 Triệu :");
                    System.out.println("4.Trên 13 Triệu :");
                    int luachon1;
                    System.out.println("Nhập lựa chọn :");
                    luachon1 = sc.nextInt();
                    switch (luachon1) {
                         case 1:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Điện thoại")
                                             && listSP.get(i).getGiaBan() < 2000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 2:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Điện thoại")
                                             && listSP.get(i).getGiaBan() >= 2000000L
                                             && listSP.get(i).getGiaBan() <= 4000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 3:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Điện thoại")
                                             && listSP.get(i).getGiaBan() >= 4000000L
                                             && listSP.get(i).getGiaBan() <= 7000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 4:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Điện thoại")
                                             && listSP.get(i).getGiaBan() > 13000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;

                         default:
                              break;
                    }
                    break;
               case 2:
                    System.out.println("1.Dưới 2 Triệu :");
                    System.out.println("2.Từ 2 - 4 Triệu :");
                    System.out.println("3.Từ 4 - 7 Triệu :");
                    System.out.println("4.Trên 13 Triệu :");
                    int luachon2;
                    System.out.println("Nhập lựa chọn :");
                    luachon2 = sc.nextInt();
                    switch (luachon2) {
                         case 1:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Laptop")
                                             && listSP.get(i).getGiaBan() < 2000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 2:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Laptop")
                                             && listSP.get(i).getGiaBan() >= 2000000L
                                             && listSP.get(i).getGiaBan() <= 4000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 3:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Laptop")
                                             && listSP.get(i).getGiaBan() >= 4000000L
                                             && listSP.get(i).getGiaBan() <= 7000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 4:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Laptop")
                                             && listSP.get(i).getGiaBan() > 13000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;

                         default:
                              break;
                    }
                    break;
               case 3:
                    System.out.println("1.Dưới 2 Triệu :");
                    System.out.println("2.Từ 2 - 4 Triệu :");
                    System.out.println("3.Từ 4 - 7 Triệu :");
                    System.out.println("4.Trên 13 Triệu :");
                    int luachon3;
                    System.out.println("Nhập lựa chọn :");
                    luachon3 = sc.nextInt();
                    switch (luachon3) {
                         case 1:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("APPLE")
                                             && listSP.get(i).getGiaBan() < 2000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 2:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("APPLE")
                                             && listSP.get(i).getGiaBan() >= 2000000L
                                             && listSP.get(i).getGiaBan() <= 4000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 3:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("APPLE")
                                             && listSP.get(i).getGiaBan() >= 4000000L
                                             && listSP.get(i).getGiaBan() <= 7000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 4:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("APPLE")
                                             && listSP.get(i).getGiaBan() > 13000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;

                         default:
                              break;
                    }
                    break;
               case 4:
                    System.out.println("1.Dưới 2 Triệu :");
                    System.out.println("2.Từ 2 - 4 Triệu :");
                    System.out.println("3.Từ 4 - 7 Triệu :");
                    System.out.println("4.Trên 13 Triệu :");
                    int luachon4;
                    System.out.println("Nhập lựa chọn :");
                    luachon4 = sc.nextInt();
                    switch (luachon4) {
                         case 1:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Phụ kiện")
                                             && listSP.get(i).getGiaBan() < 2000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 2:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Phụ kiện")
                                             && listSP.get(i).getGiaBan() >= 2000000L
                                             && listSP.get(i).getGiaBan() <= 4000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 3:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Phụ kiện")
                                             && listSP.get(i).getGiaBan() >= 4000000L
                                             && listSP.get(i).getGiaBan() <= 7000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;
                         case 4:
                              for (int i = 0; i < listSP.size(); i++) {
                                   if (listSP.get(i).getDanhMuc().equals("Phụ kiện")
                                             && listSP.get(i).getGiaBan() > 13000000L) {
                                        System.out.println(listSP.get(i).toString());
                                   }

                              }
                              break;

                         default:
                              break;
                    }
                    break;

               default:
                    break;
          }
     }

     public void cau5() {
          String x;
          System.out.println("Nhập vào chuỗi cần tìm kiếm : ");
          x = sc.nextLine();
          boolean z;
          int dem = 0;
          for (int i = 0; i < listSP.size(); i++) {
               z = listSP.get(i).getTen().contains(x);
               if (z == true) {
                    System.out.println(listSP.get(i).toString());
               }
               if (z == false) {
                    dem++;
               }

          }
          if (dem == listSP.size()) {
               System.out.println("Không tìm thấy Sản Phẩm ");

          }
     }

     public void docGhiFile() throws FileNotFoundException {
          File myFile = new File("input.txt");
          Scanner myReader;
          myReader = new Scanner(myFile);
          try {
               String s;
               while (myReader.hasNextLine()) {

                    s = myReader.nextLine();
                    String[] g = s.split(" - ");
                    String maSP = g[0].trim();
                    String ten = g[1].trim();
                    String moTa = g[2].trim();
                    long giaNhap = Long.parseLong(g[3].trim());
                    long giaBan = Long.valueOf(g[4].trim());
                    int soLuongTon = Integer.parseInt(g[5].trim());
                    int soLuongBan = Integer.parseInt(g[6].trim());
                    String hang = g[7].trim();
                    String danhMuc = g[8].trim();

                    listSP.add(new SanPham(maSP, ten, moTa, giaNhap, giaBan, soLuongTon, soLuongBan, hang, danhMuc));
               }
          } catch (Exception e) {
               // TODO Auto-generated catch block
               System.err.println(e.getMessage());
               e.printStackTrace();
          } finally {
               myReader.close();
          }
     }

     public void VaoFile() {
          try {
               FileOutputStream fos = new FileOutputStream("list_sp.txt", true);
               PrintWriter pw = new PrintWriter(fos);
               for (int i = 0; i < listSP.size(); i++) {
                    pw.print(listSP.get(i).getMaSP());
                    pw.print("-");
                    pw.print(listSP.get(i).getTen());
                    pw.print("-");
                    pw.print(listSP.get(i).getMoTa());
                    pw.print("-");
                    pw.print(listSP.get(i).getGiaNhap());
                    pw.print("-");
                    pw.print(listSP.get(i).getGiaBan());
                    pw.print("-");
                    pw.print(listSP.get(i).getSoLuongTon());
                    pw.print("-");
                    pw.print(listSP.get(i).getSoLuongBan());
                    pw.print("-");
                    pw.print(listSP.get(i).getHang());
                    pw.print("-");
                    pw.print(listSP.get(i).getDanhMuc());
                    pw.print("\n");

               }
               pw.close();
               fos.close();

          } catch (Exception e) {
               //TODO: handle exception
               System.err.println("Xuat Hien Loi :" + e.getMessage());
          } finally {

               System.out.println(" Đã lưu vào  vào file list_sp.txt thành công ... !");
          }
     }

     public void xoa() {
          Scanner sc = new Scanner(System.in);
          String x;
          System.out.println("Nhập Mã Sản Phẩm Bạn Cần Xóa :");
          x = sc.nextLine();
          

          for (int i = 0; i < listSP.size(); i++) {
               if (listSP.get(i).getMaSP().equals(x)) {

                    System.out.println(listSP.get(i).toString());
                    int luachon;
                    System.out.println("Bạn Có Muốn Xóa Không :");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    System.out.println("Nhập Lựa Chọn :");
                    luachon = Integer.parseInt(sc.nextLine());

                    switch (luachon) {
                         case 1:
                              listSP.remove(i);
                              break;

                         default:
                              break;

                    }
               }

          }

     }

     public void them()
     {
          SanPham sp = new SanPham();
          sp.input();
          listSP.add(sp);
     }

     public void sua()
     {
          Scanner sc = new Scanner(System.in);
          String x;
          System.out.println("Nhập Mã Sản Phẩm Bạn Cần Sửa :");
          x = sc.nextLine();

          for (int i = 0; i < listSP.size(); i++) {
               if (listSP.get(i).getMaSP().equals(x)) {
                     SanPham sp = new SanPham();
                     sp.input();
                     listSP.set(i, sp);
               }
          }
     }
}
