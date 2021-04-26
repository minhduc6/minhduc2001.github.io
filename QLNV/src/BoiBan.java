import java.util.Collections;

public class BoiBan extends NhanVien {
     
     private long compensate;

     public BoiBan() {
     }

     public BoiBan(String id, String name, int age, long basicSalary, long compensate) {
          super(id, name, age, basicSalary);
          this.compensate = compensate;
     }


     public long getCompensate() {
          return compensate;
     }

     public void setCompensate(long compensate) {
          this.compensate = compensate;
     }


    @Override
    public String toString() {
         // TODO Auto-generated method stub
         return super.toString() + "Tien bo :" +compensate +"  Tong Luong : " + calculatorSalary();
    }

     @Override
     public long calculatorSalary() {
          // TODO Auto-generated method stub
          return getBasicSalary() + compensate;

     }
     

    public static int comparatorSalary(BoiBan b1,BoiBan b2)
    {

         return b1.calculatorSalary() > b2.calculatorSalary() ? 1 : -1;

    }
    
     public static int comparatorName(BoiBan b1 ,BoiBan b2)
     {
          return b1.getName().compareTo(b2.getName());
     }



     
}
