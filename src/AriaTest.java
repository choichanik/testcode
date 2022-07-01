import javax.crypto.Cipher;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

public class AriaTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String key = "AriaTestKey";

		String encryptionIv = "4378110db6392f93e95d5159dabdee9b";
		String encryptionSalt = "18b00b2fc5f0e0ee40447bba4dabc952";

		key = "2DLx95XMRe4vh2xRq2W0rA==";

		Aria aria = new Aria(key);

		System.out.println(aria.Decrypt("SSiYJQ9nWcyqFxmNAWVCUhcfTznOmQY7o7vO0BJFKqU="));

	}

}
