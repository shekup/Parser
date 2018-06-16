# Parser
The purpose of Parser is to build a XML Parser in Java from scratch.  The current scope is limited to: A basic XML parser that can parse just elements, no attributes and can be queried for basic values. The project is build using Java (1.8 version) and Maven using IDE Eclipse. 


# Installing
Clone the application in local using git command: git clone.  Project has source and maven configuration file (pom.xml).  Application has file "SampleXML" in resources folder
 

# Running
Application.java is the starting point of the application. 
One way to execute the application is:
Step 1. Clone the application in local machine  Step 2. Import application in IDE  Step 3. Run "Application.java"  Step 4. Console will ask to input file name  Step 5. Input file name as SampleXML  
Other way is:  Step 1. Go to the directory that has clone  Step 2. run "mvn clean package"  Step 3. Go to directory target  Step 4. run "java -jar Parser-0.0.1-SNAPSHOT.jar"  Step 5. Input the file with xml, such as: "C:\Users\abhishek\Desktop\MyXML.txt"

# Assumptions
The format of input will be XML with well placed start and end tags.  The depth of input XML will not be more than two.  XML does not have an empty tag.

# Insights
"Tree" class represents the XML in the program. Tree has a root node and leaves. The child nodes are in a list. A tree and node /or can have leaves. 
The root node and child node are represented by object "Node".  Node class has boolean variable - "root" to identify if node is root or child. 
In XML document the parent node appears twice: opening tag and closing tag of document. If closing tag is missing the node will be ignored.  Program ends parsing when it reaches end of of input file or end tag of root, such as person in SampleXML

# Issues
1. The application has basic code to parse XML and ignores performance and memory issues such as the Utility class heavily uses Java String class instead of buffer
2. The application ends parsing when it reaches the end tag, that is, If <person> is start tag Then as soon application encounters </person> it will stop processing though it will print the next line
3.  The application is not using recursive or event based programming that is why unable to parse XML with depth more than 2. 
Few more issues exist which are known but not fixed due to time constraints

# Future
To make it a complete XML parser below changes should be done:  
1. Add a deep copy method in Node class
2. Modify the parsing method to add recursion with below logic:  
	a. Check the end of a current node reached  b. Set parent as new current node  c. Set parent of parent as new parent  d. Deep copy node at every step to avoid incorrect referencing

# Author
Abhishek Upadhyay

# References
DOM Model: https://www.w3.org/TR/WD-DOM/introduction.html  Scanner class guide: http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/NOTES/JavaIO_Scanner.html  
Tree data structure guide: https://en.wikipedia.org/wiki/Tree_(data_structure)