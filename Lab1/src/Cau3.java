import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Cau3 {
    public static void main(String[] args) {
        //Lay ngay hien taij
      
        LocalDateTime c = LocalDateTime.now();
       


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
        String dateFomat = c.format(dateTimeFormatter);
        System.out.println(dateFomat);
    }
    
}
