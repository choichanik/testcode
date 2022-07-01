import java.io.IOException;
import java.net.URLDecoder;

public class RunningTimeTest {

	public static void main(String[] args) throws IOException {
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

		System.out.println("시간차이(m) : "+((System.currentTimeMillis() - beforeTime)));

	}
}
