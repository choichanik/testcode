import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMake_Test {

	public static void main(String[] args) {
		JSONArray jsonstr = new JSONArray().put(new JSONObject().put("send_date", "now")
				.put("content", new JSONObject().put("ko", "kokok"))
				.put("devices", "deveveve"));

		System.out.println(jsonstr.toString());
	}

}
