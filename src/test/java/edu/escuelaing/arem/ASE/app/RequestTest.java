package edu.escuelaing.arem.ASE.app;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RequestTest {

    @Test
    public void testEmptyQueryString() {
        Request req = new Request("");
        assertNull(req.getValues("name"));
    }

    @Test
    public void testNullQueryString() {
        Request req = new Request(null);
        assertNull(req.getValues("name"));
    }

    @Test
    public void testGetValues() {
        Request request = new Request("name=Juliana&age=20");
        assertEquals("Juliana", request.getValues("name"));
        assertEquals("20", request.getValues("age"));
    }


    @Test
    public void testGetValuesWithMalformedQuery() {
        Request request = new Request("name=Juliana&age");
        assertEquals("Juliana", request.getValues("name"));
        assertNull(request.getValues("age"));
    }
}
