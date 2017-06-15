/**
 * 
 */
package com.luwei.hackvr.utils;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;


/**
 * @author caisp
 */
public class RegisterUtil {
	private static  Logger logger =Logger.getLogger(RegisterUtil.class);
	
	/**
	 * 构造建议用户名的样式及javascript代码
	 * @param userName
	 * @return
	 */
	public static String formatSugguestName(String userName) {
		StringBuffer strBuf = new StringBuffer("");
		strBuf.append("<a href=\"javascript:suggest('").append(userName).append("');\">").append(userName).append("</a>");
		return strBuf.toString();
	}
	
	/**
	 * 检查字符串是否只是数字或者英文字母
	 * @param str
	 * @return
	 */
	public static boolean isLetterOrDigit(String str) {
		if(!StringUtils.isBlank(str)) {
			for(int i=0;i<str.length();i++) {
//				System.out.println(str.charAt(i) + " " +str.codePointAt(i));
				if(!Character.isDigit(str.charAt(i)) && !(str.codePointAt(i)>=65 && str.codePointAt(i)<=90) && !(str.codePointAt(i)>=97 && str.codePointAt(i)<=122)) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * 判断是否包含全角字符
	 * @param str
	 * @return
	 */
	public static boolean containFullShape(String str) {
		String regex = "[\uFF00-\uFFFF]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if(matcher.find()) {
			return true;
		}
		return false;
	}
	
	/**
	 * 检查是否有英文输入法半角状态下非中英文、数字、下划线以外的字符
	 * @param userName
	 * @return
	 */
	public static boolean containSpecialCharacter(String name) {
		String regex = "[^0-9a-zA-Z\u4E00-\u9FA5\\_]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		if(matcher.find()) {
			return true;
		}
		/*String base = Configuration.getInstance().getValue(Constants.RESOURCE_REGISTER_SPECIAL_CHARACTER_KEY);
		if(!StringUtil.isNull(base) && !StringUtil.isNullOrBlank(userName)) {
			for(int i=0; i<userName.length(); i++) {
				if(base.contains(String.valueOf(userName.charAt(i)))) {
					return true;
				}
			}
		}*/
		return false;
	}
	
	/**
	  * @Title: containSpecialCharacter2
	  * @Creater: chencc <br>
	  * @Date: Sep 23, 2011 <br>
	  * @Description: TODO特殊字符
	  * @param @param name
	  * @param @return
	  * @return boolean
	  * @throws
	 */
	public static boolean containSpecialCharacter2(String name) {
		if(name.indexOf("丨") > -1)
			return true;
		else
			return false;
	}
	
	/**
	 * 将IP地址转换成整数
	 * @param ip
	 * @return
	 */
	public static long convertIpToInt(String ip) {
		// 创建IP数组
		String[] ipArray = ip.split("\\.");
		// 创建IP整形
		long ipInt = 0;
		// 对数组进行循环
		try {
			for (int i = 0; i < ipArray.length; i++) {
				if (ipArray[i] == null || ipArray[i].trim().equals("")) {
					ipArray[i] = "0";
				}
				if (new Integer(ipArray[i].toString()).intValue() < 0) {
					Double j = new Double(Math.abs(new Integer(ipArray[i]
							.toString()).intValue()));
					ipArray[i] = j.toString();
				}
				if (new Integer(ipArray[i].toString()).intValue() > 255) {
					ipArray[i] = "255";
				}
			}
			ipInt = new Double(ipArray[0]).longValue() * 256 * 256 * 256
					+ new Double(ipArray[1]).longValue() * 256 * 256
					+ new Double(ipArray[2]).longValue() * 256
					+ new Double(ipArray[3]).longValue();
			// 返回整形
		} catch (Exception e) {

			e.printStackTrace();
		}
		return ipInt;
	}
	
	/**得到String的字节长度
	 * @param userName
	 * @return
	 */
	public static int  getUserNameLength(String userName ) {
		int retval=0;
			try {
				retval=userName.getBytes("GBK").length;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				logger.error("校验用户名长度出错，用户名为："+userName,e);
			}
		return retval;
	}
	
	
	/**校验邮箱地址是否正确
	 * @param email
	 * @return
	 */
	public static boolean isEmailFormat(String email) {
		 Pattern pattern = Pattern.compile(
	                "[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+",
	                Pattern.CASE_INSENSITIVE);
		 Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	
	/**校验ip地址是否正确
	 * @param ip
	 * @return
	 */
	public static boolean isIpFormat(String ip) {
		Pattern pattern = Pattern.compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
		Matcher matcher=pattern.matcher(ip);
		return matcher.matches();

	}
	
	
	public static boolean isNumeric(String str){
	    Pattern pattern = Pattern.compile("[0-9]*");
	    return pattern.matcher(str).matches();   
	 } 
}
