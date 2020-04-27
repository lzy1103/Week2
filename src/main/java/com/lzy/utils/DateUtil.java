package com.lzy.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 鏃ユ湡宸ュ叿绫�
 * @author: charles
 * @date: 2020骞�4鏈�23鏃� 涓嬪崍4:38:21
 */
public class DateUtil {
	
	
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: 鏍规嵁鏃ユ湡璁＄畻骞撮緞
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date  birthday) {
		
		//1鑾峰彇绯荤粺褰撳墠骞� 鏈� 鏃�
		Calendar c = Calendar.getInstance();
		int nowYear = c.get(Calendar.YEAR);
		int nowMonth = c.get(Calendar.MONTH);
		int nowDate = c.get(Calendar.DAY_OF_MONTH);
		//2鑾峰彇浼犲叆鏃ユ湡鐨勭敓鏃ョ殑骞� 鏈� 鏃�
		Calendar c2 = Calendar.getInstance();
		c2.setTime(birthday);
		int birthdayYear = c2.get(Calendar.YEAR);
		int birthdayMonth = c2.get(Calendar.MONTH);
		int birthdayDate = c2.get(Calendar.DAY_OF_MONTH);
		if(nowYear< birthdayYear)//鍒ゆ柇
			throw new RuntimeException("浼犲叆鐨勬棩鏈熼敊璇�");
		//4.涓や釜骞翠唤鍚戝噺 寰楀埌骞撮緞 2000-04-01
		 int age =  nowYear - birthdayYear;
		 //娌℃湁鍒板嚭鐢熺殑鏈堝垯骞撮緞鍑忓幓1
		 if(nowMonth < birthdayMonth  ) 
		    age--;
		 //娌℃湁鍒板嚭鐢熸棩 骞撮緞鍑忓幓1
		 if(nowMonth ==birthdayMonth && nowDate<birthdayDate )
			 age--;
		return age;
		
		
	}
	
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 鏍规嵁浼犲叆鐨勬棩鏈熻繑鍥炴棩鏈熺殑鏈堝垵銆傚浼犲叆 2020-04-24 锛岃繑鍥� 2020-04-01 00:00:00
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		//Calendar 鏄竴涓棩鍘嗙被銆傛彁渚� 璁剧疆鏃ユ湡锛屽姞鍑忔棩鏈熺瓑鏂规硶锛屾柟渚跨▼搴忓憳瀵规棩鏈熷仛璁＄畻
		Calendar c = Calendar.getInstance();//鍒濆鍖栦竴涓棩鍘嗙被
		//鐢ㄤ紶鍏ョ殑鏃ユ湡鍒濆鍖栨棩鍘嗙被
		c.setTime(date);
		//璁剧疆杩欎釜鏈堟湀鍒濆嵆锛氭敼鍙樿繖涓湀鐨勬棩鏈熶负绗竴澶�
		c.set(Calendar.DAY_OF_MONTH, 1);//璁剧疆澶╀负1
		c.set(Calendar.HOUR_OF_DAY, 0);//璁剧疆灏忔椂涓�0
		c.set(Calendar.MINUTE, 0);//璁剧疆鍒嗛挓涓�0
		c.set(Calendar.SECOND,0);//璁剧疆绉掍负0
		return c.getTime();
		
	}
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 鏍规嵁浼犲叆鐨勬棩鏈熻繑鍥炴棩鏈熺殑鏈堝垵銆傚浼犲叆 2020-04-24  锛岃繑鍥� 2020-04-30 23:59:59
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		//Calendar 鏄竴涓棩鍘嗙被銆傛彁渚� 璁剧疆鏃ユ湡锛屽姞鍑忔棩鏈熺瓑鏂规硶锛屾柟渚跨▼搴忓憳瀵规棩鏈熷仛璁＄畻
		Calendar c = Calendar.getInstance();//鍒濆鍖栦竴涓棩鍘嗙被
		//鐢ㄤ紶鍏ョ殑鏃ユ湡鍒濆鍖栨棩鍘嗙被
		c.setTime(date);
		//璁╂湀鍔�1  2020-05-24 锛� 鍐嶅彉鎴愭湀鍒� 2020-05-01    鍐� 鍑忓幓涓�绉掞紝鍐嶈幏鍙栨棩鏈�
		c.add(Calendar.MONTH, 1); //璁╂湀鍔�1  2020-05-24
		Date nexMonthInit = getInitMonth(c.getTime());//鍐嶅彉鎴愭湀鍒� 2020-05-01
		//鍒濆鍖栨棩鍘嗙被
		c.setTime(nexMonthInit);
		c.add(Calendar.SECOND, -1);//鍐� 鍑忓幓涓�绉�
		return c.getTime();
		
	}
	
	
	
	
	/**
	 * 
	 * @Title: random 
	 * @Description: 闅忔満浜х敓涓�涓猰in 鍜宮ax涔嬮棿鐨勬棩鏈�
	 * @param min
	 * @param max
	 * @return
	 * @return: Date
	 */
	public static Date random(Date min ,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
	
		long t = (long) (Math.random() * (t2 -t1) + t1);
		return new Date(t);
		
	}

}
