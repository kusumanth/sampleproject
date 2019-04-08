package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddstrings {

	@Test
	void test() {
		junitFunction junit =new junitFunction();
		String result = junit.addStrings("kusu","gali");
		assertEquals("kusugali",result);
	}

}
