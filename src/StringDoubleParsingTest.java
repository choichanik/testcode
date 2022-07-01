import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class StringDoubleParsingTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String ver1 = "0.0.9";
		String ver2 = "0.1.0";

		boolean needUpdate = false;

		String result1, result2;
		//String version1 = "0.1.2";
		//String version2 = "0.1.11";
		String version1 = "1.0.9";
		String version2 = "1.1.0";
		StringTokenizer stok1 = new StringTokenizer(version1,".");
		StringTokenizer stok2 = new StringTokenizer(version2,".");
		if(!version1.equals(version2)){
			while(true){
				result1 = stok1.nextToken();
				result2 = stok2.nextToken();
				if(result1.equals(result2)) continue;
				else{
					int num1 = Integer.parseInt(result1);
					int num2 = Integer.parseInt(result2);
					//System.out.println(num1>num2 ? version1+">"+version2 : version1+"<"+version2);
					if(num1<num2){
						needUpdate = true;
					}
					break;
				}
			}
		}

		System.out.println("업데이트 필요 여부>>"+needUpdate);

	}

}
