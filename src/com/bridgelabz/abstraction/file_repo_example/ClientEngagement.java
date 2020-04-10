package com.bridgelabz.abstraction.file_repo_example;
/**
 * model class for Client
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-10
 */
public class ClientEngagement {
    private int id;
    private final String client;
    private final int hoursWorked;

    public ClientEngagement( final String client, final int hoursWorked ) {
        this.client = client;
        this.hoursWorked = hoursWorked;
    }

    public int getId() { return id; }

    public String getClient() { return client; }

    public int getHoursWorked() { return hoursWorked; }
}
