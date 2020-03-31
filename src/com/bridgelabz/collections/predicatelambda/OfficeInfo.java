package com.bridgelabz.collections.predicatelambda;

import java.util.List;
/**
 * Model class for Office person
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-03-30
 * @see {@link Person}
 */
public class OfficeInfo {

    private String officeName;
    private List<Person> workersList;

    public OfficeInfo(String officeName, List<Person> workersList) {
        this.officeName = officeName;
        this.workersList = workersList;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public List<Person> getWorkersList() {
        return workersList;
    }

    public void setWorkersList(List<Person> workersList) {
        this.workersList = workersList;
    }

    @Override
    public String toString() {
        return "OfficeInfo{" +
                "officeName='" + officeName + '\'' +
                ", workersList=" + workersList +
                '}';
    }
}
