
import java.util.*;

public class While {
  public static void main(String[] args) {
	Random rand = new Random(47);
	while(true){
			System.out.println(Integer.toBinaryString(rand.nextInt()));
		}  
	}
}
