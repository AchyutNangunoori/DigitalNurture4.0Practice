package MockitoExercise3;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class ExternalApiTest {

	@Test
	public void test() {
		
		ExternalApi mock=Mockito.mock(ExternalApi.class);
		
		when(mock.getData(4)).thenReturn(16);
		
		Service service=new Service(mock);
		
		int res =service.getData(4);
		assertEquals(res, 16);
		
		verify(mock).getData(eq(4));
		
	}
}