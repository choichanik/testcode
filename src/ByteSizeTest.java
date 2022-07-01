import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteSizeTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String str = "2017-01-01";

		byte[] buf = str.getBytes();              
		// 유니코드인 str을 시스템 디폴트 인코딩 방식으로 인코딩
		byte[] buf2 = null;
		try {
			buf2 = str.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}  

		// 유니코드인 str을 UTF-8 형식으로 인코딩 (인코딩 정보는 원하는 것을 임의로 넣을 수 있음)
		String str1 = new String(buf);                 

		// 바이트 배열이 시스템 디폴트 방식으로 인코딩 되어있음을 알려 줌.
		try {
			String str2 = new String(buf2, "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}   

		// 바이트 배열이 "UTF-8" 방식으로 인코딩되어 있음을 알려 줌. UTF-8로 바꾸라는 의미가 아님. 즉, 뒤의 "UTF-8"은 임의로 넣을 수 있는 것이 아니고, decoding하는 놈에게 정보를 제공하는 것임.
					
		byte []b = new byte[]{-21, -117, -76, -21, -78, -68, -21, -99, -67};
		String c = null;
		try {
			c = new String(b, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // new String(b, "UTF-8")  
		System.out.println("Result:" + c);
					
		Charset cset = Charset.defaultCharset();
		String csetName = cset.name();
		System.out.println("default charset:" + csetName);
					
		System.out.println("system default encoding : " + System.getProperty("file.encoding"));

		String s = "나눔"; 

		//이 소스 파일이 저장된 형식은 중요하지 않음. (실제로는 "나눔"을 표현하는 유니코드임)

		byte[] bytes1 = s.getBytes();
		byte[] bytes2 = s.getBytes("UTF-8"); // utf-8로 저장된 파일과 같음
		byte[] bytes3 = s.getBytes("EUC-KR"); // euc-kr로 저장된 파일과 같음

		String s1 = new String(bytes1);
		String s2 = new String(bytes2, "UTF-8"); 

		// byte2는 utf-8로 인코딩(저장)되어 있으므로, 알아서 잘 디코딩하라는 뜻임.
		String s2_ = new String(bytes2); 
		String s3 = new String(bytes3, "EUC-KR");
		String s3_ = new String(bytes3);
		String s4 = new String(bytes3, "UTF-8"); 

		// 이것은 깨짐. 왜냐하면 euc-kr로 인코딩된 것을 utf-8로 풀려고 하기 때문임.
		System.out.println("default : " + s1);
		System.out.println("utf-8(1) : " + s2.getBytes().length);
		System.out.println("utf-8(2) : " + s2_);
		System.out.println("euc-kr(1) : " + s3);
		System.out.println("euc-kr(2) : " + s3_);
		System.out.println("잘못된 디코딩 : " + s4);
	}

}
