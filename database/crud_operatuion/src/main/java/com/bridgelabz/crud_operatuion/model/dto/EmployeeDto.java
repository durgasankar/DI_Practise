package com.bridgelabz.crud_operatuion.model.dto;
/**
 * EmployeeDto Dto class which has the parameters given by user
 * 
 * @author Durgasankar Mishra
 * @created 2020-04-04
 * @version 1.1
 */
public class EmployeeDto {
    private String emailId;
    private PersonalInfoDto personalInfo;

    public EmployeeDto( String emailId, PersonalInfoDto personalInfo ) {
        this.emailId = emailId;
        this.personalInfo = personalInfo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId( String emailId ) {
        this.emailId = emailId;
    }

    public PersonalInfoDto getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo( PersonalInfoDto personalInfo ) {
        this.personalInfo = personalInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "emailId='" + emailId + '\'' +
                ", personalInfo=" + personalInfo +
                '}';
    }
}
