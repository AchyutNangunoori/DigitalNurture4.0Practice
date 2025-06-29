package JunitExercise4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test4 {
	Operations ops;

	@Before
	public void setUp() throws Exception {
		ops = new Operations();
	}

	@After
	public void tearDown() throws Exception {
		ops = null;
	}

	@Test
	public void test() {
		int res = ops.addition(2, 3);
		assertEquals(res, 5);
	}

}
