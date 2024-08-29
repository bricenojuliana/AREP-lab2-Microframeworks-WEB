package edu.escuelaing.arem.ASE.app;

public interface Service<T,R> {
    String getValue(Request request, Response response);
}
