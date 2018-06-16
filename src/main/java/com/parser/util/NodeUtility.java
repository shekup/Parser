package com.parser.util;

import com.parser.model.Node;

public class NodeUtility {
	
	public static boolean isNode(String xmlInputLine) {
		if(!(xmlInputLine.contains("<")) && !(xmlInputLine.contains(">")))
			return true;
		return false;
	}
	
	public static Node getNode(String xmlInputLine) {
		Node node = new Node();
		System.out.println("Node tag: " + xmlInputLine);
		
		if(xmlInputLine.endsWith("/")) {
			System.out.println("Empty tag");
			node.setStart(true);
			node.setEnd(true);
		}else {
			if(xmlInputLine.startsWith("/")) {
				xmlInputLine = xmlInputLine.substring(1);
				node.setEnd(true);
			}else {
				node.setStart(true);
			}
		}
	
		node.setName(xmlInputLine);
		node.setValue(xmlInputLine);
		return node;
	}

}
