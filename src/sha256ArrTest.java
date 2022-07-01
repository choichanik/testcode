import org.apache.poi.ss.usermodel.DateUtil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class sha256ArrTest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
        String[] complete = makeSHA256Arr();

        for(int b=0 ; b<complete.length ; b++){
            System.out.println(complete[b]);
        }
    }

    public static String[] makeSHA256Arr() throws NoSuchAlgorithmException {
        int Arr[] = new int[10];
        Random r = new Random();
        String[] result = new String[10];

        for(int i =0 ; i<10 ; i++){
            Arr[i] = r.nextInt(100)+1;
            for(int j = 0 ; j<i ; j++){
                if(Arr[i]==Arr[j]){
                    i--;
                }
            }
        }

        for(int b=0 ; b<10 ; b++){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date time = new Date();

            result[b] = makeSHA256(Arr[b]+format.format(time));
            //System.out.println(makeSHA256(Arr[b]+format.format(time)));
        }

        return result;
    }

    public static String makeSHA256(String p_hash) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(p_hash.getBytes());
        byte byteData[] = md.digest();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        StringBuffer hexString = new StringBuffer();
        for (int i=0;i<byteData.length;i++) {
            String hex=Integer.toHexString(0xff & byteData[i]);
            if(hex.length()==1){
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }
}
