import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MilliDateChangeTest {

	public static void main(String[] args) throws IOException, ParseException {
		//String sourceDate = "2021-03-31 23:59:59";
		String sourceDate = "2021-12-10 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(sourceDate);
		long milli = date.getTime();

		System.out.println("milli>>"+milli);

	}
}
