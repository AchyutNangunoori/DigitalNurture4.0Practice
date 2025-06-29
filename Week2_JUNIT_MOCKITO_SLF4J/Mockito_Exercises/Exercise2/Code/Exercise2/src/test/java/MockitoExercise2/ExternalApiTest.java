package MockitoExercise2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class ExternalApiTest {

	@Test
	public void test() {
		ExternalApi mock=Mockito.mock(ExternalApi.class);
		
		when(mock.getData(5)).thenReturn(25);
		
		Service service=new Service(mock);
		
		int result=service.getData(5);
		assertEquals(result,5*5);
		
		verify(mock).getData(5);
	}

}
