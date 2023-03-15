package org.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public String getConfigData(String key) {
		 Properties prop = null;
		try {
			FileInputStream fis = new FileInputStream
					("./src/test/resourses/org/propertiesfile/Config.properties");
			//src/test/resourses/org/propertiesfile
		    prop = new Properties();
			prop.load(fis);

		} catch (IOException e) {
			e.printStackTrace();
		}

		 return prop.getProperty(key);
	}
	public Properties getProp () {
		 Properties prop = null;
		try {
			FileInputStream fis = new FileInputStream
					("./src/test/resourses/org/propertiesfile/Config.properties");
		    prop = new Properties();
			prop.load(fis);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
}
}
