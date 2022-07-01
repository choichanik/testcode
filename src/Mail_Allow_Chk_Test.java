
public class Mail_Allow_Chk_Test {

	public static void main(String[] args) {
		String sender = "choichanik@kisline.com";
		String result_addr = "amanda@kisline.com";

		if(sender == null || sender.indexOf("@kisline.com") > 0 || sender.indexOf("@kisreport.com") > 0
				|| sender.indexOf("@rm1.co.kr") > 0 || sender.indexOf("@ecredit.co.kr") > 0 || sender.indexOf("@nicetcb.co.kr") > 0){
			result_addr = sender;
		}

		System.out.println(result_addr);
	}

}
