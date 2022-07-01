
public class indexofTEst {

	public static void main(String[] args) {
		String beginStr = "#123456 A";
		int Startint = beginStr.indexOf("#");
		int Endint = beginStr.indexOf(" ");
		
		System.out.println("원본>>"+beginStr);
		System.out.println("시작점>>"+Startint);
		System.out.println("끝점>>"+Endint);
		
		System.out.println("Result>>"+beginStr.substring(Startint+1, Endint));
		
		System.out.println("============================================================================");
		//============================================================================
		
		String AlphaTestStr = "하위업무 #24530 (종료): [업무보고] 업무보고 등록 및 배포(09/08)";
		int Startint2 = AlphaTestStr.indexOf("#");
		int Endint2 = AlphaTestStr.indexOf(" ");
		
		System.out.println("원본>>"+AlphaTestStr);
		
		if(Startint2>Endint2) {
			String Temp = AlphaTestStr.substring(Startint2, AlphaTestStr.length());
			Endint2 = Endint2 + (Temp.indexOf(" ")+1);
		}
		
		System.out.println("시작점>>"+Startint2);
		System.out.println("끝점>>"+Endint2);
		
		System.out.println("Result>>"+AlphaTestStr.substring(Startint2+1, Endint2));
	}

}
