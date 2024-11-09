package com.Framework.javalibrary;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class JavaUtility {
	
	public static void pause(long time) {
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int generateRandomNum(int limit) {
		
		Random random =new Random();
		return random.nextInt(limit);
		
	}
	
	public String getCurrentTime() {
		
		Date date=new Date(0);
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
		
	}

}
