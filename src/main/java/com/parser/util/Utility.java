package com.parser.util;

public class Utility {
	
	public static String validateLine(String xmlInputLine) throws Exception{
		xmlInputLine = xmlInputLine.replaceAll("\\t", "");
		xmlInputLine = xmlInputLine.trim();
		System.out.println(xmlInputLine);
		int lengthOfLine = xmlInputLine.length();
		if(!xmlInputLine.startsWith("<") || !xmlInputLine.endsWith(">"))
			throw new Exception("Formatting exception");
		xmlInputLine = xmlInputLine.substring(1, lengthOfLine-1);
		return xmlInputLine;
	}
	
}
