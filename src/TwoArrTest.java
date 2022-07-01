import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TwoArrTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String[][] RecieverArr = {
				{"관리자","nicerating@nice.co.kr"},
				{"신용운","ywshin@nice.co.kr"},
				{"이화수","nicelee@nice.co.kr"}
		};

		for(int i=0 ; i<RecieverArr.length ; i++){
			System.out.println("Name>>"+RecieverArr[i][0]);
			System.out.println("Eml>>"+RecieverArr[i][1]);
		}
	}

}
