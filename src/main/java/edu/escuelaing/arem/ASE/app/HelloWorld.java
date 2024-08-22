package edu.escuelaing.arem.ASE.app;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
    public static Map<String, Service> services = new HashMap<>();
    public static void main(String[] args) {
        get("/hello", (req, resp) -> "Hello " + req);
        get("/pi", (req, resp) -> {
            return String.valueOf(Math.PI);
        });
        String requestedurl = "/App/hello?name=Pedro";
        System.out.println(services.get("/pi").getValue("", ""));
        System.out.println(services.get("/hello").getValue("", ""));
    }

    public  static void get(String url, Service s) {
        services.put(url, s);
    }
}
