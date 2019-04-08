package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumbers {

	@Test
	void test() {
		junitFunction junit =new junitFunction();
		int result = junit.addnumbers(100, 200);
		assertEquals (300,result);
	}

}
