import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegeXTest {

    public static void main(String[] args) {
        String plainText = "10.13.60.128 - - [07/May/2019:10:43:47 +0900] \"POST /autocomplete/autocomplete.jsp HTTP/1.1\" 200 244 \"https://kluat.kisline.com/co/CO1100M00GE00.nice\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/7.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; InfoPath.3; .NET4.0C; .NET4.0E; MARKANYWEBDRM#25144; iftNxParam=1.0.1)\" \"puid=jhrim211; uid=nice999; IDSAVE=\\\"\\\"; KLP_UID=\\\"\\\"; AUTOLGN=\\\"\\\"; KLP_AUTHB=\\\"\\\"; KLP_AUTHA=\\\"\\\"; userGuide=Y; JSESSIONID=teF9dglYsK2+Ey98spDi5VYL.greenuat\"";
        String plainText2 = "106.247.244.250 - - [07/May/2019:16:01:14 +0900] \"-\" 408 - \"-\" \"-\" \"-\"";
        Pattern p = Pattern.compile("autocomplete\\.jsp");
        Matcher m = p.matcher(plainText);

        System.out.println(m.find());
        System.out.println(plainText);

        p = Pattern.compile("\"-\"");
        m = p.matcher(plainText2);

        System.out.println(m.find());
        System.out.println(plainText2);

        String plainText3 = "SLC001|SLC002|";
        String[] plainText3Arr  = plainText3.split("\\|");

        for(int i=0 ; i<plainText3Arr.length ; i++){
            System.out.println("prodListArr[i]>>"+plainText3Arr[i]);
        }

        String plainText4 = "alert('test');";
        p = Pattern.compile(".*[\\{\\{\\<\\>'=].*");
        m = p.matcher(plainText4);

        System.out.println("plainText4>>"+plainText4);
        System.out.println(m.find());

        String plainText5 = "var WshShell;\n" +
                "WshShell=WScript.CreateObject(\"WScript.Shell\");var intDoIt =  WshShell.Run('calc');//\n" +
                "var t=";
        p = Pattern.compile(".*[\\{\\}'=\"<>].*");
        m = p.matcher(plainText5);

        System.out.println("plainText5>>"+plainText5);
        System.out.println("plainText5_after>>"+plainText5.replaceAll(".*[\\{\\}'=\"<>].*", ""));
        System.out.println(m.find());
        System.out.println(plainText5.matches(".*[\\{\\}'=\"<>].*"));
        System.out.println(Pattern.matches(".*[\\{\\}'=\"<>].*", plainText5));

        String plainText6 = "6003001@!";
        p = Pattern.compile("^[a-zA-Zㄱ-힣0-9]*$");
        m = p.matcher(plainText6);

        System.out.println("plainText6>>"+plainText6);
        System.out.println(m.find());

        String plainText7 = "6003001";
        p = Pattern.compile("^[a-zA-Zㄱ-힣0-9]*$");
        m = p.matcher(plainText7);

        System.out.println("plainText7>>"+plainText7);
        System.out.println(m.find());


        String plainText8 = "001";
        p = Pattern.compile("^[0-9]*$");
        m = p.matcher(plainText8);

        System.out.println("plainText8>>"+plainText8);
        System.out.println(m.find());

        //String plainText9 = "<#> [NICE 본인확인] 인증번호[213456]를 입력해 주세요.\n3Z6/DaCXuoc";
        String plainText9 = "<#> (NICE 본인확인) 인증번호[213456]를 입력해 주세요.\n3Z6/DaCXuoc";
        //p = Pattern.compile("\\[[\\d]\\]");
        p = Pattern.compile("\\d{6}");
        m = p.matcher(plainText9);
        StringBuffer sb = new StringBuffer();
        while(m.find()){
            m.appendReplacement(sb,"");
        }

        System.out.println("plainText9>>"+sb.toString());
        System.out.println(m.find());

        String plainText10 = "mahcebiafgpeaeigcpkhhopc.AO-J1Ozxs4Fdl0IYB4qzsWVDlr6byDO3MrFQcv-QyDpE5IKHtY5EAuYBR-gsAlTPDmqXRKIu8kwxgt6UDrHeoztVu72pxZ7QbCsA_oGHYtST7dwZUmi7HrY";
        p = Pattern.compile("^[a-z0-9]*$");
        m = p.matcher(plainText10);

        System.out.println("plainText10>>"+plainText10);
        System.out.println(m.find());
    }
}
