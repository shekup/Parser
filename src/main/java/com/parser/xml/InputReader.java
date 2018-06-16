package com.parser.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.parser.model.Leaf;
import com.parser.model.Node;
import com.parser.model.Tree;
import com.parser.util.LeafUtility;
import com.parser.util.NodeUtility;
import com.parser.util.Utility;

public class InputReader {
	
	public void parseInput(String filename) throws FileNotFoundException, Exception { 

		// 1. create a File object
	    File file = new File(filename);             
	
	    // 2. check that the file exists before trying to create a Scanner to read the file
	    if ( file.exists() )                          
	    {                                              
	                                                   
	        // 3. Create a Scanner from the file. 
	        Scanner inFile = new Scanner( file );
	        
	        DOMBuilder domBuilder = new DOMBuilder();
	        
	        Tree tree = domBuilder.parseXML(inFile);
	        
	        // Print the tree
	        System.out.println('\n');
	        System.out.println(tree);
	        // Release the resources 
	        inFile.close();
	        
	    }else {
	    	
	    	throw new FileNotFoundException("File does not exist");
	    	
	    }
	    
	}

}
