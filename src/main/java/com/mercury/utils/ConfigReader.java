package com.mercury.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public  class ConfigReader {
	
	static File objFile;
	static FileInputStream objFis;
	static Properties objPro;
	
	public static String getProperty(String str){
		
		
		try {
			objFile = new File("G:\\Neon\\workspace\\MercuryAutomation\\src\\tests\\resources\\config.property");
			objFis = new FileInputStream(objFile);
			objPro = new Properties();
			objPro.load(objFis);}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return objPro.getProperty(str);
	}
}

