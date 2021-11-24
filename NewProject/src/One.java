import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class One {

	public static void main(String[] data) {
		// TODO Auto-generated method stub

		
		Date a=new Date();
		System.out.println(a);
		
		SimpleDateFormat sf=new SimpleDateFormat("MM:DD:yyyy");
		
		System.out.println(a);
		System.out.println(sf.format(a));
		
		
}
}