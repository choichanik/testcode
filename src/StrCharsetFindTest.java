import com.sun.jna.platform.win32.Advapi32Util;

import java.io.UnsupportedEncodingException;

import static com.sun.jna.platform.win32.WinReg.HKEY_LOCAL_MACHINE;

public class StrCharsetFindTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//아래 반복문중 정상적으로 글자가 출력되면 해당 CharacterSet
		String targetStr = "테스트";
		String[] ary = {"euc-kr", "utf-8", "iso-8859-1","ksc5601", "x-windows-949"};
		for( int i =0 ; i < ary.length; i++){
			for(int j=0; j < ary.length ; j++){
				if( i != j){
					System.out.println(ary[i]+"=>"+ ary[j]+ " \r\n ==> " +new String(targetStr.getBytes(ary[i]),ary[j]));
				}
			}
		}
	}

}
