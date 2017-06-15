package com.luwei.hackvr.utils;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;

/**
* Json工具类，实现了实体类和Json数据格式之间的互转功能 使用实例：<br>
*/
public class JsonUtils {
    /**
     * 将一个实体类对象转换成Json数据格式
     * 
     * @param bean
     *            需要转换的实体类对象
     * @return 转换后的Json格式字符串
     */
    private static String beanToJson(Object bean) {
        StringBuilder json = new StringBuilder();
        json.append("{");
        PropertyDescriptor[] props = null;
        try {
            props = Introspector.getBeanInfo(bean.getClass(), Object.class)
                    .getPropertyDescriptors();
        } catch (IntrospectionException e) {
        }
        if (props != null) {
            for (int i = 0; i < props.length; i++) {
                try {
                    String name = objToJson(props[i].getName());
                    String value = objToJson(props[i].getReadMethod()
                            .invoke(bean));
                    json.append(name);
                    json.append(":");
                    json.append(value);
                    json.append(",");
                } catch (Exception e) {
                }
            }
            json.setCharAt(json.length() - 1, '}');
        } else {
            json.append("}");
        }
        return json.toString();
    }


    /**
     * 将一个List对象转换成Json数据格式返回
     * 
     * @param list
     *            需要进行转换的List对象
     * @return 转换后的Json数据格式字符串
     */
    private static String listToJson(List<?> list) {
        StringBuilder json = new StringBuilder();
        json.append("[");
        if (list != null && list.size() > 0) {
            for (Object obj : list) {
                json.append(objToJson(obj));
                json.append(",");
            }
            json.setCharAt(json.length() - 1, ']');
        } else {
            json.append("]");
        }
        return json.toString();
    }

    /**
     * 将一个对象数组转换成Json数据格式返回
     * 
     * @param array
     *            需要进行转换的数组对象
     * @return 转换后的Json数据格式字符串
     */
    private static String arrayToJson(Object[] array) {
        StringBuilder json = new StringBuilder();
        json.append("[");
        if (array != null && array.length > 0) {
            for (Object obj : array) {
                json.append(objToJson(obj));
                json.append(",");
            }
            json.setCharAt(json.length() - 1, ']');
        } else {
            json.append("]");
        }
        return json.toString();
    }

    /**
     * 将一个Map对象转换成Json数据格式返回
     * 
     * @param map
     *            需要进行转换的Map对象
     * @return 转换后的Json数据格式字符串
     */
    private static String mapToJson(Map<?, ?> map) {
        StringBuilder json = new StringBuilder();
        json.append("{");
        if (map != null && map.size() > 0) {
            for (Object key : map.keySet()) {
                json.append(objToJson(key));
                json.append(":");
                json.append(objToJson(map.get(key)));
                json.append(",");
            }
            json.setCharAt(json.length() - 1, '}');
        } else {
            json.append("}");
        }
        return json.toString();
    }

    /**
     * 将一个Set对象转换成Json数据格式返回
     * 
     * @param set
     *            需要进行转换的Set对象
     * @return 转换后的Json数据格式字符串
     */
    private static String setToJson(Set<?> set) {
        StringBuilder json = new StringBuilder();
        json.append("[");
        if (set != null && set.size() > 0) {
            for (Object obj : set) {
                json.append(objToJson(obj));
                json.append(",");
            }
            json.setCharAt(json.length() - 1, ']');
        } else {
            json.append("]");
        }
        return json.toString();
    }

    private static String stringToJson(String s) {
        if (s == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            case '/':
                sb.append("\\/");
                break;
            default:
                if (ch >= '\u0000' && ch <= '\u001F') {
                    String ss = Integer.toHexString(ch);
                    sb.append("\\u");
                    for (int k = 0; k < 4 - ss.length(); k++) {
                        sb.append('0');
                    }
                    sb.append(ss.toUpperCase());
                } else {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

    public static String objToJson(Object obj) {
        StringBuilder json = new StringBuilder();
        if (obj == null) {
            json.append("\"\"");
        } else if (obj instanceof Number) {
        	Number num = (Number)obj;
            json.append(num.toString());
        } else if (obj instanceof Boolean) {
        	Boolean bl = (Boolean)obj;
            json.append(bl.toString());
        } else if (obj instanceof String) {
            json.append("\"").append(stringToJson(obj.toString())).append("\"");
        } else if (obj instanceof Object[]) {
            json.append(arrayToJson((Object[]) obj));
        } else if (obj instanceof List) {
            json.append(listToJson((List) obj));
        } else if (obj instanceof Map) {
            json.append(mapToJson((Map) obj));
        } else if (obj instanceof Set) {
            json.append(setToJson((Set) obj));
        } else {
            json.append(beanToJson(obj));
        }
        return json.toString();
    }
    
    /**
      * @Title: json2Map
      * @Creater: chencc <br>
      * @Date: 2011-3-28 <br>
      * @Description: TODO转化json2map
      * @param @param jsonString
      * @param @return
      * @return Map<String,Object>
      * @throws
     */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> json2Map(String jsonString) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if(null != jsonString && !"".equals(jsonString)){
				JSONObject jsonObject = new JSONObject(jsonString);
			
				Iterator keyIter = jsonObject.keys();
				String key = "";
				Object value = null;
			
				while (keyIter.hasNext()) {
					key = (String) keyIter.next();
					value = jsonObject.get(key);
					map.put(key, value);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
    

    public static void main(String[] args) {
		Map retMap = new HashMap();
		retMap.put("result", true);
		List ls = new ArrayList();
	    ls.add(new HashMap());
		ls.add("hello world!!");
		ls.add(new String[4]);
		retMap.put("list", ls);
		
		String[] strArray = new String[10];
		strArray[1]="first";
		strArray[2]="2";
		strArray[3]="3";
		System.out.println("Boolean:"+JsonUtils.objToJson(true));
		System.out.println("Number:"+JsonUtils.objToJson(23.3));
		System.out.println("String:"+JsonUtils.objToJson("sdhfsjdgksdlkjfk\"sd,!#%$^&*#(*@&*%&*$fsdfsdfsdf"));
		System.out.println("Map :"+JsonUtils.objToJson(retMap));
		System.out.println("List:"+JsonUtils.objToJson(ls));
		System.out.println("Array:"+JsonUtils.objToJson(strArray));
	}
}