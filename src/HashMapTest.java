import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Map<String,Object> request_param  = new HashMap<>();

		request_param.put("id","idtest");
		request_param.put("passwd","passwdtest");
		request_param.put("sessionid","sessiontest");

		System.out.println("id>>"+request_param.get("id"));
		System.out.println("id>>"+request_param.get("id").toString());
	}

}
