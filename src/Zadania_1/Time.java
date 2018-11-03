package Zadania_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

   public class Time {



     public String printDateTime() {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");

         LocalDateTime now = LocalDateTime.now();

         return now.format(formatter);
     }

   }