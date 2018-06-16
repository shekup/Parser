package com.parser.util;

import com.parser.model.Leaf;

public class LeafUtility {
	
public static Leaf getLeaf(String xmlInputLine) throws Exception {
		
		Leaf leaf = new Leaf();
		
		int endIndexOfStartTag = xmlInputLine.indexOf(">");
		String startTag = xmlInputLine.substring(0,endIndexOfStartTag);
		System.out.println("Start tag: "+ startTag);
		
		int startIndexOfEndTag = xmlInputLine.indexOf("/");
		String endTag = xmlInputLine.substring(startIndexOfEndTag+1, xmlInputLine.length());
		System.out.println("End tag: "+ endTag);
		
		if(!(startTag.equals(endTag)))
			throw new Exception("Not matching start and end tags");
		
		String value = xmlInputLine.substring(endIndexOfStartTag+1, startIndexOfEndTag-1);
		System.out.println("Value of tag: " + value);
		
		leaf.setName(startTag);
		leaf.setValue(value);
		System.out.println();
		
		return leaf;
		
	}

}
