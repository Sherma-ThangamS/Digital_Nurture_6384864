import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.example.ExternalApi;
import org.example.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApiMocking() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);
        service.fetchData();

        verify(mockApi).getData();
    }

    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);
        service.fetchDataById(10);

        verify(mockApi).getDataById(eq(10));
    }

    @Test
    public void testVoidMethod() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doNothing().when(mockApi).deleteData();

        MyService service = new MyService(mockApi);
        service.removeData();

        verify(mockApi).deleteData();
    }

    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData())
                .thenReturn("First Call")
                .thenReturn("Second Call");

        MyService service = new MyService(mockApi);

        String firstResult = service.fetchData();
        String secondResult = service.fetchData();

        assertEquals("First Call", firstResult);
        assertEquals("Second Call", secondResult);
    }

    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);
        service.process();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).start();
        inOrder.verify(mockApi).execute();
        inOrder.verify(mockApi).finish();
    }

    @Test
    public void testVoidMethodWithException() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doThrow(new RuntimeException("Error occurred")).when(mockApi).deleteData();

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> {
            service.removeData();
        });

        verify(mockApi).deleteData();
    }
}
