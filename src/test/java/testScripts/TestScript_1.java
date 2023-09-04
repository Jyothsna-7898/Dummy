package testScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_1 {
	@Test
	public void test1() {
		Reporter.log("First test");
	}
	public void test2() {
		Reporter.log("Second test");
	}
}
