package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void getBoolTest(){
		Demo1 demo1 = new Demo1();
		assertTrue(demo1.getBool());
	}
}
