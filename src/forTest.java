
public class forTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 20;
		int input = 5;
		int init = 2;

		while(init!=input) {
			System.out.println("init>>"+init+" & val>>"+val);
			
			val += 20;
			init++;
		}
		
		System.out.println("your input>>"+input);
		System.out.println("your val>>"+val);
	}

}
