package TestBat;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void method1() {
		System.out.println("maven method 1 tanveer");
	}

	@Test
	public void method2() {
		System.out.println("maven method 2 tanveer");
	}

	@BeforeTest
	public void method3() {
		System.out.println("maven method 3 tanveer");
	}
}
