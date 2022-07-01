public class charRandomTest {

	public static void main(String[] args) {
	    for(int i =0 ; i<10 ; i++){
            double dValue = Math.random();

            char cValue = (char)((dValue * 26) + 65);

            System.out.println(cValue);
        }
    }
}
