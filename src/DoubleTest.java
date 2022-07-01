import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*double a = 10.72;
		double b = -10;

		BigDecimal d1 = new BigDecimal(String.valueOf(a));
		BigDecimal d2 = new BigDecimal(String.valueOf(b));

		System.out.println("sum>>"+(a+b) );
		System.out.println("sum2>>"+d1.add(d2));
		
		double c = 10;
		double chk = 9;

		System.out.println("c>>"+((c*-1)>9));
		System.out.println("c>>"+((c*-1)<9));
		System.out.println("c>>"+((c*-1)>chk));
		System.out.println("c>>"+((c*-1)<chk));
		System.out.println("c>>"+Double.compare((c*-1), chk));
		System.out.println("c>>"+Double.compare(chk,(c*-1)));*/

		double d = 2.2796257E7;
		double e = 5.2347;

		System.out.println("d>>"+d);
		System.out.println("d2>>"+String.format("%.2f",d));
		System.out.println("d3>>"+new DecimalFormat("0").format(d));
		System.out.println("e>>"+e);
		System.out.println("e2>>"+String.format("%.2f",e));
		System.out.println("e3>>"+new DecimalFormat("0").format(e));
	}

}
