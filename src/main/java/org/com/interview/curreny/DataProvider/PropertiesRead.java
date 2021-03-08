package org.com.interview.curreny.DataProvider;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesRead {
	FileReader fr;
	Properties prop;

	public PropertiesRead(String Filename) {
		try {
			this.fr = new FileReader(Filename);
			this.prop=new Properties();
			this.prop.load(fr);
		} catch (Exception e) {
			System.out.println("exception occrued .." + e.getMessage());
		}
	}
	
	public String getvalue(String key) {
		String value = "";
		try {
		 value=	prop.getProperty(key);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return value;
		
		
	}
	

}
