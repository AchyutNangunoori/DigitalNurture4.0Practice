package JunitExercise2;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationsTest {

	@Test
	public void test() {
		Operations ops = new Operations();
		int res = ops.addition(2, 3);
		assertEquals(res, 5);
	}

}
