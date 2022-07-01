import org.apache.commons.codec.binary.Base64;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
            //String PlainText = "https://namu.wiki/w/SHA";
            //String PlainText = "asdf";
            //String PlainText = "ExqK/cgvMoqqPlKkMnte3H6wl6Q/Vb/4piem/+H1Ey4=";
            String PlainText = "nice000"+"HIwx4WJXv0+ogZhxRP/iQifeAN7ihs3x5L2KaFq4zDc="+"20220114";

			MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(PlainText.getBytes());
            byte byteData[] = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }

            //System.out.println(sb.toString());

            StringBuffer hexString = new StringBuffer();
            for (int i=0;i<byteData.length;i++) {
                String hex=Integer.toHexString(0xff & byteData[i]);
                if(hex.length()==1){
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            System.out.println(hexString.toString());
            System.out.println(getCryptoSHA256String("a963852*"));


        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
	}

    private static String getCryptoSHA256String(String inputValue)
            throws NoSuchAlgorithmException, IOException {
        if( inputValue == null ) {
            return getCryptoSHA256String("default");
        }
        byte[] ret = digest("SHA-256", inputValue.getBytes());

        String result = encode(ret);
        return result;
    }

    private static byte[] digest(String alg, byte[] input)
            throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(alg);
        return md.digest(input);
    }

    public static String encode(byte[] encodeBytes) throws IOException  {
        byte[] buf = Base64.encodeBase64(encodeBytes);
        return new String(buf).trim();
    }

}
