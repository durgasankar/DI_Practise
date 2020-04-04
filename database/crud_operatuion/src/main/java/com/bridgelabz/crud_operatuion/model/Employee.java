package com.bridgelabz.crud_operatuion.model;

import javax.persistence.*;
/**
 * Employee model which has the parameters which will hit with the database
 * 
 * @author Durgasankar Mishra
 * @created 2020-04-04
 * @version 1.1
 */
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    @Column(unique = true)
    private String emailId;
    @Embedded
    private PersonalInfo personalInfo;
    @Embedded
    private SalaryInfo salaryInfo;

    public Employee( long employeeId, String emailId, PersonalInfo personalInfo, SalaryInfo salaryInfo ) {
        this.employeeId = employeeId;
        this.emailId = emailId;
        this.personalInfo = personalInfo;
        this.salaryInfo = salaryInfo;
    }

    public Employee() {
        super();
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId( long employeeId ) {
        this.employeeId = employeeId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId( String emailId ) {
        this.emailId = emailId;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo( PersonalInfo personalInfo ) {
        this.personalInfo = personalInfo;
    }

    public SalaryInfo getSalaryInfo() {
        return salaryInfo;
    }

    public void setSalaryInfo( SalaryInfo salaryInfo ) {
        this.salaryInfo = salaryInfo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", emailId='" + emailId + '\'' +
                ", personalInfo=" + personalInfo +
                ", salaryInfo=" + salaryInfo +
                '}';
    }
}
