import java.security.MessageDigest;

public class MD5Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PlainText = "abc963852";
		
		MessageDigest md;
	    StringBuffer sb  = new StringBuffer();

		try {

			md = MessageDigest.getInstance("MD5");
			byte[] bytData = PlainText.getBytes();
			md.update(bytData);

			byte[] digest = md.digest();
			for (int i = 0; i < digest.length; i++) {
				String hex=Integer.toHexString(0xff & digest[i]);
				
				// if you use Integer.toHexString(int a), if a>=0 and a<=15 
				// you will get a String consisting of only one char!!!! you need to do something like this:

			     if(hex.length()==1) 
			    	 sb.append("0");
			     
			     sb.append(hex);
			}
			
			System.out.println(sb.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
            throw new RuntimeException();
		}
		
	}
}
