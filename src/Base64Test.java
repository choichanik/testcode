import org.apache.commons.codec.binary.Base64;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Base64Test {

	public static void main(String[] args) {

		try{
            String PlainText = "eyJ2ZXJzaW9uIjoiMS4wIiwicGFja2FnZU5hbWUiOiJjb20ua2lzaW5mby5ibGl6emFyZGFwcCIsImV2ZW50VGltZU1pbGxpcyI6IjE2MjE1Njg3NTE3MTYiLCJ0ZXN0Tm90aWZpY2F0aW9uIjp7InZlcnNpb24iOiIxLjAifX0=";
            byte[] plainbyte = PlainText.getBytes();

            java.util.Base64.Decoder decoder = java.util.Base64.getDecoder();
            byte[] decodebyte = decoder.decode(plainbyte);

            System.out.println("PlainText>>"+PlainText);
            System.out.println("DecodeText>>"+new String(decodebyte));

        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
	}

}
