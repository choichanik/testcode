
public class Varchar_Repack_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "varchar(10)";
		System.out.println("a>>"+a);
		System.out.println("a>>"+a.replace("varchar", "varchar2"));
		System.out.println("a>>"+a.replace("varchar", "varchar2").replace(")", " CHAR)"));
	}

}
