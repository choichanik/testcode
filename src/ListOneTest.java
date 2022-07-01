import java.util.ArrayList;
import java.util.List;

public class ListOneTest {

    public static void main(String[] args) {
        List<String> test = new ArrayList<String>();
        test.add("Information");
        test.add("Informion");
        test.add("Informon");
        test.add("Infoon");

        System.out.println(test.contains("Informon"));
    }
}
