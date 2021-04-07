import java.util.Scanner;

public class KiemChungVien extends NhanVien {
     private int soLoiPhatHien;

     public KiemChungVien() {
     }

     public KiemChungVien(int code, String name, int age, String phone, String email, long salaryBasic,
               int soLoiPhatHien) {
          super(code, name, age, phone, email, salaryBasic);
          this.soLoiPhatHien = soLoiPhatHien;
     }

     public int getSoLoiPhatHien() {
          return soLoiPhatHien;
     }

     public void setSoLoiPhatHien(int soLoiPhatHien) {
          this.soLoiPhatHien = soLoiPhatHien;
     }

     @Override
     public void input() {
          // TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          super.input();
          System.out.println("Nhập số lỗi phát hiện được :");
          soLoiPhatHien = Integer.parseInt(sc.nextLine());
     }
     @Override
     public String toString() {
          // TODO Auto-generated method stub
          return super.toString() + "- Salary :" + salaryKiemChungVien();
     }

     public long salaryKiemChungVien()
     {
          return getSalaryBasic() + soLoiPhatHien * 50000;
     }
     


     
      

     
     
     
}
