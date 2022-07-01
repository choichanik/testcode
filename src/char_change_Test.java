import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import org.json.*;

public class char_change_Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//String plain = "테스트발송입니다";
		String plain = "조정훈유바외과의원";

		String after_plain = URLEncoder.encode(plain, "UTF-8");

		System.out.println("plain>>"+plain);
		System.out.println("after>>"+after_plain);

		String plain2 = "%7Bchart%3A%7BzoomType%3A%27xy%27%7D%2C+credits%3A+%7Benabled%3A+false%7D%2C+title%3A%7Btext%3A%27%27%7D%2C+subtitle%3A%7Btext%3A%27%27%7D%2C+xAxis%3A%5B%7Bcategories%3A%5B%2714.12.31%27%2C%2715.12.31%27%2C%2716.12.31%27%2C%2717.12.31%27%2C%2718.12.31%27%5D%2C+corsshair%3Atrue%2Clabels%3A%7Bstyle%3A%7BfontFamily%3A+%27%EB%A7%91%EC%9D%80+%EA%B3%A0%EB%94%95%27%2CfontSize%3A+%2720px%27%7D%7D%7D%5D%2C+yAxis%3A%5B%7Blabels%3A%7Bformatter%3Afunction%28%29%7Breturn+Highcharts.numberFormat%28this.value%2C0%29%3B%7D%2Cstyle%3A%7Bcolor%3AHighcharts.getOptions%28%29.colors%5B0%5D%2CfontFamily%3A+%27%EB%A7%91%EC%9D%80+%EA%B3%A0%EB%94%95%27%2CfontSize%3A+%2720px%27%7D%7D%2C+title%3A%7Btext%3A%27%27%2C+style%3A%7Bcolor%3AHighcharts.getOptions%28%29.colors%5B0%5D%7D%7D%7D%2C+%7Blabels%3A%7Bformatter%3Afunction%28%29%7Breturn+this.value+%2B+%27+%25%27%3B%7D%2C+style%3A%7Bcolor%3AHighcharts.getOptions%28%29.colors%5B1%5D%2CfontFamily%3A+%27%EB%A7%91%EC%9D%80+%EA%B3%A0%EB%94%95%27%2CfontSize%3A+%2720px%27%7D%7D%2C+title%3A%7Btext%3A%27%27%2C+style%3A%7Bcolor%3AHighcharts.getOptions%28%29.colors%5B1%5D%7D%7D%2C+opposite%3Atrue%7D%5D%2C+legend%3A+%7Balign%3A%27center%27%2CverticalAlign%3A%27bottom%27%2CitemStyle%3A+%7BfontFamily%3A%27%EB%A7%91%EC%9D%80+%EA%B3%A0%EB%94%95%27%2CfontSize%3A+%2725px%27%7D%7D%2C+series%3A%5B%7Bname%3A%27%EB%A7%A4%EC%B6%9C%EC%95%A1%27%2C+type%3A%27column%27%2C+data%3A%5B900%2C1304%2C996%2C1096%2C1166%5D%7D%2C+%7Bname%3A%27%EB%A7%A4%EC%B6%9C%EC%98%81%EC%97%85%EC%9D%B4%EC%9D%B5%EB%A5%A0%27%2C+yAxis%3A1%2C+data%3A%5B16.32%2C17.07%2C12.53%2C18.44%2C19.88%5D%7D%5D%7D";

		String after_plain2 = URLDecoder.decode(plain2, "UTF-8");

		System.out.println("plain>>"+plain2);
		System.out.println("after>>"+after_plain2);


		String plain3 = "%7Btitle%3A+%7B+text%3A+%27%27+%7D%2C+plotOptions%3A+%7B+++column+++%3A+%7B+++dataLabels%3A+%7Benabled%3A+true%2Ccolor%3A+%28Highcharts.theme+%26%26+Highcharts.theme.contrastTextColor%29+%7C%7C+%27black%27%2Cstyle+%3A+%7BfontFamily+%3A+%27%EB%A7%91%EC%9D%80+%EA%B3%A0%EB%94%95%27%2C+fontSize+%3A+25%7D%7D%2C+showInLegend%3A+true%7D++%7D%2C+yAxis%3A+%5B%7B+++++++++++++++++++++++++++++++++++++++++++++++++++++min%3A0%2C++++++++++++++++++++++++++++++++++++++++++++opposite%3A+false%2C++++++++++++++++++++++++++++++++++title%3A+%7B+text%3A+%27%27+%7D%2C++++++++++++++++++++++++++++++labels%3A+%7B+++++++++++++++++++++++++++++formatter%3A+function%28%29+++%7B+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++if%28this.value.toFixed%280%29%3E10000000%29%7B++++++++++++++++++++++++++++++++++++++++return+this.value.toFixed%280%29.substring%280%2C1%29%2B%27%2C0%2C000%27%3B++++++++++++++++%7Delse++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++if%28this.value.toFixed%280%29%3E100000%29%7B++++++++++++++++++++++++++++++++++++++++++return+this.value.toFixed%280%29.substring%280%2C3%29%2B%27%2C000%27%3B++++++++++++++++++%7Delse++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++if%28this.value.toFixed%280%29%3E10000%29%7B+++++++++++++++++++++++++++++++++++++++++++return+this.value.toFixed%280%29.substring%280%2C2%29%2B%27%2C000%27%3B++++++++++++++++++%7Delse++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++if%28this.value.toFixed%280%29%3E1000%29%7B++++++++++++++++++++++++++++++++++++++++++++return+this.value.toFixed%280%29.substring%280%2C1%29%2B%27%2C000%27%3B+++++++++++++++++%7Delse%7B++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++return+this.value.toFixed%280%29%3B+++++++++++++++++++++++++++++++++++++++++%7D++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++%7D+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++%7D++++++++%7D%5D%2C+series%3A+%5B%7B++type%3A+%27column%27%2C++name%3A%27%EC%9E%AC%EB%AC%B4%EC%83%81%ED%83%9C%ED%91%9C+%EA%B3%84%EC%A0%95%EA%B8%88%EC%95%A1%27%2C+data%3A%5B64462%5D%2C+color%3A%27%23558ed5%27%7D+%5D%7D";

		String after_plain3 = URLDecoder.decode(plain3, "UTF-8");

		System.out.println("plain>>"+plain3);
		System.out.println("after>>"+after_plain3);

		String plain4 = "{lang:{thousandsSep:','}}";
		String after_plain4 = URLEncoder.encode(plain4, "UTF-8");

		System.out.println("plain>>"+plain4);
		System.out.println("after>>"+after_plain4);

		//plain4 = after_plain4;

		try{
			new JSONObject(plain4);
		}catch(Exception e){
			e.printStackTrace();
		}

		String plain5 = "{title: { text: '' }, plotOptions: {   column   : {   dataLabels: {enabled: true,color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black',style : {fontFamily : '맑은 고딕', fontSize : 25}}, showInLegend: true}  }, yAxis: [{                                                     min:0,                                            opposite: false,                                  title: { text: '' },                              labels: {                             formatter: function()   {                                                           if(this.value.toFixed(0)>10000000){                                        return this.value.toFixed(0).substring(0,1)+',0,000';                }else                                                                if(this.value.toFixed(0)>100000){                                          return this.value.toFixed(0).substring(0,3)+',000';                  }else                                                                if(this.value.toFixed(0)>10000){                                           return this.value.toFixed(0).substring(0,2)+',000';                  }else                                                                if(this.value.toFixed(0)>1000){                                            return this.value.toFixed(0).substring(0,1)+',000';                 }else{                                                                  return this.value.toFixed(0);                                         }                                                                  }                                                                           }        }], series: [{  type: 'column',  name:'재무상태표 계정금액', data:[64462], color:'#558ed5'} ],globaloptions:{lang:{thousandsSep:','}}}";
		String after_plain5 = URLEncoder.encode(plain5, "UTF-8");

		System.out.println("plain>>"+plain5);
		System.out.println("after>>"+after_plain5);

	}

}
