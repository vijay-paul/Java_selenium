package Demo1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Methods {

	 int i=4;
	public int day() {
		// object created for date
		Calendar calobject = Calendar.getInstance();
		int date = calobject.get(Calendar.DATE);
		return date;

	}

	public String month() {
		// creating object for date and simpledateformat class and returning month 
		Date dateobject = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("MMMM");
		String month = dateformat.format(dateobject);
		return month;

	}

	public int year() {

		Calendar calobject = Calendar.getInstance(); // For year
		int year = calobject.get(Calendar.YEAR);
		return year;

	}
}
