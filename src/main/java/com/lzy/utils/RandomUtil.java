package com.lzy.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil
 * @Description: 闅忔満鏁板伐鍏风被
 * @author: charles
 * @date: 2020骞�4鏈�23鏃� 涓婂崍10:39:33
 */
public class RandomUtil {

	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87（8分）
	public static double getValue(final double min, final double max,final int scale){
		Random random = new Random();
		float nextFloat = random.nextFloat();
		
		System.out.println(nextFloat);
		return scale;
	//TODO 实现代码
	}
	
	

	//方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值（8分）
	public static int random(int min, int max){
		Random random = new Random();
		
		return random.nextInt(max-min+1)+min;
		
	//TODO 实现代码
	} 
	public static int[] subRandom(int min, int max, int subs) {
		
		int[] result = new int[subs];
		
		HashSet<Integer> set = new HashSet<Integer>();
	     while(set.size()!=subs) {
	    	 set.add(random(min,max));
	     }
	     int i=0;
	     for (Integer value : set) {
	    	 result[i]=value;
	    	 i++;
		}
		return result;
		
	}

	
	public static char randomCharacter() {
		String str ="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(random(0, str.length()-1));
	}

	public static String randomString(int length) {
		StringBuffer str = new StringBuffer();
		for(int i=0 ;i<length ;i ++) {
			str.append(randomCharacter());
		}
		return str.toString();
	}

}
