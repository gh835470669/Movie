
package com.luwei.hackvr.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Json操作工具
 * 
 * @author caisp
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class JsonUtil {
	
	/**
	 * 构造执行失败响应
	 * 
	 * @param code
	 * @param message
	 * @return
	 */
	public static String getFailedResponse(String code, String message) {
		String response = null;
		try {
			Map<Object, Object> map = new HashMap<Object, Object>();
			Map<Object, Object> responseMap = new HashMap<Object, Object>();
			responseMap.put("code", code);
			responseMap.put("message", message);
			responseMap.put("data", map);
			response = toJson(responseMap);
		} catch (Exception e) {
		}
		return response;
	}

	/**
	 * 构造执行成功响应
	 * 
	 * @param code
	 * @param message
	 * @return
	 */
	public static String getSuccessResponse(String code, String message) {
		Map map = new HashMap();
		return getSuccessResponse(code, message, map);
	}

	/**
	 * 构造执行成功响应
	 * 
	 * @param code
	 * @param message
	 * @param map
	 * @return
	 */
	public static String getSuccessResponse(String code, String message, Object data) {
		String response = null;
		try {
			Map responseMap = new HashMap();
			responseMap.put("code", code);
			responseMap.put("message", message);
			responseMap.put("data", data);
			response = toJson(responseMap);
		} catch (Exception e) {
		}
		return response;
	}

	/**
	 * JSON反序列化
	 * 
	 * @param json
	 * @param clazz
	 * @return
	 */
//	public static <T> T toBean(String json, Class<T> clazz) {
//		return JsonUtils.json2Map(json);
//	}

	/**
	 * JSON序列化
	 * 
	 * @param bean
	 * @return
	 */
	public static String toJson(Object bean) {
		return JsonUtils.objToJson(bean);
	}
	
}
