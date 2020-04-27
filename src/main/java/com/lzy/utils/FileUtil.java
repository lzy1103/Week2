package com.lzy.utils;

import java.io.File;

/**
 * 
 * @ClassName: FileUtil 
 * @Description: 鏂囦欢宸ュ叿绫�
 * @author: charles
 * @date: 2020骞�4鏈�24鏃� 涓嬪崍3:21:37
 */
public class FileUtil {
	
	/*
	* 鏂规硶1锛氱粰瀹氫竴涓枃浠跺悕锛岃繑鍥炶鏂囦欢鍚嶇殑鎵╁睍鍚嶏紝渚嬪鈥渁aa.jpg鈥濓紝杩斿洖鈥�.jpg鈥�(3鍒�)
	*/
	public static String getExtendName(String fileName){
		
		if(!StringUtil.hasText(fileName) || !fileName.contains("."))
			throw new RuntimeException("涓嶆槸鏂囦欢");
		
		return fileName.substring(fileName.lastIndexOf("."));
	}
	/*
	* 鏂规硶2锛氳繑鍥炴搷浣滅郴缁熶复鏃剁洰褰�(5鍒�)
	*/
	public static File getTempDirectory(){
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	/*
	* 鏂规硶3锛氳繑鍥炴搷浣滅郴缁熺敤鎴风洰褰�(5鍒�)
	* 渚嬪Linux绯荤粺鏄湪/home/{鐢ㄦ埛璐﹀彿鍚峿锛學indows绯荤粺鏄湪C:\Users\{鐢ㄦ埛璐﹀彿鍚峿> 
	*/
	public static File getUserDirectory(){
		String path = System.getProperty("user.home");
		return new File(path);
	}

}
