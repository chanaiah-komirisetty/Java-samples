import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date {
	public static void main(String[] args) throws ParseException {
		
		LocalDateTime ldt = LocalDateTime.now();
		//System.out.println(DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.ENGLISH).format(ldt));
		System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(ldt));


		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateInString = "2020-01-25 10:20:00";

        try {

            java.util.Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }

	}

}
