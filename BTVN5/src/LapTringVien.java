import java.util.Scanner;
public class LapTringVien extends NhanVien {
     private float soGioOvertime;

     public LapTringVien() {
     }

     public LapTringVien(int code, String name, int age, String phone, String email, long salaryBasic,
               float soGioOvertime) {
          super(code, name, age, phone, email, salaryBasic);
          this.soGioOvertime = soGioOvertime;
     }

     public float getSoGioOvertime() {
          return soGioOvertime;
     }

     public void setSoGioOvertime(float soGioOvertime) {
          this.soGioOvertime = soGioOvertime;
     }

     @Override
     public void input() {
          // TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          super.input();
          System.out.println("Nhập số giờ làm ngoài giờ :");
          soGioOvertime = Float.parseFloat(sc.nextLine());
     }
     @Override
     public String toString() {
          // TODO Auto-generated method stub
          return super.toString() + "Salary :" + salaryLapTrinhVien();
     }

     public long salaryLapTrinhVien()
     {
          return (long) (getSalaryBasic() + soGioOvertime * 200000);
     }

     

     

     
     
}
