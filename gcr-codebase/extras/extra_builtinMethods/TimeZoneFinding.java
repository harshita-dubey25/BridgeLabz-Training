import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class TimeZoneFinding{
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
		System.out.println();
        
        ZonedDateTime localTime = ZonedDateTime.now();
        System.out.println("System Default Time : " + localTime.format(formatter));

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("India Time : " + indiaTime.format(formatter));

        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York Time : " + newYorkTime.format(formatter));

		ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Los Angleles Time :"+pstTime.format(formatter));
        
    }
}
