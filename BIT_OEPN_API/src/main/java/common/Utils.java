package common;

import java.util.HashMap;
import java.util.Map;

public class Utils {

	/*
	 *  ajax 를 통한 화면에 전달할 메시지 
	 */
	public static Map<String, Object> sendAjax(String code, String msg, Object data) {
		Map<String, Object> datamap = new HashMap<String, Object>();
		datamap.clear();
		datamap.put("code", code);
		datamap.put("msg" , msg);
		datamap.put("data", data);	 
		return datamap;
	}
}
