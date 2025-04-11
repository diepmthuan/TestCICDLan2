import org.testng.Assert;
import org.testng.annotations.Test;

import poly.edu.Calculator;

public class TestCalculator {
	@Test
	public void testSum() {
		Calculator cal = new Calculator();
		Assert.assertEquals(cal.sum(2, 3), 5);
	}
	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		Assert.assertEquals(cal.sub(2, 2), 0);
	}
}
