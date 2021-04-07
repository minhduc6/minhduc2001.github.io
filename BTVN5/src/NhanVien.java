import java.util.Scanner;

public class NhanVien {
     private int code;
     private String name;
     private int age;
     private String phone;
     private String email;
     private long salaryBasic;


     public NhanVien() {
     }


     public NhanVien(int code, String name, int age, String phone, String email, long salaryBasic) {
          this.code = code;
          this.name = name;
          this.age = age;
          this.phone = phone;
          this.email = email;
          this.salaryBasic = salaryBasic;
     }


     public int getCode() {
          return code;
     }


     public void setCode(int code) {
          this.code = code;
     }


     public String getName() {
          return name;
     }


     public void setName(String name) {
          this.name = name;
     }


     public int getAge() {
          return age;
     }


     public void setAge(int age) {
          this.age = age;
     }


     public String getPhone() {
          return phone;
     }


     public void setPhone(String phone) {
          this.phone = phone;
     }


     public String getEmail() {
          return email;
     }


     public void setEmail(String email) {
          this.email = email;
     }


     public long getSalaryBasic() {
          return salaryBasic;
     }


     public void setSalaryBasic(long salaryBasic) {
          this.salaryBasic = salaryBasic;
     }

     public void input()
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhập mã nhân viên :");
          code = Integer.parseInt(sc.nextLine());
          System.out.println("Nhập Tên Nhân Viên :");
          name = sc.nextLine();
          System.out.println("Nhập Tuổi Của Nhân Viên ;");
          age = Integer.parseInt(sc.nextLine());
          System.out.println("Nhập số điện thoại của bạn :");
          phone = sc.nextLine();
          System.out.println("Nhập email của nhân viên :");
          email = sc.nextLine();
          System.out.println("Nhập Lương Cơ Bản của nhân viên :");
          salaryBasic = Long.parseLong(sc.nextLine());
     }


     @Override
     public String toString() {
          return "Code=" + code + "- Name=" + name + "- Age =" + age + "- Email=" + email + ", Phone=" + phone
                    + "- SalaryBasic=" + salaryBasic ;
     }


     

     

     


     

     
}