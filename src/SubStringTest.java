public class SubStringTest {

    public static void main(String[] args) {
        String test_date = "20181231";

        System.out.println(test_date.substring(0,4));
        System.out.println(test_date.substring(4,6));
        System.out.println(test_date.substring(6));

        test_date = "2018-12-31";

        System.out.println(test_date.substring(0,4));
        System.out.println(test_date.substring(5,7));
        System.out.println(test_date.substring(8));

        test_date = "201812";

        System.out.println(test_date.substring(2,6));

        test_date = "11237869";

        System.out.println(test_date.substring(0,6));

        test_date = "2022-03-07 15:49:12.222";

        System.out.println(test_date.substring(0,10));
    }
}
