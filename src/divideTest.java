
public class divideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a_str = "운영결함 #24451 (종료): 실시간 모니터링 스크롤이 생길 시되는 버그 수정 #212312"; 
		String b_str = "결함 #24453: 사용자정의테이블 컬럼 필터링 조건 리소스가 깨져서 나타남";
		String c_str = "서울특별시 강서구 공항대로 351-21 [등촌동 701 진로,미주아파트상가]";

		String[] Result = a_str.split(" ");
		
		for(int i=0 ; i<Result.length ; i++) {
			System.out.println(i+">>"+Result[i]);
		}
		
		System.out.println("============================================"); 
		
		String[] Result2 = b_str.split(" ");
		
		for(int i=0 ; i<Result2.length ; i++) {
			System.out.println(i+">>"+Result2[i]);
		}

		System.out.println("============================================");

		String[] Result3 = c_str.split("\\[");

		for(int i=0 ; i<Result3.length ; i++) {
			System.out.println(i+">>"+Result3[i]);
		}

		System.out.println(Result3[0]+", 제1층 제101호 ["+Result3[1]);
	}

}
