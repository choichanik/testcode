
import sun.misc.BASE64Encoder;

import java.util.Base64;

public class indexofTest2 {

	public static void main(String[] args) {
		String hreq = "/etomato/fncr/homeRenewFncr.nice";

		System.out.println(hreq.indexOf("fncr"));
		System.out.println(hreq.indexOf("Fncr"));
		System.out.println(hreq.indexOf("cons"));
		System.out.println(hreq.indexOf("Cons"));
	}

}
