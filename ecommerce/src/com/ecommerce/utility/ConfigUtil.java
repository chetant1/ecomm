package com.ecommerce.utility;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ConfigUtil {

	private ConfigUtil() {
		
	}
	public static Map<String, String> getConfigurations(){
		
		Map<String, String> configMap = new HashMap<String, String>();
		Properties configProps = new Properties();
		try {
			configProps.load(ConfigUtil.class.getClassLoader().getResourceAsStream("config.properties"));
			Set<Entry<Object, Object>> configSet = configProps.entrySet(); 
			for(Entry<Object, Object> entry : configSet){
				configMap.put(entry.getKey().toString(), entry.getValue().toString());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return configMap;
	}
}
