package extra;
import java.util.regex.*;
public class rej {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[a-z0-9_-]{3,9}[@#$].");
		 Matcher m = pattern.matcher("ajaina76@.");
		 boolean b = m.matches();  
		 System.out.println(b);
		 
	}

}
