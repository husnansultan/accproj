package com.qa.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class Conversion {

	@Test
	public void test() {
		JSONUtil json = new JSONUtil();
		assertEquals(true, json.getJSONForObject());
	}

}
