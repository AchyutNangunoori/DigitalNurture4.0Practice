package MockitoExercise4;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

public class VoidClassTest {

	@Test
	public void test() {
		VoidClass sample=Mockito.mock(VoidClass.class);
		
		doNothing().when(sample).getData();
		
		sample.getData();
		
		verify(sample).getData();
		
	}

}