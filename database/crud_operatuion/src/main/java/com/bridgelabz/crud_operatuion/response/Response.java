package com.bridgelabz.crud_operatuion.response;

import com.bridgelabz.crud_operatuion.model.Employee;

import java.util.List;
/**
 * This class has the functionality of capturing response of employee which would be
 * recorded when user does any type of operation.
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-21
 * @version 1.0
 */
public class Response {

    private String message;
    private int statusCode;
    private Object object;
    private List<Employee> employeeList;

    public Response( String message, int statusCode ) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public Response( String message, int statusCode, Object object ) {
        this( message, statusCode );
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage( String message ) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode( int statusCode ) {
        this.statusCode = statusCode;
    }

    public Object getObject() {
        return object;
    }

    public void setObject( Object object ) {
        this.object = object;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList( List<Employee> employeeList ) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", statusCode=" + statusCode +
                ", object=" + object +
                ", employeeList=" + employeeList +
                '}';
    }
}
