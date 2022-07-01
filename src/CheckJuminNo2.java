import java.util.regex.Pattern;

public class CheckJuminNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String JuminFullNo = "900909-1319611";
		String CheckTarget = JuminFullNo.replaceAll("-", "");
		System.out.println(checkRegNoNumber(CheckTarget));
	}

	public static boolean checkRegNoNumber(String str){

		boolean result = false;

		int checkNum[] = new int[13];
		int checkVal[] = {2,3,4,5,6,7,8,9,2,3,4,5};

		if(null == str || "".equals(str.trim())){

			return result;
		}

		if(!Pattern.matches("^[\\d]*$", str)){

			return result;

		}

		/* 입력한 주민번호수가 13자리면 실행*/
		if(str.length()!=13){
			return result;
		}

		if ( 1 > Integer.parseInt(str.substring(2,4)) ||
				12 < Integer.parseInt(str.substring(2,4)) ||
				1 > Integer.parseInt(str.substring(4,6)) ||
				31 < Integer.parseInt(str.substring(4,6)) ||
				1 > Integer.parseInt(str.substring(6,7))){
			return result;
		}

		/* checkNum배열에 입력된 숫자값을 잘라서 저장 */
		for(int i = 0 ; i < 13 ; i++){

			//체크해오는 값은 아스키코드 값으로 입력되므로 -48을함
			checkNum[i] = str.charAt(i)-48;
		}

		/* 유효성을 체크 (1~12번째 자리로 특정수를 얻은 후 13번째 번호와 비교)*/
		int sum = (checkNum[0]*checkVal[0])
				+ (checkNum[1]*checkVal[1])
				+ (checkNum[2]*checkVal[2])
				+ (checkNum[3]*checkVal[3])
				+ (checkNum[4]*checkVal[4])
				+ (checkNum[5]*checkVal[5])
				+ (checkNum[6]*checkVal[6])
				+ (checkNum[7]*checkVal[7])
				+ (checkNum[8]*checkVal[8])
				+ (checkNum[9]*checkVal[9])
				+ (checkNum[10]*checkVal[10])
				+ (checkNum[11]*checkVal[11]);

		sum = (11-(sum%11))%10;

		if(checkNum[12] == sum ){

			result = true;

		}else{

			result = false;
		}

		return result;
	}

}
