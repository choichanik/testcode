import java.util.Random;

public class intRandomTest {

	public static void main(String[] args) {
	    int Arr[] = new int[10];
	    Random r = new Random();

	    for(int i =0 ; i<10 ; i++){
            Arr[i] = r.nextInt(100)+1;
            for(int j = 0 ; j<i ; j++){
                if(Arr[i]==Arr[j]){
                    i--;
                }
            }
        }

	    for(int b=0 ; b<10 ; b++){
            System.out.println(Arr[b]);
        }

        System.out.println("path>>"+ intRandomTest.class.getResourceAsStream("\\jna.jar"));
    }
}
