package com.lzy.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 娴佸鐞嗗伐鍏风被
 * @author: charles
 * @date: 2020骞�4鏈�24鏃� 涓嬪崍3:21:54
 */
public class StreamUtil {
	
	
	public static void closeAll(AutoCloseable ... autoCloseable){
		if(autoCloseable==null ||autoCloseable.length==0 )
			throw new RuntimeException("鍙傛暟寮傚父");
		for (AutoCloseable autoCloseable2 : autoCloseable) {
			try {
				autoCloseable2.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	public static String readTextFile(InputStream src){
		
		byte[] b = new byte[1024];
		int len;
		try {
			while((len =src.read(b))!=-1) {
			return  new String(b, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	
		
		
	
	}
	/*
	* 鏂规硶3锛氫紶鍏ユ枃鏈枃浠跺璞★紝杩斿洖璇ユ枃浠跺唴瀹�(3鍒�)锛屽苟涓旇姹傚唴閮ㄨ皟鐢ㄤ笂闈㈢2涓柟娉�(5鍒�)銆�* 杩欐槸鍏稿瀷鐨勬柟娉曢噸杞斤紝璁颁綇浜嗗悧锛熷皯骞粹��
	*/

	public static String readTextFile(File txtFile) {
		
		try {
			FileInputStream stream = new FileInputStream(txtFile);
			return readTextFile(stream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	//璇诲彇鏂囦欢鍒伴泦鍚�
	public static List<String> readTextFile2List(File txtFile){
		
		List<String> list = new ArrayList<String>();
		//鏋勫缓BufferedReader
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(txtFile)));
	       String str=null;
			while ((str=reader.readLine())!=null) {
				list.add(str);
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
		
		
	}
}
