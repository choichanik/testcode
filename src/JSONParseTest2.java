import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class JSONParseTest2 {

	public static void main(String[] args) throws IOException, ParseException {
		String receiptStr = "{\"message\":{\"data\":\"eyJ2ZXJzaW9uIjoiMS4wIiwicGFja2FnZU5hbWUiOiJjb20ua2lzaW5mby5ibGl6emFyZGFwcCIsImV2ZW50VGltZU1pbGxpcyI6IjE2MjE1Njg3NTE3MTYiLCJ0ZXN0Tm90aWZpY2F0aW9uIjp7InZlcnNpb24iOiIxLjAifX0=\",\"messageId\":\"2420693349479586\",\"message_id\":\"2420693349479586\",\"publishTime\":\"2021-05-21T03:45:51.757Z\",\"publish_time\":\"2021-05-21T03:45:51.757Z\"},\"subscription\":\"projects/riotapp-62871/subscriptions/riotapp_subs_noti\"}";
		JSONParser jsonParser = new JSONParser();
		JSONObject receiptObject = (JSONObject) jsonParser.parse(receiptStr);

		System.out.println(receiptObject);
		System.out.println("message>>"+receiptObject.get("message"));
		System.out.println("subscription>>"+receiptObject.get("subscription"));

		JSONObject messageObject = (JSONObject) receiptObject.get("message");

		System.out.println("publishTime>>"+messageObject.get("publishTime"));
		System.out.println("publish_time>>"+messageObject.get("publish_time"));
		System.out.println("messageId>>"+messageObject.get("messageId"));
		System.out.println("message_id>>"+messageObject.get("message_id"));

		String data_str = messageObject.get("data").toString();
		byte[] plainbyte = data_str.getBytes();

		java.util.Base64.Decoder decoder = java.util.Base64.getDecoder();
		byte[] decodebyte = decoder.decode(plainbyte);

		System.out.println("data>>"+data_str);
		data_str = new String(decodebyte);

		JSONParser data_jsonParser = new JSONParser();
		JSONObject dataObject = (JSONObject) data_jsonParser.parse(data_str);

		System.out.println("data>>"+dataObject);
		System.out.println("packageName>>"+dataObject.get("packageName"));
		System.out.println("version>>"+dataObject.get("version"));
		System.out.println("eventTimeMillis>>"+dataObject.get("eventTimeMillis"));

		JSONObject testnotiObject = (JSONObject) dataObject.get("testNotification");

		System.out.println("testnotiObject>>"+testnotiObject);
		System.out.println("noti_version>>"+testnotiObject.get("version"));
	}
}
