package com.bridgelabz.crud_operatuion.model;

import javax.persistence.Embeddable;
/**
 * PersonalInfo Embedded class which has the parameters of Personal Info
 * 
 * @author Durgasankar Mishra
 * @created 2020-04-04
 * @version 1.1
 */
@Embeddable
public class PersonalInfo {
    private String firstName;
    private String lastName;
    private String fatherName;
    private boolean isMarried;

    public PersonalInfo( String firstName, String lastName, String fatherName, boolean isMarried ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.isMarried = isMarried;
    }
    

    public PersonalInfo() {
		super();
	}


	public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName( String fatherName ) {
        this.fatherName = fatherName;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried( boolean married ) {
        isMarried = married;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
