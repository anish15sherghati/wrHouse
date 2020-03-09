package com.aaaws.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CommonUi {

	public static Map<Integer, String> convert(List<Object[]> list) {
		Map<Integer, String> map = new HashMap<>();
		for (Object[] obj : list) {
			map.put(Integer.valueOf(obj[0].toString()), obj[1].toString());
		}
		return map;
	}
}
