package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class newDate {
    public static void main(String[] args){
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDate);
        System.out.println(myTime);
        System.out.println(myDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        String formattedDate = myDateTime.format(formatter);    
        System.out.println(formattedDate);
    }
}
