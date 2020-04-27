package com.lzy.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testGetValue() {
	double value = RandomUtil.getValue(25400.56, 67078.94, 2);
	
	}

	@Test
	public void testRandom() {
		int random = RandomUtil.random(1, 100);
		System.out.println("专家年龄为"+random);
	}

	@Test
	public void testSubRandom() {
		fail("Not yet implemented");
	}

	@Test
	public void testRandomCharacter() {
		fail("Not yet implemented");
	}

	@Test
	public void testRandomString() {
		fail("Not yet implemented");
	}

}
