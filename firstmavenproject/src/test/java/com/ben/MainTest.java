package com.ben;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testCase1() {
		Main main= new Main();
		int result=main.addtion(2, 3);
		assertEquals(5, result);
	}
	@Test
	public void testCase2() {
		Main main= new Main();
		int result=main.addtion(8, 3);
		assertEquals(11, result);
	}
	@Test
	public void testCase3() {
		Main main= new Main();
		int result=main.addtion(3, 3);
		assertEquals(6, result);
	}

}
