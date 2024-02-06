package com.Rigbot_Genarics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test_DataByPropertyFile {

	public static FileInputStream fis;

	public static String getdata( String key)
	{

		try {
			fis = new FileInputStream("./Property/Test_Data.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String value = prop.getProperty(key);
		return value;
	}

}
