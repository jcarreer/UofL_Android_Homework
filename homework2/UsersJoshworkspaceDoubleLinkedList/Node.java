package com.joshcarreer.doublelinkedlist;

public class Node {
	private String value = "";
	private Node forwardPointerNode = null;
	private Node backwardPointerNode = null;
	public Node(String input) {
		this.value = input;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getForwardPointerNode() {
		return forwardPointerNode;
	}
	public void setForwardPointerNode(Node forwrdPointerNode) {
		this.forwardPointerNode = forwrdPointerNode;
	}
	@Override
	public String toString() {
		return "Node [value=" + value + ", pointerNode=" + forwardPointerNode + "]";
	}
	public Node getBackwardPointerNode() {
		return backwardPointerNode;
	}
	public void setBackwardPointerNode(Node backwardPointerNode) {
		this.backwardPointerNode = backwardPointerNode;
	}



}
