import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class getMilliDateBetweenTest {

	public static void main(String[] args) throws IOException, ParseException {
		Calendar getToday = Calendar.getInstance();
		getToday.setTime(new Date()); //금일 날짜

		String s_date = "2020-03-01";
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(s_date);
		Calendar cmpDate = Calendar.getInstance();
		cmpDate.setTime(date); //특정 일자

		long diffSec = (getToday.getTimeInMillis() - cmpDate.getTimeInMillis()) / 1000;
		long diffDays = diffSec / (24*60*60); //일자수 차이

		System.out.println(diffSec + "초 차이");
		System.out.println(diffDays + "일 차이");

	}
}
