package com.Framework.propertiesfilelibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;

import com.Framework.Genericlibrary.FrameworkConstatnt;

public class ReadPropertiesFile implements FrameworkConstatnt{
	
	
	public static FileInputStream fis=null;
	public static Properties property=null;
	public static FileOutputStream fos=null;
	
	public static String readdata(String key) {

		//Convert Physical file into java redable format.
		try {
			FileInputStream fis=new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Create An Object for properties Class
		Properties property=new Properties();
		
		//Load All the keys/Data
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String data=property.getProperty(key);
		return data;
		
	}
	
	
	
	public static void writedata(String key,String value) {
		try {
			FileInputStream fis=new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties property=new Properties();
		
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//Write the Data
		property.put(key, value);
		
		//Convert Java Redable into Physical file
		try {
			fos= new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Store the Data
		try {
			property.store(fos, "Latest key Updated Succesfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	
	
	
	
	
	
	
	}

}
