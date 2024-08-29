package edu.escuelaing.arem.ASE.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ResponseTest {

    @Test
    public void testSetAndGetBody() {
        Response response = new Response();
        response.setBody("test body");
        assertEquals("test body", response.getBody());
    }

    @Test
    public void testSetBodyWithNull() {
        Response response = new Response();
        response.setBody(null);
        assertNull(response.getBody());
    }

    @Test
    public void testSetBodyWithEmptyString() {
        Response response = new Response();
        response.setBody("");
        assertEquals("", response.getBody());
    }
}

