package com.joshcarreer.doublelinkedlist;

public class MyLinkedList {
	private Node firstNode = null;
	private Node lastNode = null;
	public void add(String input) {
		Node tmpNode = new Node(input);
		if(firstNode ==null){
			firstNode=tmpNode;
			lastNode=firstNode;}
		else{
			lastNode.setForwardPointerNode(tmpNode);
			tmpNode.setBackwardPointerNode(lastNode);
			tmpNode.setForwardPointerNode(null);
			lastNode = tmpNode;}}
	public String forwardPrint() {
		StringBuffer result = new StringBuffer();
		Node tmpNode = firstNode;
		while(tmpNode!=null){
			result.append(tmpNode.getValue() + " ");
			tmpNode =tmpNode.getForwardPointerNode();
		}
		return result.toString();
	}
	public String backwardPrint() {
		StringBuffer result = new StringBuffer();
		Node tmpNode = lastNode;
		while(tmpNode!=null){
			result.append(tmpNode.getValue() + " ");
			tmpNode =tmpNode.getBackwardPointerNode();
		}
		return result.toString();
	}

}
