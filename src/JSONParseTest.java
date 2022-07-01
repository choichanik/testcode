import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JSONParseTest {

	public static void main(String[] args) throws IOException, ParseException {
		String receiptStr = "{\"receipt\":{\"receipt_type\":\"ProductionSandbox\", \"adam_id\":0, \"app_item_id\":0, \"bundle_id\":\"com.kisline.riotapp\", \"application_version\":\"1.0.31\", \"download_id\":0, \"version_external_identifier\":0, \"receipt_creation_date\":\"2021-03-12 07:53:49 Etc/GMT\", \"receipt_creation_date_ms\":\"1615535629000\", \"receipt_creation_date_pst\":\"2021-03-11 23:53:49 America/Los_Angeles\", \"request_date\":\"2021-03-12 07:53:52 Etc/GMT\", \"request_date_ms\":\"1615535632374\", \"request_date_pst\":\"2021-03-11 23:53:52 America/Los_Angeles\", \"original_purchase_date\":\"2013-08-01 07:00:00 Etc/GMT\", \"original_purchase_date_ms\":\"1375340400000\", \"original_purchase_date_pst\":\"2013-08-01 00:00:00 America/Los_Angeles\", \"original_application_version\":\"1.0\", \"in_app\":[{\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp02\", \"transaction_id\":\"1000000754887517\", \"original_transaction_id\":\"1000000754887517\", \"purchase_date\":\"2020-12-16 00:36:03 Etc/GMT\", \"purchase_date_ms\":\"*************\", \"purchase_date_pst\":\"2020-12-15 16:36:03 America/Los_Angeles\", \"original_purchase_date\":\"2020-12-16 00:36:03 Etc/GMT\", \"original_purchase_date_ms\":\"*************\", \"original_purchase_date_pst\":\"2020-12-15 16:36:03 America/Los_Angeles\", \"is_trial_period\":\"false\"}, {\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp01\", \"transaction_id\":\"1000000759311186\", \"original_transaction_id\":\"1000000759311186\", \"purchase_date\":\"2020-12-29 01:21:24 Etc/GMT\", \"purchase_date_ms\":\"*************\", \"purchase_date_pst\":\"2020-12-28 17:21:24 America/Los_Angeles\", \"original_purchase_date\":\"2020-12-29 01:21:24 Etc/GMT\", \"original_purchase_date_ms\":\"*************\", \"original_purchase_date_pst\":\"2020-12-28 17:21:24 America/Los_Angeles\", \"is_trial_period\":\"false\"}, {\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp01\", \"transaction_id\":\"1000000769613933\", \"original_transaction_id\":\"1000000769613933\", \"purchase_date\":\"2021-01-26 01:57:39 Etc/GMT\", \"purchase_date_ms\":\"1611626259000\", \"purchase_date_pst\":\"2021-01-25 17:57:39 America/Los_Angeles\", \"original_purchase_date\":\"2021-01-26 01:57:39 Etc/GMT\", \"original_purchase_date_ms\":\"1611626259000\", \"original_purchase_date_pst\":\"2021-01-25 17:57:39 America/Los_Angeles\", \"is_trial_period\":\"false\"}, {\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp01\", \"transaction_id\":\"1000000775992363\", \"original_transaction_id\":\"1000000775992363\", \"purchase_date\":\"2021-02-10 07:07:24 Etc/GMT\", \"purchase_date_ms\":\"1612940844000\", \"purchase_date_pst\":\"2021-02-09 23:07:24 America/Los_Angeles\", \"original_purchase_date\":\"2021-02-10 07:07:24 Etc/GMT\", \"original_purchase_date_ms\":\"1612940844000\", \"original_purchase_date_pst\":\"2021-02-09 23:07:24 America/Los_Angeles\", \"is_trial_period\":\"false\"}, {\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp01\", \"transaction_id\":\"1000000775992773\", \"original_transaction_id\":\"1000000775992773\", \"purchase_date\":\"2021-02-10 07:08:24 Etc/GMT\", \"purchase_date_ms\":\"1612940904000\", \"purchase_date_pst\":\"2021-02-09 23:08:24 America/Los_Angeles\", \"original_purchase_date\":\"2021-02-10 07:08:24 Etc/GMT\", \"original_purchase_date_ms\":\"1612940904000\", \"original_purchase_date_pst\":\"2021-02-09 23:08:24 America/Los_Angeles\", \"is_trial_period\":\"false\"}, {\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp01\", \"transaction_id\":\"1000000785720217\", \"original_transaction_id\":\"1000000785720217\", \"purchase_date\":\"2021-03-08 07:52:38 Etc/GMT\", \"purchase_date_ms\":\"1615189958000\", \"purchase_date_pst\":\"2021-03-07 23:52:38 America/Los_Angeles\", \"original_purchase_date\":\"2021-03-08 07:52:38 Etc/GMT\", \"original_purchase_date_ms\":\"1615189958000\", \"original_purchase_date_pst\":\"2021-03-07 23:52:38 America/Los_Angeles\", \"is_trial_period\":\"false\"}, {\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp01\", \"transaction_id\":\"1000000786053036\", \"original_transaction_id\":\"1000000786053036\", \"purchase_date\":\"2021-03-09 01:53:44 Etc/GMT\", \"purchase_date_ms\":\"1615254824000\", \"purchase_date_pst\":\"2021-03-08 17:53:44 America/Los_Angeles\", \"original_purchase_date\":\"2021-03-09 01:53:44 Etc/GMT\", \"original_purchase_date_ms\":\"1615254824000\", \"original_purchase_date_pst\":\"2021-03-08 17:53:44 America/Los_Angeles\", \"is_trial_period\":\"false\"}, {\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp02\", \"transaction_id\":\"1000000787897440\", \"original_transaction_id\":\"1000000787897440\", \"purchase_date\":\"2021-03-12 07:43:48 Etc/GMT\", \"purchase_date_ms\":\"1615535028000\", \"purchase_date_pst\":\"2021-03-11 23:43:48 America/Los_Angeles\", \"original_purchase_date\":\"2021-03-12 07:43:48 Etc/GMT\", \"original_purchase_date_ms\":\"1615535028000\", \"original_purchase_date_pst\":\"2021-03-11 23:43:48 America/Los_Angeles\", \"is_trial_period\":\"false\"}, {\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp04\", \"transaction_id\":\"1000000787901841\", \"original_transaction_id\":\"1000000787901841\", \"purchase_date\":\"2021-03-12 07:53:49 Etc/GMT\", \"purchase_date_ms\":\"1615535629000\", \"purchase_date_pst\":\"2021-03-11 23:53:49 America/Los_Angeles\", \"original_purchase_date\":\"2021-03-12 07:53:49 Etc/GMT\", \"original_purchase_date_ms\":\"1615535629000\", \"original_purchase_date_pst\":\"2021-03-11 23:53:49 America/Los_Angeles\", \"is_trial_period\":\"false\"}]}, \"environment\":\"Sandbox\", \"status\":0}";
		//String receiptStr = "{\"receipt\":{\"receipt_type\":\"ProductionSandbox\", \"adam_id\":0, \"app_item_id\":0, \"bundle_id\":\"com.kisline.riotapp\", \"application_version\":\"1.0.2\", \"download_id\":0, \"version_external_identifier\":0, \"receipt_creation_date\":\"2021-01-26 01:57:39 Etc/GMT\", \"receipt_creation_date_ms\":\"1611626259000\", \"receipt_creation_date_pst\":\"2021-01-25 17:57:39 America/Los_Angeles\", \"request_date\":\"2021-01-26 02:24:56 Etc/GMT\", \"request_date_ms\":\"1611627896264\", \"request_date_pst\":\"2021-01-25 18:24:56 America/Los_Angeles\", \"original_purchase_date\":\"2013-08-01 07:00:00 Etc/GMT\", \"original_purchase_date_ms\":\"1375340400000\", \"original_purchase_date_pst\":\"2013-08-01 00:00:00 America/Los_Angeles\", \"original_application_version\":\"1.0\", \"in_app\":[{\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp02\", \"transaction_id\":\"1000000754887517\", \"original_transaction_id\":\"1000000754887517\", \"purchase_date\":\"2020-12-16 00:36:03 Etc/GMT\", \"purchase_date_ms\":\"*************\", \"purchase_date_pst\":\"2020-12-15 16:36:03 America/Los_Angeles\", \"original_purchase_date\":\"2020-12-16 00:36:03 Etc/GMT\", \"original_purchase_date_ms\":\"*************\", \"original_purchase_date_pst\":\"2020-12-15 16:36:03 America/Los_Angeles\", \"is_trial_period\":\"false\"}, {\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp01\", \"transaction_id\":\"1000000759311186\", \"original_transaction_id\":\"1000000759311186\", \"purchase_date\":\"2020-12-29 01:21:24 Etc/GMT\", \"purchase_date_ms\":\"*************\", \"purchase_date_pst\":\"2020-12-28 17:21:24 America/Los_Angeles\", \"original_purchase_date\":\"2020-12-29 01:21:24 Etc/GMT\", \"original_purchase_date_ms\":\"*************\", \"original_purchase_date_pst\":\"2020-12-28 17:21:24 America/Los_Angeles\", \"is_trial_period\":\"false\"}, {\"quantity\":\"1\", \"product_id\":\"com.kisline.riotapp.inapp01\", \"transaction_id\":\"1000000769613933\", \"original_transaction_id\":\"1000000769613933\", \"purchase_date\":\"2021-01-26 01:57:39 Etc/GMT\", \"purchase_date_ms\":\"1611626259000\", \"purchase_date_pst\":\"2021-01-25 17:57:39 America/Los_Angeles\", \"original_purchase_date\":\"2021-01-26 01:57:39 Etc/GMT\", \"original_purchase_date_ms\":\"1611626259000\", \"original_purchase_date_pst\":\"2021-01-25 17:57:39 America/Los_Angeles\", \"is_trial_period\":\"false\"}]}, \"environment\":\"Sandbox\", \"status\":0}";
		//String receiptStr = "{\"status\":21002}";
		JSONParser jsonParser = new JSONParser();
		JSONObject receiptObject = (JSONObject) jsonParser.parse(receiptStr);

		System.out.println(receiptObject);
		System.out.println("environment>>"+receiptObject.get("environment"));
		System.out.println("status>>"+receiptObject.get("status"));

		JSONObject receiptbodyObject = (JSONObject) receiptObject.get("receipt");

		//System.out.println(receiptbodyObject);
		System.out.println("adam_id>>"+receiptbodyObject.get("adam_id"));
		System.out.println("receipt_creation_date>>"+receiptbodyObject.get("receipt_creation_date"));
		System.out.println("original_application_version>>"+receiptbodyObject.get("original_application_version"));
		System.out.println("app_item_id>>"+receiptbodyObject.get("app_item_id"));
		System.out.println("original_purchase_date_ms>>"+receiptbodyObject.get("original_purchase_date_ms"));
		System.out.println("request_date_ms>>"+receiptbodyObject.get("request_date_ms"));
		System.out.println("original_purchase_date_pst>>"+receiptbodyObject.get("original_purchase_date_pst"));
		System.out.println("original_purchase_date>>"+receiptbodyObject.get("original_purchase_date"));
		System.out.println("receipt_type>>"+receiptbodyObject.get("receipt_type"));
		System.out.println("bundle_id>>"+receiptbodyObject.get("bundle_id"));
		System.out.println("receipt_creation_date_ms>>"+receiptbodyObject.get("receipt_creation_date_ms"));
		System.out.println("request_date>>"+receiptbodyObject.get("request_date"));
		System.out.println("version_external_identifier>>"+receiptbodyObject.get("version_external_identifier"));
		System.out.println("request_date_pst>>"+receiptbodyObject.get("request_date_pst"));
		System.out.println("download_id>>"+receiptbodyObject.get("download_id"));
		System.out.println("application_version>>"+receiptbodyObject.get("application_version"));

		JSONArray inappArray = (JSONArray) receiptbodyObject.get("in_app");
		//System.out.println(inappArray);
		System.out.println("===================================================================================");
		for(int i=0 ; i<inappArray.size() ; i++){
			JSONObject inappDetailObject = (JSONObject) inappArray.get(i);
			//System.out.println(inappDetailObject);
			System.out.println("transaction_id>>"+inappDetailObject.get("transaction_id"));
			System.out.println("original_purchase_date>>"+inappDetailObject.get("original_purchase_date"));
			System.out.println("quantity>>"+inappDetailObject.get("quantity"));
			System.out.println("original_transaction_id>>"+inappDetailObject.get("original_transaction_id"));
			System.out.println("purchase_date_pst>>"+inappDetailObject.get("purchase_date_pst"));
			System.out.println("original_purchase_date_ms>>"+inappDetailObject.get("original_purchase_date_ms"));
			System.out.println("purchase_date_ms>>"+inappDetailObject.get("purchase_date_ms"));
			System.out.println("product_id>>"+inappDetailObject.get("product_id"));
			System.out.println("original_purchase_date_pst>>"+inappDetailObject.get("original_purchase_date_pst"));
			System.out.println("is_trial_period>>"+inappDetailObject.get("is_trial_period"));
			System.out.println("purchase_date>>"+inappDetailObject.get("purchase_date"));
			System.out.println("===================================================================================");
		}


		//JSONObject WebServiceObject = (JSONObject) jsonObject.get("WebService");
		//JSONObject OperationResponseObject = (JSONObject) WebServiceObject.get("OperationResponse");
		//JSONObject EG0502Object = (JSONObject) OperationResponseObject.get("EG0502");
		//JSONObject ItemsObject = (JSONObject) EG0502Object.get("Items");
		//JSONObject ItemObject = (JSONObject) ItemsObject.get("Item");

		/*
		String receiptStr2 = "{\"status\":21002}";
		JSONParser jsonParser_ERROR = new JSONParser();
		JSONObject receiptObject_ERROR = (JSONObject) jsonParser_ERROR.parse(receiptStr2);
		System.out.println(receiptObject_ERROR);
		System.out.println("status>>"+receiptObject_ERROR.get("status"));
		*/

		/*
		String refundStr = "{" +
				"\"tokenPagination\": {"+
				"\"nextPageToken\": \"testtoken\""+
				"},"+
				"\"voidedPurchases\": [" +
				"{" +
				"\"purchaseToken\": \"bkcejlcfgcilolnlofmefmkn.AO-J1OymqDIa_67R6lcagUfBerJC_fwybSdFQHXo2ZsnXZZsq1c3-OfNd1p9ylTvEOg5VHBf-AmPW4myZFfmsluVRSQfnpn14j7QeFDcwjV93-UtiIbGADA\"," +
				"\"purchaseTimeMillis\": \"1615255340890\"," +
				"\"voidedTimeMillis\": \"1615255709567\"," +
				"\"orderId\": \"GPA.3389-8915-7652-88417\"," +
				"\"voidedSource\": 0," +
				"\"voidedReason\": 4," +
				"\"kind\": \"androidpublisher#voidedPurchase\"" +
				"}," +
				"{" +
				"\"purchaseToken\": \"effmpfcakfgdplbphlikndmf.AO-J1OyTvLs1uW9Jqvn_SBbbZc7o88Itgiw0Ze6euOJNlit8C4Ro92R_k_IxP63_5erX-twd5ZU6mwgmksqj0-q_tX1lmRRL5hvRBABKEY5Phi0iyrB3sXk\"," +
				"\"purchaseTimeMillis\": \"1615257431875\"," +
				"\"voidedTimeMillis\": \"1615257540448\"," +
				"\"orderId\": \"GPA.3323-0027-6627-13190\"," +
				"\"voidedSource\": 0," + //0-사용자 1-개발자 2-Google운영팀
				"\"voidedReason\": 4," + //0-기타 1-고객변심 2-거절 3-제품결함 4-잘못된구매 5-제품설명과 다름 6-가족의무단구매 7-지불거절..?
				"\"kind\": \"androidpublisher#voidedPurchase\"" +
				"}" +
				"  ]" +
				"}";



		//System.out.println(refundStr);
		JSONParser refundJsonParser = new JSONParser();
		JSONObject refundObject = (JSONObject) refundJsonParser.parse(refundStr);

		JSONArray refundArray = (JSONArray) refundObject.get("voidedPurchases");

		System.out.println("nextCHK>>"+(refundObject.get("tokenPagination")!=null));

		JSONObject tokenPagination = (JSONObject) refundObject.get("tokenPagination");

		System.out.println("tokenPagination>>"+tokenPagination);
		System.out.println("nextPageToken>>"+tokenPagination.get("nextPageToken"));

		//JSONObject nextPageToken = (JSONObject) tokenPagination.get("nextPageToken");

		//System.out.println("nextPageToken>>"+nextPageToken);

		//System.out.println(refundArray);

		for(int i=0 ; i<refundArray.size() ; i++){
			JSONObject refundDetailObject = (JSONObject) refundArray.get(i);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

			Date purchaseTimeMilli = new Date(Long.parseLong(refundDetailObject.get("purchaseTimeMillis").toString()));
			String purchaseTime = sdf.format(purchaseTimeMilli);

			Date voidTimeMilli = new Date(Long.parseLong(refundDetailObject.get("voidedTimeMillis").toString()));
			String voidTime = sdf.format(voidTimeMilli);

			System.out.println("purchaseToken>>"+refundDetailObject.get("purchaseToken"));
			System.out.println("purchaseTimeMillis>>"+purchaseTime);
			System.out.println("voidedTimeMillis>>"+voidTime);
			System.out.println("orderId>>"+refundDetailObject.get("orderId"));
			System.out.println("voidedSource>>"+refundDetailObject.get("voidedSource"));
			System.out.println("voidedReason>>"+refundDetailObject.get("voidedReason"));
			System.out.println("kind>>"+refundDetailObject.get("kind"));
		}
		*/
	}
}
