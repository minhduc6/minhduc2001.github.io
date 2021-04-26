public class Bep extends NhanVien
{
     private long serviceCharge;


     public Bep() {
     }


     public Bep(String id, String name, int age, long basicSalary, long serviceCharge) {
          super(id, name, age, basicSalary);
          this.serviceCharge = serviceCharge;
     }


     @Override
     public String toString() {
          // TODO Auto-generated method stub
          return super.toString() + "Tien Dich Vu :" + serviceCharge + "Tong Luong :" + calculatorSalary();
     }
     



     public long getServiceCharge() {
          return serviceCharge;
     }


     public void setServiceCharge(long serviceCharge) {
          this.serviceCharge = serviceCharge;
     }


     @Override
     public long calculatorSalary() {
          // TODO Auto-generated method stub
          return serviceCharge + getBasicSalary();
     }

      public static int comparatorSalary(Bep b1,Bep b2)
      {

           return b1.calculatorSalary() > b2.calculatorSalary() ? 1 : -1;

      }

     public static int comparatorName(Bep b1 ,Bep b2)
     {
          return b1.getName().compareTo(b2.getName());
     }
     
}
