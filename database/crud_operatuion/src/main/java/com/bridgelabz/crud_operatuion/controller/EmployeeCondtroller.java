package com.bridgelabz.crud_operatuion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.crud_operatuion.model.dto.EmployeeDto;
import com.bridgelabz.crud_operatuion.response.Response;
import com.bridgelabz.crud_operatuion.service.EmployeeService;
/**
 * By using the object reference of service class This class has the
 * functionality of getting connected with the employee on the employee specific request
 * it will redirect to the respective controller method and carry out
 * functionality of that particular request.
 * 
 * @author Durgasankar Mishra
 * @created 2020-04-04
 * @version 1.0
 * @see {@link Response} if there is any type of response it will reflect out
 * @see {@link EmployeeService}
 */
@RestController
@RequestMapping("employees")
public class EmployeeCondtroller {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("add")
    public ResponseEntity<Response> addNewEmployee( @RequestBody EmployeeDto employeeDto ) {
        if (!employeeService.addNewEmployee( employeeDto )) {
            return ResponseEntity.status( HttpStatus.ALREADY_REPORTED ).body( new Response( "Oops... Already exist", 208 ) );
        }
        return ResponseEntity.status( HttpStatus.OK ).body( new Response( "Employee registered Successfully", 200 ) );
    }
    
    @DeleteMapping("remove")
    public ResponseEntity<Response> removeEmployee( @RequestParam("emailId") final String emailId ) {
        if (!employeeService.removeEmployee( emailId )) {
            return ResponseEntity.status( HttpStatus.BAD_REQUEST ).body( new Response( "Oops... Employee not found", 400 ) );
        }
        return ResponseEntity.status( HttpStatus.OK ).body( new Response( "Employee removed Successfully", 200 ) );
    }
}
