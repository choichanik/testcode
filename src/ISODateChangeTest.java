import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class ISODateChangeTest {

	public static void main(String[] args) throws IOException {
		//파일 객체 생성
		File file = new File("D:\\arrsrc.txt");
		//입력 스트림 생성
		FileReader filereader = new FileReader(file);
		//입력 버퍼 생성
		BufferedReader bufReader = new BufferedReader(filereader);
		String line = "";
		while((line = bufReader.readLine()) != null){
			//System.out.println(line);
			converDate(line);
		}
		//.readLine()은 끝에 개행문자를 읽지 않는다.
		bufReader.close();

	}


	public static void converDate(String ISODate){
		DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_DATE_TIME;

		OffsetDateTime offsetDateTime = OffsetDateTime.parse(ISODate, timeFormatter);

		Date date = Date.from(Instant.from(offsetDateTime));
		//System.out.println(date);

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(format.format(date)); // Fri May 29 11:06:29
	}
}
