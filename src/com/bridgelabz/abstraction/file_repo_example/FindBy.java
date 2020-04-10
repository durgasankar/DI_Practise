package com.bridgelabz.abstraction.file_repo_example;
/**
 * Model class main class which follows builder design pattern
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-10
 */
public class FindBy {
    private String client;
    private int atLeastHoursWorked;

    public String getClient() {
        return client;
    }

    public int getAtLeastHoursWorked() {
        return atLeastHoursWorked;
    }

    //    public void setClient( String client ) {
//        this.client = client;
//    }
//
//    public void setAtLeastHoursWorked( int atLeastHoursWorked ) {
//        this.atLeastHoursWorked = atLeastHoursWorked;
//    }


//    Enabling builder design pattern
    public FindBy client( String client ) {
        this.client = client;
        return this;
    }

    public FindBy atLeastHoursWorked( int atLeastHoursWorked ) {
        this.atLeastHoursWorked = atLeastHoursWorked;
        return this;
    }

}
