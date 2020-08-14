package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        Date date=new Date();
       /* try {
            date = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        calendar.setTime(date);
        int day=calendar.get(Calendar.DATE);
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        // 后一天为 +1   前一天 为-1
        calendar.set(Calendar.DATE,day-1);
        String lastDay = sdf.format(calendar.getTime());
        System.out.println(lastDay+":"+day1);


	}

}
