 package com.crm.crm.genericUtils;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class javaUtils 
{
	/**
	 * This method is user 
	 * @return
	 */
	public int getRandomNo()
	
	{
		Random ran=new Random();
		int random=ran.nextInt(500);
		return random;
		
	}
	public String getSystemDate()
	/**
	 * This method is used to get the system date
	 * @author hi
	 */
	{
		Date dt=new Date();
		String date=dt.toString();
		return date;
	}
	public String getsystemDateInFormat()
	{
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date dt=new Date();
		String date=dateformat.format(dt);
		return date;
	     // case PATTERN_DAY_OF_MONTH:         // 'd'
	     // case PATTERN_HOUR_OF_DAY0:         // 'H' 0-based.  eg, 23:59 + 1 hour =>> 00:59
	     // case PATTERN_MINUTE:               // 'm'
	     // case PATTERN_SECOND:               // 's'
	     // case PATTERN_MILLISECOND:          // 'S'
	     // case PATTERN_DAY_OF_YEAR:          // 'D'
	     // case PATTERN_DAY_OF_WEEK_IN_MONTH: // 'F'
	     // case PATTERN_WEEK_OF_YEAR:         // 'w'
	     // case PATTERN_WEEK_OF_MONTH:        // 'W'
	     // case PATTERN_HOUR0:                // 'K' eg, 11PM + 1 hour =>> 0 AM
	     // case PATTERN_ISO_DAY_OF_WEEK:      // 'u' pseudo field, Monday = 1, ..., Sunday = 7
		
	}
	
	
}
