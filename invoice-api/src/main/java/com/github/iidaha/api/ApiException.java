package com.github.iidaha.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-04T11:06:55.649Z")

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
