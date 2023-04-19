import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt = new Date();
		
		System.out.println(dt.getTime());
		System.out.println(dt.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
		
		System.out.println(sdf.format(dt));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getFirstDayOfWeek());
		System.out.println(sdf.format(c.getTime()));
		System.out.println(c.DAY_OF_WEEK_IN_MONTH);

	}

}
