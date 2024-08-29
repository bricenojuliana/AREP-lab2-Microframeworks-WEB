package edu.escuelaing.arem.ASE.app;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private Map<String, String> queryParams;

    public Request(String queryString) {
        queryParams = parseQueryString(queryString);
    }

    public String getValues(String key) {
        return queryParams.get(key);
    }

    private Map<String, String> parseQueryString(String queryString) {
        Map<String, String> params = new HashMap<>();
        if (queryString != null && !queryString.isEmpty()) {
            String[] pairs = queryString.split("&");
            for (String pair : pairs) {
                String[] keyValue = pair.split("=");
                if (keyValue.length == 2) {
                    params.put(keyValue[0], keyValue[1]);
                }
            }
        }
        return params;
    }
}
