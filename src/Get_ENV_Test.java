import com.sun.jna.platform.win32.Advapi32Util;
import static com.sun.jna.platform.win32.WinReg.HKEY_LOCAL_MACHINE;

public class Get_ENV_Test {

	public static void main(String[] args) {
		System.out.println("CPU Name>>" + Advapi32Util.registryGetStringValue(HKEY_LOCAL_MACHINE,
						"HARDWARE\\DESCRIPTION\\System\\CentralProcessor\\0\\",
						"ProcessorNameString"));
		System.out.println("CPU ID>>" + Advapi32Util.registryGetStringValue(HKEY_LOCAL_MACHINE,
						"HARDWARE\\DESCRIPTION\\System\\CentralProcessor\\0\\",
						"Identifier"));
		System.out.println("BIOS Vender>>" + Advapi32Util.registryGetStringValue(HKEY_LOCAL_MACHINE,
				"HARDWARE\\DESCRIPTION\\System\\BIOS\\",
				"BIOSVendor"));
	}

}
