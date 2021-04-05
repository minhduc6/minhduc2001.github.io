import java.util.Scanner;

public class Employee {
     private int id;
     private String name;
     private String dateOfBirth;
     private String address;
     private String position;
     private double basicSalary;

     public Employee() {
     }

     public Employee(int id, String name, String dateOfBirth, String address, String position, Double basicSalary) {
          this.id = id;
          this.name = name;
          this.dateOfBirth = dateOfBirth;
          this.address = address;
          this.position = position;
          this.basicSalary = basicSalary;
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getDateOfBirth() {
          return dateOfBirth;
     }

     public void setDateOfBirth(String dateOfBirth) {
          this.dateOfBirth = dateOfBirth;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public String getPosition() {
          return position;
     }

     public void setPosition(String position) {
          this.position = position;
     }

     public double getBasicSalary() {
          return basicSalary;
     }

     public void setBasicSalary(float basicSalary) {
          this.basicSalary = basicSalary;
     }

     public void input()
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhập ID của Nhân Viên :");
          id = sc.nextInt();
          sc.nextLine();
          System.out.println("Nhập Tên của Nhân Viên :");
          name = sc.nextLine();
          System.out.println("Nhập Ngày Tháng Năm Sinh của Nhân Viên :");
          dateOfBirth = sc.nextLine();
          System.out.println("Nhập Địa chỉ của Nhân Viên :");
          address = sc.nextLine();
          System.out.println("Nhập Vị trí của Nhân Viên :");
          position = sc.nextLine();
          System.out.println("Nhập Lương Cơ Bản của Nhân Viên :");
          basicSalary = sc.nextFloat();
     }

     public void display()
     {
          System.out.println("ID :" + id);
          System.out.println("Name :" + name);
          System.out.println("DateOfBirth: " + dateOfBirth);
          System.out.println("Address :" + address);
          System.out.println("Position :" + position);
          System.out.println("Basic Salary :" + basicSalary);
     }

     public double salaryCalculator(double soGioTangCa)
     {
          double salary = basicSalary + (100000 * soGioTangCa);
          return salary;
     }

     

     
     
}
