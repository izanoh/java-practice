package com.nutstp.practice.problem1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void input_nut_should_be_say_hello_nut(){
		Hello hello = new Hello();
		String actualResult = hello.getName("nut");
		assertEquals("should_be_say_hello_nut", "hello nut", actualResult);
	}

}
