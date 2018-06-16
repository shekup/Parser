package com.parser.xml;

import java.io.FileNotFoundException;

import org.junit.Test;

public class InputReaderTest {
	
	@Test
	public void testParse() {

		InputReader parser = new InputReader();
		try {
			parser.parseInput("SampleXML");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
