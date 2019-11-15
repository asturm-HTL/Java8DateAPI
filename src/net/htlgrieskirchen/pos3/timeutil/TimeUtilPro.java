package net.htlgrieskirchen.pos3.timeutil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import static java.time.ZoneId.systemDefault;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalQueries.zone;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import static java.util.Locale.getDefault;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TimeUtilPro
{   
    private TimeUtilPro() {
    }
    
                        public static void main(String[] args) 
                        {
                            Date date = new Date(12, 12, 12);
                           
                            TimeUtilPro t = new TimeUtilPro();
                            t.longToLocalDate(20191113L);
                            t.intToLocalDate(20180102);
                            t.dateToLocalDate(date);
                            
                            
                        }

    // ########## LOCALDATE METHODS ##########
    
    public static LocalDate intToLocalDate(int date) 
    {
       String intAsString = Integer.toString(date);
       
       LocalDate localDate = LocalDate.parse(intAsString, DateTimeFormatter.ofPattern("yyyyMMdd"));
       
        System.out.println("intToLocalDate -- Ergbenis ist: " +localDate);
       
        return localDate;
    }

    public static LocalDate longToLocalDate(long dateTime) 
    {
        String longAsString = Long.toString(dateTime);
    
        LocalDate date = LocalDate.parse(longAsString, DateTimeFormatter.ofPattern("yyyyMMdd"));
        
        System.out.println("longToLocalDate -- Ergebnis ist: " +date);
    
        return date;
    
    }
    
    public static LocalDate dateToLocalDate(Date dateTime) {
              
        System.out.println("dateToLocalDate -- Ergebnis ist: " + dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        return dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //toInstant = Instant-Objekte zeitzonenunabhängig 
        //atZone = gibt ZonedDateTime zurück, daher LocalDate nur mit toLocalDate() extrahieren
        //Instant is ein augenblicklicher Punkt auf der Zeitlinie, might be used to record event time-stamps
    }
    
    public static LocalDate calendarToLocalDate(Calendar dateTime) 
    {  
        return LocalDate.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
        
        /*LocalDate localDate = LocalDate.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
        System.out.println("calendarToLocalDate -- Ergbenis ist: "+ localDate);
    return null;*/
    }
   
    
    // ########## LOCALDATETIME METHODS ##########
            
    public static LocalDateTime intToLocalDateTime(int date) {
        return null;
    }
    
    public static LocalDateTime longToLocalDateTime(long dateTime) {
        return null;
    }
    
    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        return null;
    }
    
    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime) {
        return null;
    }
           
    // ########## INT METHODS ##########
    
    public static int localDateToInt(LocalDate date) {
        return -1;
    }

    public static int localDateTimeToInt(LocalDateTime dateTime) {
        return -1;
    }

    // ########## LONG METHODS ##########
    
    public static long localDateToLong(LocalDate date) {
        return -1L;
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        return -1L;
    }

    // ########## DATE METHODS ##########
    
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        return null;
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return null;
    }

    // ########## CALENDAR METHODS ##########
    
    public static Calendar localDateToCalendar(LocalDate date) {
        return null;
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        return null;
    }

}
