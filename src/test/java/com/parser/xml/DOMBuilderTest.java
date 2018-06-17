package com.parser.xml;

import java.util.Scanner;

import com.parser.model.Tree;

public class DOMBuilderTest {
	
	public void testTree() {
		DOMBuilder domBuilder = new DOMBuilder();
		String file = "SampleXML";
		Scanner inFile = new Scanner( file );
		try {
			Tree tree = domBuilder.parseXML(inFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
