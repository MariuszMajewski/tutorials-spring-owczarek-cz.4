package pl.mrmario.tutorials.spring.owczarek.cz4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.zip.DataFormatException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrMario108
 *		Fabrykuj¹ce metody statyczne
 */
public class MainSpring {
	public static void main(String[] args) {
//		Locale locale = Locale.getDefault();
//		Calendar calendar = GregorianCalendar.getInstance(locale);
//		DateFormat formatter = SimpleDateFormat.getInstance();

//		System.out.println(formatter.format(calendar.getTime()));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calendar calendar = context.getBean("calendar", Calendar.class);
		DateFormat formatter = (DateFormat) context.getBean("formatter");
		
		System.out.println(formatter.format(calendar.getTime()));
	}
}
