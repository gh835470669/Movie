package com.luwei.hackvr.utils;
import java.util.regex.Matcher;  
import java.util.regex.Pattern; 
public class HtmlUtil {
	private static final String regEx_script = "<script[^>]*?>[\\s\\S]*?<\\/script>"; // 定义script的正则表达式  
    private static final String regEx_style = "<style[^>]*?>[\\s\\S]*?<\\/style>"; // 定义style的正则表达式  
    private static final String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式  
    private static final String regEx_space = "\\s*|\t|\r|\n";//定义空格回车换行符  
      
    /**
     * @param htmlStr 
     * @param classname
     * @param classname2
     * @return  
     *  在含img标签的p标签插入属性 classname
     *  在不含img标签的p标签插入属性classname2
     */
    public static String insertClassToPTagWithImgTag(String htmlStr, String classname, String classname2) {
        Pattern pattern = Pattern.compile("<p><img[\\s\\S]*?<\\/p>");
        Matcher matcher = pattern.matcher(htmlStr);
        while (matcher.find()) {
            String matchString = matcher.group();
            String resultString = "<p " + classname + matchString.substring(2);
            htmlStr = htmlStr.replace(matchString, resultString);
        }
        
        Pattern pattern2 = Pattern.compile("<p>[\\s\\S]*?<\\/p>");
        Matcher matcher2 = pattern2.matcher(htmlStr);
        while (matcher2.find()) {
            String matchString = matcher2.group();
            String resultString = "<p " + classname2 + matchString.substring(2);
            htmlStr = htmlStr.replace(matchString, resultString);
        }
        return htmlStr;
    }
    
    
    /** 
     * @param htmlStr 
     * @return 
     *  删除Html标签 
     */  
    public static String delHTMLTag(String htmlStr) {  
        Pattern p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);  
        Matcher m_script = p_script.matcher(htmlStr);  
        htmlStr = m_script.replaceAll(""); // 过滤script标签  
  
        Pattern p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);  
        Matcher m_style = p_style.matcher(htmlStr);  
        htmlStr = m_style.replaceAll(""); // 过滤style标签  
  
        Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);  
        Matcher m_html = p_html.matcher(htmlStr);  
        htmlStr = m_html.replaceAll(""); // 过滤html标签  
  
//        Pattern p_space = Pattern.compile(regEx_space, Pattern.CASE_INSENSITIVE);  
//        Matcher m_space = p_space.matcher(htmlStr);  
//        htmlStr = m_space.replaceAll(""); // 过滤空格回车标签  
        return htmlStr.trim(); // 返回文本字符串  
    }  
      
    public static String getTextFromHtml(String htmlStr){  
        htmlStr = delHTMLTag(htmlStr);  
        htmlStr = htmlStr.replaceAll("&nbsp;", "");
//        htmlStr = htmlStr.substring(0, htmlStr.indexOf("。")+1);  
        return htmlStr;  
    }  
      
    public static void main(String[] args) {  
//        String str = "<div style='text-align:center;'> 整治“四风”   清弊除垢<br/><span style='font-size:14px;'> </span><span style='font-size:18px;'>公司召开党的群众路线教育实践活动动员大会</span><br/></div>";  
//        System.out.println(getTextFromHtml(str));  
        System.out.println("start");
        String htmlStr = "<p><img>hh</p><p><img>kk</p><p>ll</p>";
        String classname = "class='id'";
        String classname2 = "class='font-size-1'";
        String resultString = insertClassToPTagWithImgTag(htmlStr, classname, classname2);
        System.out.println(resultString);
    }  
}
