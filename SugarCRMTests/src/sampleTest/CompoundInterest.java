package sampleTest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/**
 * This program shows how to store tabular data in a 2D array.
 * @version 1.40 2004-02-10
 * @author Cay Horstmann
 */
public class CompoundInterest {
public static void main(String[] arguments) {
  //GregorianCalendar birthday = new GregorianCalendar(1980, Calendar.AUGUST, 01);
  Date deadline = new Date();
  // get the supported ids for GMT-08:00 (Pacific Standard Time)
  String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
  // if no ids were returned, something is wrong. get out.
  if (ids.length == 0)
      System.exit(0);

   // begin output
  System.out.println("Current Time");
  SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);
  Calendar calendar = new GregorianCalendar(pdt);
  Date trialTime = new Date();
  calendar.setTime(trialTime);

  // print out a bunch of interesting things
  System.out.println("ERA: " + calendar.get(Calendar.ERA));
  System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
  System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
  System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
  System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
  System.out.println("DATE: " + calendar.get(Calendar.DATE));
  System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
  System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
  System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
  System.out.println("DAY_OF_WEEK_IN_MONTH: "
                     + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

}
}