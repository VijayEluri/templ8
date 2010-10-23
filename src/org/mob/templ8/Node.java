package org.mob.templ8;
import java.util.regex.*;
import java.io.*;

public abstract class Node{

	protected Node nextNode = null;
	protected int lineNumber;

	//public abstract NodeTree.StackOperation push(Node newNode);
	//
	//public abstract void appendNode(Node n);

	public void setNextNode(Node n){
		System.out.println("Appending " + n + " to " + this);
		this.nextNode = n; 
	}
	public Node getNextNode(){return this.nextNode;}

	public abstract Node execute(ExecutionContext ec) throws IOException;

	public abstract String debug();

	public int getLineNumber(){
		return this.lineNumber;
	}

	public void setLineNumber(int lineNumber){
		this.lineNumber = lineNumber;
	}

}