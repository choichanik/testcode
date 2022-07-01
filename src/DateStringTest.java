import java.text.DecimalFormat;

public class DateStringTest {

	public static void main(String[] args) {
		String date = "20220105";

		date = String.valueOf(Integer.parseInt(date) - 10000);

		System.out.println("date>>"+date);
	}

}
