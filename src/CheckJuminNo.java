
public class CheckJuminNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String JuminFullNo = "900909-1319611";
		String CheckTarget = JuminFullNo.replaceAll("-", "");
		
		String joo1;
		String joo2;
		int lastdigit;

		joo1=CheckTarget.substring(0,6);

		if(CheckTarget.substring(6,7)=="-"){
			if (CheckTarget.length()!=14) {
				System.out.println("false");
			}

			joo2=CheckTarget.substring(7,14);
			lastdigit=Integer.parseInt(CheckTarget.substring(13,14));
		}
		else{
			if (CheckTarget.length()!=13){
				System.out.println("false");
			}
			
			joo2=CheckTarget.substring(6,13);
			lastdigit=Integer.parseInt(CheckTarget.substring(12,13));
		}

		if(joo1.length() !=6 ){
			System.out.println("false");
		}
		
		String year=joo1.substring(0,2);
		int month=Integer.parseInt(joo1.substring(2,4));
		int day=Integer.parseInt(joo1.substring(4,6));
		int sex=Integer.parseInt(joo2.substring(0,1));


		if( month <1 || month >12 || day<1){
			System.out.println("false");
		}
		if((sex >4)){
			System.out.println("false");
		}
		if((sex ==0)){
			System.out.println("false");
		}
		if(joo2.length()!=7){
			System.out.println("false");
		}

		int val=0;
		String joominno=joo1+joo2;

		for(int i=0;i<=11; i++){
			val=val+(i%8+2) * Integer.parseInt(joominno.substring(i,i+1));
		}
		val=(11-(val % 11)) % 10 ;

		if(lastdigit==val){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}

}
