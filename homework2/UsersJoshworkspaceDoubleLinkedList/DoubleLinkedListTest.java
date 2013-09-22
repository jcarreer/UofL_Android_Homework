package com.joshcarreer.doublelinkedlist;

import junit.framework.Assert;

import org.junit.Test;

public class DoubleLinkedListTest {

	@Test
	public void linkedListTest() {
		String names2Evaluate = "wes kim justin leanne ";
		String namesBackward = "leanne justin kim wes ";
		MyLinkedList list = new MyLinkedList();
		list.add("wes");
		list.add("kim");
		list.add("justin");
		list.add("leanne");

		Assert.assertEquals(names2Evaluate,list.forwardPrint());
		Assert.assertEquals(namesBackward,list.backwardPrint());
		
	}
}
